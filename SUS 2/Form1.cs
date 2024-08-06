using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SUS_2
{
    public partial class Form1 : Form
    {
        string tipo, Hora;
        int seq, maxSenha;
        string Data = DateTime.Now.ToString("yyyy-MM-dd");
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            Thread.CurrentThread.CurrentCulture = new CultureInfo("pt-BR", false);
            DateTime dataEntrada = DateTime.Now;
            lbData.Text = dataEntrada.ToString("dd/MM/yyyy\n H:mm:ss");
        }
        private void PegaSenha(string tipo)
        {
            conexao comb = new conexao();

            

            comb.open();

            comb.sql = "Select max(tb01_numero) from tb01_senhas ";
            comb.sql += " where tb01_tipo = '" + tipo + "'";

            maxSenha = Convert.ToInt32(comb.ExecEscalar());

            if (maxSenha > 0)
            {
                seq = maxSenha + 1;
            }
            else
            {
                seq = 1;
            }

            comb.close();
        }


        private void emiteSenha(string tipo)
        {
            lbSenha.Visible = true;


            lbSenha.Text = Environment.NewLine + "        SENHA" + Environment.NewLine + Environment.NewLine + Environment.NewLine;

            lbSenha.Text += "          " + tipo + seq;
            lbSenha.Text += Environment.NewLine + Environment.NewLine + Environment.NewLine + "    " + DateTime.Now.ToString("dd/MM/yyyy");
            lbSenha.Text += Environment.NewLine + "      " + Hora;

            lbSenha.Location = new Point(915, 160);

            for (int y = 1; y < 30; y++)
            {

                Task.Delay(10).Wait();
                lbSenha.Location = new Point(lbSenha.Location.X, lbSenha.Location.Y + 1);

            }
        }

        private void Button1_Click(object sender, EventArgs e)
        {
            tipo = "N: ";
            PegaSenha(tipo);
            emiteSenha(tipo);
            gravaBanco(tipo);
        }

        private void PictureBox2_Click_1(object sender, EventArgs e)
        {
            tipo = "P ";
            PegaSenha(tipo);
            emiteSenha(tipo);
            gravaBanco(tipo);

        }

        private void Button2_Click(object sender, EventArgs e)
        {
            lbletetreirofoda nt = new lbletetreirofoda();
            nt.Show();
        }

        private void gravaBanco(string tipo)
        {
            conexao inser = new conexao();

            inser.open();

           string lbData = DateTime.Now.ToString("yyyy-MM-dd");
           string lbHora = DateTime.Now.ToString("HH:mm:ss");

            inser.sql = "insert into tb01_senhas values (";
            inser.sql += "'" + tipo + "','" + seq + "','" + lbData + "','" + lbHora + "',' ')";

            int lin = inser.Runsql();

            inser.close();

        }


        private void pictureBox2_Click(object sender, EventArgs e)
        {
            
        }
    }
}
