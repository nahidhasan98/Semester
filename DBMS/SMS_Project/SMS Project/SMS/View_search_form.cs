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
    public partial class View_search_form : Form
    {
        public View_search_form()
        {
            InitializeComponent();
            disp_data();
        }
        public void disp_data()
        {
            try
            {
                string Connection = @"Data Source=NAHIDHASAN\NAHIDHASAN;Initial Catalog=SMS;Integrated Security=True";
                SqlConnection Conn = new SqlConnection(Connection);

                Conn.Open();
                string query = "select * from Products";
                SqlDataAdapter da = new SqlDataAdapter(query, Conn);
                DataTable dt = new DataTable();
                da.Fill(dt);
                datagridview.DataSource = dt;
                Conn.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void backbutton_Click(object sender, EventArgs e)
        {
            this.Hide();
            Menu_form f2 = new Menu_form();
            f2.ShowDialog();
        }

        private void exitbutton_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void idtextbox_TextChanged(object sender, EventArgs e)
        {
            nametextbox.Text = "";
            categorycombobox.Text = "";

            try
            {
                string Connection = @"Data Source=NAHIDHASAN\NAHIDHASAN;Initial Catalog=SMS;Integrated Security=True";
                SqlConnection Conn = new SqlConnection(Connection);

                Conn.Open();
                string query = "Select * from Products where Product_ID like '" + this.idtextbox.Text + "%'";
                SqlDataAdapter da = new SqlDataAdapter(query, Conn);
                DataTable dt = new DataTable();
                da.Fill(dt);
                datagridview.DataSource = dt;
                Conn.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void nametextbox_TextChanged(object sender, EventArgs e)
        {
            idtextbox.Text = "";
            categorycombobox.Text = "";

            try
            {
                string Connection = @"Data Source=NAHIDHASAN\NAHIDHASAN;Initial Catalog=SMS;Integrated Security=True";
                SqlConnection Conn = new SqlConnection(Connection);

                Conn.Open();
                string query = "Select * from Products where Product_Name like '" + this.nametextbox.Text + "%'";
                SqlDataAdapter da = new SqlDataAdapter(query, Conn);
                DataTable dt = new DataTable();
                da.Fill(dt);
                datagridview.DataSource = dt;
                Conn.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void categorycombobox_SelectedIndexChanged(object sender, EventArgs e)
        {
            idtextbox.Text = "";
            nametextbox.Text = "";

            try
            {
                string Connection = @"Data Source=NAHIDHASAN\NAHIDHASAN;Initial Catalog=SMS;Integrated Security=True";
                SqlConnection Conn = new SqlConnection(Connection);

                Conn.Open();
                string query = "Select * from Products where Category like '" + this.categorycombobox.Text + "%'";
                SqlDataAdapter da = new SqlDataAdapter(query, Conn);
                DataTable dt = new DataTable();
                da.Fill(dt);
                datagridview.DataSource = dt;
                Conn.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
