#include <windows.h>                                    // for MS Windows
#include <GL/glut.h>                                    // GLUT, includes glu.h and gl.h
#include <bits/stdc++.h>
using namespace std;

#define PI acos(-1)

#define DAY 1
#define NIGHT 2
#define QUIT 3

static int obj = DAY;

void my_menu(int item)
{
    if (item == QUIT)
        exit(0);
    obj = item;
    glutPostRedisplay();
}

// Global variables
char title[] = "DX Ball";                               // Windowed mode's title
int windowWidth  = 480;                                 // Windowed mode's width
int windowHeight = 640;                                 // Windowed mode's height
int windowPosX   = 20;                                  // Windowed mode's top-left corner x
int windowPosY   = 50;                                  // Windowed mode's top-left corner y

GLfloat ballRadius = 0.05;                              // Radius of the bouncing ball
GLfloat ballX = 0.0;                                   // Ball's center (x, y) position
GLfloat ballY = 0.0;
GLfloat ballXMax, ballXMin, ballYMax, ballYMin;         // Ball's center (x, y) bounds
GLfloat xSpeed = 0.04;                                 // Ball's speed in x and y directions
GLfloat ySpeed = 0.02;
int refreshMillis = 30;                                 // Refresh period in milliseconds
int counter1=0,counter2=0;
int face_up=1,face_down=0;

// Projection clipping area
GLdouble clipAreaXLeft, clipAreaXRight, clipAreaYBottom, clipAreaYTop;

static float	tx1	=  0.0;
static float	ty1	=  0.0;
static float	tx2	=  0.0;
static float	ty2	=  0.0;

/* Initialize OpenGL Graphics */
void initGL()
{
    glClearColor(1.0, 1.0, 1.0, 1.0);                    // Set background (clear) color to black
}

/* Callback handler for window re-paint event */
void display()
{
    glClear(GL_COLOR_BUFFER_BIT);                        // Clear the color buffer
    glMatrixMode(GL_MODELVIEW);                          // To operate on the model-view matrix
    glLoadIdentity();                                    // Reset model-view matrix

    glPushMatrix();
    glColor3f(1.0, 0.0, 0.0);
    glTranslatef(tx1,ty1,0);
    glRectf(-0.3, 0.9, 0.3, 0.8);
    glPopMatrix();

    glPushMatrix();
    glColor3f(1.0, 0.0, 0.0);
    glTranslatef(tx2,ty2,0);
    glRectf(-0.3, -0.9, 0.3, -0.8);
    glPopMatrix();

    glTranslatef(ballX, ballY, 0.0);                    // Translate to (xPos, yPos)

    // Use triangular segments to form a circle
    glBegin(GL_TRIANGLE_FAN);
    glColor3f(0.0, 0.0, 1.0);                      // Blue
    glVertex2f(0.0, 0.0);                           // Center of circle
    int numSegments = 100;
    GLfloat angle;
    for (int i = 0; i <= numSegments; i++)            // Last vertex same as first vertex
    {
        angle = i * 2.0 * PI / numSegments;           // 360 deg for all segments
        glVertex2f(cos(angle) * ballRadius, sin(angle) * ballRadius);
    }

    glEnd();

    glutSwapBuffers();  // Swap front and back buffers (of double buffered mode)

    // Animation Control - compute the location for the next refresh
    ballX += xSpeed;
    ballY += ySpeed;

    // Check if the ball exceeds the edges
    if (ballX > ballXMax)
    {
        ballX = ballXMax;
        xSpeed = -xSpeed;
    }
    else if (ballX < ballXMin)
    {
        ballX = ballXMin;
        xSpeed = -xSpeed;
    }

    if (ballY > ballYMax)
    {
        ballY = ballYMax;
        ySpeed = -ySpeed;

        face_up=0;
        face_down=1;
    }
    else if(ballY>=0.8-ballRadius && ballY<=0.9-ballRadius && ballX>=tx1-0.3 && ballX<=tx1+0.3 && face_up==1)
    {
        ballY = 0.8-ballRadius;
        ySpeed = -ySpeed;

        face_up=0;
        face_down=1;

        counter1++;
        cout<<"Player 1: "<<counter1<<endl;
    }
    else if(ballY<=-0.8+ballRadius && ballY>=-0.9+ballRadius && ballX>=tx2-0.3 && ballX<=tx2+0.3 && face_down==1)
    {
        ballY = -0.8+ballRadius;
        ySpeed = -ySpeed;

        face_down=0;
        face_up=1;

        counter2++;
        cout<<"                    Player 2: "<<counter2<<endl;
    }
    else if (ballY < ballYMin)
    {
        ballY = ballYMin;
        ySpeed = -ySpeed;

        face_up=1;
        face_down=0;
    }

    switch (obj)
    {
    case DAY :
        glClearColor(1.0, 1.0, 1.0, 1.0);

        break;

    case NIGHT :
        glClearColor(0.0, 0.0, 0.0, 0.0);

        break;

    case QUIT :
        exit(0);
        break;
    }
}
void my_keyboard(unsigned char key, int x, int y)
{
    switch (key)
    {
    case 'a':
        tx1 -=0.1;

        if(tx1<=-0.7)
            tx1=-0.7;

        glutPostRedisplay();
        break;

    case 'd':
        tx1 +=0.1;

        if(tx1>=0.7)
            tx1=0.7;

        glutPostRedisplay();
        break;

    default:
        break;
    }
}
void spe_key(int key, int x, int y)
{
    switch (key)
    {
    case GLUT_KEY_LEFT:
        tx2 -=0.1;

        if(tx2<=-0.7)
            tx2=-0.7;

        glutPostRedisplay();
        break;

    case GLUT_KEY_RIGHT:
        tx2 +=0.1;

        if(tx2>=0.7)
            tx2=0.7;

        glutPostRedisplay();
        break;

    default:
        break;
    }
}

