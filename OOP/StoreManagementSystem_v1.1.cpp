#include<iostream>
#include<iomanip>                       //For using setw() function.
#include<cstdlib>                       //For using exit() function.
using namespace std;

string pass="12345";                    //Defining a default password for entering admin panel.

void admin();                           //Declaring Admin menu function.
void customer();                        //Declaring Customer menu function.
int security();                         //Declaring Admin password checking function.
void menu();                            //Declaring Menu function.
void display();                         //Declaring Product list showing function.
void entry();                           //Declaring product entry function.
void sale();                            //Declaring product selling function.
void selling_list();                    //Declaring sold product list showing function.

/*It is base class.*/
class product
{
protected:                              //Here, encapsulation is done.
    string code;
    double price;
public:                                 //Public members.
    string name;
    int quantity;

    void set_code(string x){code=x;}        //Getting & setting value.
    string get_code(){return code;}

    void set_price(double y){price=y;}
    double get_price(){return price;}

    void set_name(string z){name=z;}
    string get_name(){return name;}

    void set_quantity(int w){quantity=w;}
    int get_quantity(){return quantity;}
};

/*Derived class as public.*/
class foods:public product
{
public:                                         //Public members.
    string flavour;
    double n_facts;

    void set_flavour(string y){flavour=y;}      //Getting & setting value.
    string get_flavour(){return flavour;}

    void set_n_facts(double x){n_facts=x;}
    double get_n_facts(){return n_facts;}

    void show(){cout<<left<<setw(15)<<get_code()<<right<<setw(17)<<get_name()<<right<<setw(16)<<get_price()<<right<<setw(20)<<get_quantity()<<right<<setw(16)<<get_flavour()<<right<<setw(28)<<get_n_facts()<<"\n";}            //Display values.
};

/*Derived class as public.*/
class goods:public product
{
public:                                             //Public members.
    string colour;
    string m_company;

    void set_colour(string x){colour=x;}            //Getting & setting value.
    string get_colour(){return colour;}

    void set_m_company(string y){m_company=y;}
    string get_m_company(){return m_company;}

    void show(){cout<<left<<setw(15)<<get_code()<<right<<setw(17)<<get_name()<<right<<setw(16)<<get_price()<<right<<setw(20)<<get_quantity()<<right<<setw(16)<<get_colour()<<right<<setw(28)<<get_m_company()<<"\n";}           //Display values.
} ;

/*Main function*/
int  main()
{
    cout<<"Welcome To The Shop Management System Software...\n";    //Welcome text.
    menu();                                                         //Calling menu function.

    return 0;                                                       //Ending process of program.
}

/*Global declaration of variable & objects*/
int i,choice;
foods ob1[20];                              //Derived class object.
goods ob2[20];                              //Derived class object.
product pd[20];                             //Base class object.

/*Defining Menu function*/
void menu()
{
    cout<<"\nMain Menu:\n";                     //Showing menu list.
    cout<<"1. Admin Panel\n";
    cout<<"2. Customer Panel\n";
    cout<<"\nPlease select an option:\t";
    cin>>choice;                                //Taking choice from user.

    switch(choice)
    {
    case 1:
        if(security()==1)                       //Calling security function to check password.
            cout<<"\nPassword matched.\n";
            admin();                            //If password is matched, only then admin function will be executed.
        break;
    case 2:
        customer();                             //Calling customer function.
        break;
    default:
        cout<<"\nInvalid selection. Try again:\n";
        menu();
        break;
    }
}

