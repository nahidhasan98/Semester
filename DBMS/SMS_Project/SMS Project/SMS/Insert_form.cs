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
    public partial class Insert_form : Form
    {
        public Insert_form()
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

        private void insertbutton_Click(object sender, EventArgs e)
        {
            try
            {
                string Connection2 = @"Data Source=NAHIDHASAN\NAHIDHASAN;Initial Catalog=SMS;Integrated Security=True";
                string Query = "insert into Products (Product_ID,Product_Name,Category,Unit_Price,Stock) values('" + this.idtextbox.Text + "','" + this.nametextbox.Text + "','" + this.categorycombobox.Text + "','" + this.pricetextbox.Text + "','" + this.stocktextbox.Text + "')";

                SqlConnection Conn2 = new SqlConnection(Connection2);
                SqlCommand Command2 = new SqlCommand(Query, Conn2);
                SqlDataReader Reader2;

                Conn2.Open();
                Reader2 = Command2.ExecuteReader();
                MessageBox.Show("Data Inserted Successfully");
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

        private void Insert_form_Load(object sender, EventArgs e)
        {

        }
    }
}
