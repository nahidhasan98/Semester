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
    public partial class Update_form : Form
    {
        public Update_form()
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

        private void updatebutton_Click(object sender, EventArgs e)
        {
            try
            {
                string Connection2 = @"Data Source=NAHIDHASAN\NAHIDHASAN;Initial Catalog=SMS;Integrated Security=True";
                string Query = "Update Products set Product_Name='" + this.nametextbox.Text + "', Category='" + this.categorycombobox.Text + "', Unit_Price='" + this.pricetextbox.Text + "', Stock='" + this.stocktextbox.Text + "' where Product_ID='" + this.idtextbox.Text + "'";

                SqlConnection Conn2 = new SqlConnection(Connection2);
                SqlCommand Command2 = new SqlCommand(Query, Conn2);
                SqlDataReader Reader2;

                Conn2.Open();
                Reader2 = Command2.ExecuteReader();
                MessageBox.Show("Data Updated Successfully");
                disp_data();
                while (Reader2.Read())
                {

                }
                Conn2.Close();

                idtextbox.Text = "";
                nametextbox.Text = "";
                categorycombobox.Text = "";
                pricetextbox.Text = "";
                stocktextbox.Text = "";
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
        private void datagridview_MouseClick(object sender, MouseEventArgs e)
        {
            try
            {
                idtextbox.Text = datagridview.SelectedRows[0].Cells[0].Value.ToString();
                nametextbox.Text = datagridview.SelectedRows[0].Cells[1].Value.ToString();
                categorycombobox.Text = datagridview.SelectedRows[0].Cells[2].Value.ToString();
                pricetextbox.Text = datagridview.SelectedRows[0].Cells[3].Value.ToString();
                stocktextbox.Text = datagridview.SelectedRows[0].Cells[4].Value.ToString();
            }
            catch (Exception ex)
            {

                MessageBox.Show(ex.Message);
            }
        }
    }
}