/* Call back when the windows is re-sized */
void reshape(GLsizei width, GLsizei height)
{
    // Compute aspect ratio of the new window
    if (height == 0)
        height = 1;                         // To prevent divide by 0
    GLfloat aspect = (GLfloat)width / (GLfloat)height;

    // Set the viewport to cover the new window
    glViewport(0, 0, width, height);

    // Set the aspect ratio of the clipping area to match the viewport
    glMatrixMode(GL_PROJECTION);                         // To operate on the Projection matrix
    glLoadIdentity();                                    // Reset the projection matrix

    if (width >= height)
    {
        clipAreaXLeft   = -1.0 * aspect;
        clipAreaXRight  = 1.0 * aspect;
        clipAreaYBottom = -1.0;
        clipAreaYTop    = 1.0;
    }
    else
    {
        clipAreaXLeft   = -1.0;
        clipAreaXRight  = 1.0;
        clipAreaYBottom = -1.0 / aspect;
        clipAreaYTop    = 1.0 / aspect;
    }
    gluOrtho2D(clipAreaXLeft, clipAreaXRight, clipAreaYBottom, clipAreaYTop);
    ballXMin = clipAreaXLeft + ballRadius;
    ballXMax = clipAreaXRight - ballRadius;
    ballYMin = clipAreaYBottom + ballRadius;
    ballYMax = clipAreaYTop - ballRadius;
}

/* Called back when the timer expired */
void Timer(int value)
{
    glutPostRedisplay();                                 // Post a paint request to activate display()
    glutTimerFunc(refreshMillis, Timer, 0);              // subsequent timer call at milliseconds
}

/* Main function: GLUT runs as a console application starting at main() */
int main(int argc, char** argv)
{
    glutInit(&argc, argv);                               // Initialize GLUT
    glutInitDisplayMode(GLUT_DOUBLE);                    // Enable double buffered mode
    glutInitWindowSize(windowWidth, windowHeight);       // Initial window width and height
    glutInitWindowPosition(windowPosX, windowPosY);      // Initial window top-left corner (x, y)
    glutCreateWindow(title);                             // Create window with given title

    glutDisplayFunc(display);                            // Register callback handler for window re-paint
    glutSpecialFunc(spe_key);
    //glutMouseFunc(my_mouse);
    glutKeyboardFunc(my_keyboard);
    glutCreateMenu(my_menu);
    glutAddMenuEntry("Day Mood",DAY);
    glutAddMenuEntry("Night Mood",NIGHT);
    glutAddMenuEntry("Quit", QUIT);
    glutAttachMenu(GLUT_RIGHT_BUTTON);

    glutReshapeFunc(reshape);                            // Register callback handler for window re-shape
    glutTimerFunc(0, Timer, 0);                          // First timer call immediately
    initGL();                                            // Our own OpenGL initialization

    glutMainLoop();                                      // Enter event-processing loop

    return 0;
}
