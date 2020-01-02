using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace SMS
{
    public partial class Login_form : Form
    {
        public Login_form()
        {
            InitializeComponent();
            passwordtextbox.PasswordChar = '•';
        }

        private void loginbutton_Click(object sender, EventArgs e)
        {
            try
            {
                string Connection = @"Data Source=NAHIDHASAN\NAHIDHASAN;Initial Catalog=SMS;Integrated Security=True";
                SqlConnection Conn = new SqlConnection(Connection);
                SqlCommand Command = new SqlCommand("select * from Authenticate where Username='" + this.usernametextbox.Text + "' and Password='" + this.passwordtextbox.Text + "' ;",Conn);
                SqlDataReader Reader;

                Conn.Open();
                Reader = Command.ExecuteReader();
                int count = 0;
                while (Reader.Read())
                {
                    Console.WriteLine(Reader[count]);
                    count++;
                }
                if (count == 1)
                {
                    this.Hide();
                    Menu_form f2 = new Menu_form();
                    f2.ShowDialog();
                }
                else if (count > 1)
                {

                    MessageBox.Show("Duplicate Username and passwor.\nAccess denied.");
                }
                else
                {
                    MessageBox.Show("Username and password is incorrect.\nPleas try again.");
                }
                Conn.Close();

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void cancelbutton_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