/*Defining admin function*/
void admin()
{
    cout<<"\nAdmin Menu:\n";                        //Showing Admin menu.
    cout<<"1. View Product List.\n";
    cout<<"2. Entry A New Product.\n";
    cout<<"3. Sale.\n";
    cout<<"4. Sold Products List.\n";
    cout<<"5. Return To Main Menu.\n";
    cout<<"\nPlease select an option:\t";

    cin>>choice;                                    //Taking choice from user.

    switch(choice)
    {
    case 1:
        display();                                  //Calling display function.
        admin();                                    //Calling admin function. After executing display function, admin function will be executed.
        break;
    case 2:
        entry();                                    //Calling entry function.
        admin();                                    //Calling admin function. After executing display function, admin function will be executed.
        break;
    case 3:
        sale();                                     //Calling sale function.
        admin();                                    //Calling admin function. After executing display function, admin function will be executed.
        break;
    case 4:
        selling_list();                             //Calling selling_list function.
        admin();                                    //Calling admin function. After executing display function, admin function will be executed.
        break;
    case 5:
        menu();
        break;
    default:
        cout<<"\nInvalid Selection.\n";
        admin();
        break;
    }
}

/*Defining customer function*/
void customer()
{
    cout<<"\nHere Is The Available Product List.\n";
    display();                                      //Calling display function.
    exit(0);
}

/*Defining password checking function*/
int security()
{
    cout<<"\nAdmin selected.\tEnter Password to Enter Admin Panel:\t";
    string word;
    cin>>word;
    if(word==pass)                                  //Matching user given password with default password.
        return 1;
    else
    {
        cout<<"\nWrong password. Try again:\n";
        menu();
    }
}

/*Defining display/product list showing function*/
void display()
{
    cout<<"\n\n                      ======================= Product List =======================\n\n";
    cout<<"\n"<<left<<setw(15)<<"Product Code"<<right<<setw(17)<<"Product Name"<<right<<setw(16)<<"Unit Price"<<right<<setw(20)<<"Stock Quantity"<<right<<setw(16)<<"Flavour"<<right<<setw(28)<<"Energy (Kcal/100gm)\n\n";
    for(i=0;i<20;i++)
    {                                                   //For foods list.
        if(ob1[i].get_price()!=0)                       //Price 0 means, no product in that array. So no need to be printed.
            ob1[i].show();                              //Calling class function with object for printing product list.
    }
    cout<<"\n\n\n"<<left<<setw(15)<<"Product Code"<<right<<setw(17)<<"Product Name"<<right<<setw(16)<<"Unit Price"<<right<<setw(20)<<"Stock Quantity"<<right<<setw(16)<<"Colour"<<right<<setw(28)<<"Company\n\n";
    for(i=0;i<20;i++)
    {                                                   //For goods list.
        if(ob2[i].get_price()!=0)                       //Price 0 means, no product in that array. So no need to be printed.
            ob2[i].show();                              //Calling class function with object for printing product list.
    }
}

/*Defining product entry function*/
void entry()
{
    int quantity;
    double price,n_facts;
    string code,name,flavour,colour,m_company;

    for(i=i;i<20;i++)
    {
        cout<<"\nEnter the product code (product code starts with f or g):\t";
        cin>>code;

        if(code[0]=='f')                                        //Checking whether product type is foods or goods.
        {                                                       //Entry foods information.
            ob1[i].set_code(code);                              //Passing parameters in objects.
            cout<<"\nEnter the product name:\t";
            cin>>name;
            ob1[i].set_name(name);
            cout<<"\nEnter unit price:\t";
            cin>>price;
            ob1[i].set_price(price);
            cout<<"\nEnter available stock quantity:\t";
            cin>>quantity;
            ob1[i].set_quantity(quantity);
            cout<<"\nEnter food flavour:\t";
            cin>>flavour;
            ob1[i].set_flavour(flavour);
            cout<<"\nEnter nutritional facts (Energy in Kcal/100gm):\t";
            cin>>n_facts;
            ob1[i].set_n_facts(n_facts);
        }
        else
        {                                                       //Entry goods information.
            ob2[i].set_code(code);                              //Passing parameters in objects.
            cout<<"\nEnter the product name:\t";
            cin>>name;
            ob2[i].set_name(name);
            cout<<"\nEnter unit price:\t";
            cin>>price;
            ob2[i].set_price(price);
            cout<<"\nEnter available stock quantity:\t";
            cin>>quantity;
            ob2[i].set_quantity(quantity);
            cout<<"\nEnter colour:\t";
            cin>>colour;
            ob2[i].set_colour(colour);
            cout<<"\nEnter manufacture company name:\t";
            cin>>m_company;
            ob2[i].set_m_company(m_company);
        }

        cout<<"\nProduct entry successful.\n\nPress 1 to entry another product or\nPress 0 to return to the admin menu:\t";

        cin>>choice;

        if(choice==1)
            continue;                                               //For continuing product entry.
        else if(choice==0)
            admin();                                                //Else going back to Admin menu.
            break;
    }
}

