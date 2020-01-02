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
    public partial class Menu_form : Form
    {
        public Menu_form()
        {
            InitializeComponent();
        }

        private void viewbutton_Click(object sender, EventArgs e)
        {
            try
            {
                this.Hide();
                View_search_form f2 = new View_search_form();
                f2.ShowDialog();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void insertbutton_Click(object sender, EventArgs e)
        {
            try
            {
                this.Hide();
                Insert_form f2 = new Insert_form();
                f2.ShowDialog();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void updatebutton_Click(object sender, EventArgs e)
        {
            try
            {
                this.Hide();
                Update_form f2 = new Update_form();
                f2.ShowDialog();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void deletebutton_Click(object sender, EventArgs e)
        {
            try
            {
                this.Hide();
                Delete_form f2 = new Delete_form();
                f2.ShowDialog();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void backbutton_Click(object sender, EventArgs e)
        {
            this.Hide();
            Login_form f2 = new Login_form();
            f2.ShowDialog();
        }

        private void exitbutton_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
