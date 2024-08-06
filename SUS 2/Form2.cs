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
    public partial class lbletetreirofoda : Form
    {
        int minSenha = 0, seq = 0;
        string tipo, Hora;
        string Data = DateTime.Now.ToString("yyyy-MM-dd");

        private void Timer1_Tick(object sender, EventArgs e)
        {
            Thread.CurrentThread.CurrentCulture = new CultureInfo("pt-BR", false);
            DateTime dataEntrada = DateTime.Now;
            LbData.Text = dataEntrada.ToString("dd/MM/yyyy\n H:mm:ss");

            if (lbLetreiro.Location.X == 107)
            {
                lbLetreiro.Location = new Point(-460, lbLetreiro.Location.Y);
            }

            Task.Delay(1).Wait();
            lbLetreiro.Location = new Point(lbLetreiro.Location.X + 2, lbLetreiro.Location.Y);
        }

        private void PictureBox2_Click(object sender, EventArgs e)
        {
            tipo = "P";

            pegaSenha();
            if (minSenha == 0)
            {
                tipo = "N";
                pegaSenha();
                    

            }
            lbSenha.Text = tipo + minSenha;
            gravaChamada();
        }

        private void gravaChamada()
        {
            conexao comb = new conexao();

            comb.open();

            comb.sql = "Update tb01_senhas set ";
            comb.sql += " tb01_status = 's'";
            comb.sql += " where tb01_tipo = '" + tipo + "'";
            comb.sql += " and   tb01_numero = '" + minSenha + "'";

            int qt = comb.Runsql();

            comb.close();

        }

        private void pegaSenha()
        {
            conexao comb = new conexao();

            comb.open();

            comb.sql = "Select min(tb01_numero) from tb01_senhas ";
            comb.sql += " where tb01_tipo = '" + tipo + "'";
            comb.sql += " and   tb01_status = ' '";

            minSenha = Convert.ToInt32(comb.ExecEscalar());

            comb.close();
        }

        public lbletetreirofoda()
        {

            InitializeComponent();
        }
        
    }
}