/*Defining product selling function*/
void sale()
{
    cout<<"\nEnter the product code to sell:\t";
    string sell;
    cin>>sell;
    for(i=0;i<20;i++)
    {
        if(ob1[i].get_price()!=0 || ob2[i].get_price()!=0)                      //Price 0 means, no product in that array. So no need to be checked.
        {
            if(sell==ob1[i].get_code() || sell==ob2[i].get_code())              //Matching user given code with existing product code in product list.
            {
                if(sell[0]=='f')                                                //For foods item sell.
                {
                    cout<<"\nEnter the quantity:\t";
                    int quantity;
                    cin>>quantity;
                    ob1[i].set_quantity(ob1[i].get_quantity()-quantity);
                    cout<<"\nDone.\tTotal price: "<<ob1[i].get_price()*quantity<<"Taka.\n";

                    pd[i].set_code(ob1[i].get_code());                          //Passing selling item info to the base class with objects for showing sold item list.
                    pd[i].set_name(ob1[i].get_name());
                    pd[i].set_quantity(quantity);
                    pd[i].set_price(ob1[i].get_price()*quantity);

                    cout<<"\n\nPress 1 to sell another product or\nPress 0 to return to the admin menu:\t";
                    cin>>choice;
                    if(choice==1)
                        continue;                                                   //For continuing product sell.
                    else if(choice==0)
                        admin();                                                    //Else going back to Admin menu.
                        break;
                }
                else                                                             //For goods item sell.
                    {
                    cout<<"\nEnter the quantity:\t";
                    int quantity;
                    cin>>quantity;
                    ob2[i].set_quantity(ob2[i].get_quantity()-quantity);
                    cout<<"\nDone.\tTotal price: "<<ob2[i].get_price()*quantity<<"Taka.\n";

                    pd[i].set_code(ob2[i].get_code());                          //Passing selling item info to the base class with objects for showing sold item list.
                    pd[i].set_name(ob2[i].get_name());
                    pd[i].set_quantity(quantity);
                    pd[i].set_price(ob2[i].get_price()*quantity);

                    cout<<"\n\nPress 1 to sell another product or\nPress 0 to return to the admin menu:\t";
                    cin>>choice;
                    if(choice==1)
                        continue;                                               //For continuing product sell.
                    else if(choice==0)
                        admin();                                                //Else going back to Admin menu.
                        break;
                    }
            }
        }
    }
    cout<<"\nNo products found with this product code. Try again.\n";
    sale();                                                                     //If no product matched in the list then again return to the product selling function.
}

/*Defining sold product list showing function*/
void selling_list()
{
    cout<<"\n\n\                ======= Here is the sold product list =======\n\n";
    cout<<"\n"<<left<<setw(15)<<"Product Code"<<right<<setw(17)<<"Product Name"<<right<<setw(16)<<"Quantity"<<right<<setw(20)<<"Total Taka\n\n";
    for(i=0;i<20;i++)
    {
        if(pd[i].get_quantity()!=0)                                             //Price 0 means, no product in that array. So no need to be printed.
            cout<<left<<setw(15)<<pd[i].get_code()<<right<<setw(17)<<pd[i].get_name()<<right<<setw(16)<<pd[i].get_quantity()<<right<<setw(20)<<pd[i].get_price()<<"\n";
    }
}
