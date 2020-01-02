#include <windows.h>                                    // for MS Windows
#include <GL/glut.h>                                    // GLUT, includes glu.h and gl.h
#include <bits/stdc++.h>
using namespace std;

#define pi acos(-1)

// Global variables
char title[] = "Walking in Rain";                               // Windowed mode's title
int windowWidth  = 640;                                 // Windowed mode's width
int windowHeight = 480;                                 // Windowed mode's height
int windowPosX   = 20;                                  // Windowed mode's top-left corner x
int windowPosY   = 50;                                  // Windowed mode's top-left corner y


int refreshMillis = 150;                                 // Refresh period in milliseconds
GLdouble clipAreaXLeft, clipAreaXRight, clipAreaYBottom, clipAreaYTop;

static float	tx	=  0.0;
static float	ty	=  0.0;
static float	ux	=  0.0;
static float	uy	=  0.0;
static float	xspeed	=  0.01;

#define START 1
#define PAUSE 2
#define QUIT 3

int pause=0;
static int obj = START;

void my_menu(int item)
{
    if (item == QUIT)
        exit(0);
    obj = item;
    glutPostRedisplay();
}

/* Initialize OpenGL Graphics */
void initGL()
{
    glClearColor(0.0, 0.0, 0.0, 0.0);                    // Set background (clear) color to black
}

void ground()
{
    glPushMatrix();
    glColor3f(1.0, 1.0, 1.0);
    glRectf(clipAreaXLeft, -1.05, clipAreaXRight, -1.06);
    glPopMatrix();
}

/*No Rain Under Umbrella*/
void bypass()
{
    glTranslatef(ux,uy,0);
    glPushMatrix();
    glColor3f(0.0, 0.0, 0.0);
    glRectf(-1.11, 0.0, -0.51, -1.05);
    glPopMatrix();
}
void man()
{
    /*Head*/
    glBegin(GL_POLYGON);
    glColor3f(1.0, 1.0, 1.0);                   // set the drawing color red

    float theta;

    for(int i=0; i<=360; i++)
    {
        theta = (i*pi)/180;

        glVertex2f(-0.94+0.07*cos(theta),-0.3+0.09*sin(theta));
    }
    glEnd();

    /*Body*/
    glPushMatrix();
    glColor3f(1.0, 1.0, 1.0);
    glRectf(-0.93, -0.8, -0.95, -0.4);
    glPopMatrix();

    /*Upper Arm*/
    glBegin(GL_POLYGON);
    glVertex2f(-0.95, -0.52);
    glVertex2f(-0.85, -0.52);
    glVertex2f(-0.85, -0.51);
    glVertex2f(-0.95, -0.51);
    glEnd();

    /*Upper Hand*/
    glBegin(GL_POLYGON);
    glVertex2f(-0.86, -0.51);
    glVertex2f(-0.82, -0.32);
    glVertex2f(-0.81, -0.30);
    glVertex2f(-0.85, -0.52);
    glEnd();


    /*Lower Arm*/
    glBegin(GL_POLYGON);
    glVertex2f(-0.95, -0.55);
    glVertex2f(-0.82, -0.55);
    glVertex2f(-0.82, -0.54);
    glVertex2f(-0.95, -0.54);
    glEnd();

    /*Lower Hand*/
    glBegin(GL_POLYGON);
    glVertex2f(-0.82, -0.55);
    glVertex2f(-0.81, -0.32);
    glVertex2f(-0.80, -0.30);
    glVertex2f(-0.81, -0.55);
    glEnd();

    /*Left Leg*/
    glBegin(GL_POLYGON);
    glVertex2f(-1.07, clipAreaYBottom+0.45);
    glVertex2f(-1.05, clipAreaYBottom+0.45);
    glVertex2f(-0.93, -0.8);
    glVertex2f(-0.95, -0.8);
    glEnd();

    /*Right Leg*/
    glBegin(GL_POLYGON);
    glVertex2f(-0.84, clipAreaYBottom+0.45);
    glVertex2f(-0.82, clipAreaYBottom+0.45);
    glVertex2f(-0.93, -0.8);
    glVertex2f(-0.95, -0.8);
    glEnd();
}

void rain()
{
    double xlength=0.005,ylength=0.03;
    int ck=0;

    for(int i=1 ; i<=100; i++)
    {
        double a = clipAreaXLeft + (clipAreaXRight - clipAreaXLeft) * rand() / ((double) RAND_MAX);

        for(double j=1 ; j<=4; j++)
        {
            double b = clipAreaYBottom+0.6 + (clipAreaYTop - clipAreaYBottom+0.6) * rand() / ((double) RAND_MAX);

            glPushMatrix();
            glColor3f(1.0, 1.0, 1.0);

            glTranslatef(tx,ty,0);
            //glTranslatef(tx2,ty2,0);

            glRectf(a, b, a+xlength, b+ylength);
            glPopMatrix();
        }
    }
}
void umbrella()
{
    /* Drawing circle*/
    glBegin(GL_POLYGON);
    glColor3f(0.0, 1.0, 0.0);                   // set the drawing color red

    float theta;

    for(int i=0; i<=180; i++)
    {
        theta = (i*pi)/180;
        glVertex2f(-0.81+0.3*cos(theta),0+0.3*sin(theta));
    }
    glEnd();
    glPushMatrix();
    glColor3f(1.0, 1.0, 1.0);
    glRectf(-0.805, -0.0, -0.82, -0.3);
    glPopMatrix();
}
/* Callback handler for window re-paint event */
void display()
{
    glClear(GL_COLOR_BUFFER_BIT);                        // Clear the color buffer
    glMatrixMode(GL_MODELVIEW);                          // To operate on the model-view matrix
    glLoadIdentity();                                    // Reset model-view matrix

    ground();
    rain();
    bypass();
    umbrella();
    man();

    glutSwapBuffers();  // Swap front and back buffers (of double buffered mode)

    // Animation Control - compute the location for the next refresh
    ty -= 0.1;
    ux += xspeed;

    if (ty <= -0.2)
        ty = 0.0;


    if (ux >= clipAreaXRight+0.8)
        ux = -0.4;

    if (ux <= -0.8)
        ux = clipAreaXRight+0.8;

    switch (obj)
    {
    case START :
        if(pause==1)
            xspeed=0.01;
            pause=0;
        break;

    case PAUSE :
        xspeed=0.0;
        pause=1;
        break;

    case QUIT :
        exit(0);
        break;
    }
}
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
    clipAreaYBottom -= 0.5;
    gluOrtho2D(clipAreaXLeft, clipAreaXRight, clipAreaYBottom, clipAreaYTop);
}
void spe_key(int key, int x, int y)
{
    switch (key)
    {
    case GLUT_KEY_UP:
        xspeed+=0.01;
        glutPostRedisplay();
        break;

    case GLUT_KEY_DOWN:
        xspeed-=0.01;
        glutPostRedisplay();
        break;

    default:
        break;
    }
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

    glutDisplayFunc(display);
    glutCreateMenu(my_menu);
    glutAddMenuEntry("Start",START);
    glutAddMenuEntry("Pause",PAUSE);
    glutAddMenuEntry("Quit", QUIT);
    glutAttachMenu(GLUT_RIGHT_BUTTON);                            // Register callback handler for window re-paint
    glutReshapeFunc(reshape);
    glutSpecialFunc(spe_key);
    glutTimerFunc(0, Timer, 0);                          // First timer call immediately
    initGL();                                            // Our own OpenGL initialization

    glutMainLoop();                                      // Enter event-processing loop

    return 0;
}
