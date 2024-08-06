namespace SUS_2
{
    partial class lbletetreirofoda
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(lbletetreirofoda));
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.LbData = new System.Windows.Forms.Label();
            this.LbHora = new System.Windows.Forms.Label();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.lbLetreiro = new System.Windows.Forms.Label();
            this.lbSenha = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            this.SuspendLayout();
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(334, 70);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(409, 303);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // pictureBox2
            // 
            this.pictureBox2.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox2.Image")));
            this.pictureBox2.Location = new System.Drawing.Point(49, 205);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(100, 145);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox2.TabIndex = 1;
            this.pictureBox2.TabStop = false;
            this.pictureBox2.Click += new System.EventHandler(this.PictureBox2_Click);
            // 
            // LbData
            // 
            this.LbData.AutoSize = true;
            this.LbData.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.LbData.Location = new System.Drawing.Point(26, 387);
            this.LbData.Name = "LbData";
            this.LbData.Size = new System.Drawing.Size(2, 15);
            this.LbData.TabIndex = 2;
            // 
            // LbHora
            // 
            this.LbHora.AutoSize = true;
            this.LbHora.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.LbHora.Location = new System.Drawing.Point(29, 425);
            this.LbHora.Name = "LbHora";
            this.LbHora.Size = new System.Drawing.Size(2, 15);
            this.LbHora.TabIndex = 3;
            // 
            // timer1
            // 
            this.timer1.Enabled = true;
            this.timer1.Interval = 1;
            this.timer1.Tick += new System.EventHandler(this.Timer1_Tick);
            // 
            // lbLetreiro
            // 
            this.lbLetreiro.AutoSize = true;
            this.lbLetreiro.Location = new System.Drawing.Point(107, 13);
            this.lbLetreiro.Name = "lbLetreiro";
            this.lbLetreiro.Size = new System.Drawing.Size(171, 13);
            this.lbLetreiro.TabIndex = 4;
            this.lbLetreiro.Text = "A importância de se tratar do covid";
            // 
            // lbSenha
            // 
            this.lbSenha.AutoSize = true;
            this.lbSenha.Location = new System.Drawing.Point(510, 187);
            this.lbSenha.Name = "lbSenha";
            this.lbSenha.Size = new System.Drawing.Size(35, 13);
            this.lbSenha.TabIndex = 5;
            this.lbSenha.Text = "label1";
            // 
            // lbletetreirofoda
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lbSenha);
            this.Controls.Add(this.lbLetreiro);
            this.Controls.Add(this.LbHora);
            this.Controls.Add(this.LbData);
            this.Controls.Add(this.pictureBox2);
            this.Controls.Add(this.pictureBox1);
            this.Name = "lbletetreirofoda";
            this.Text = "Form2";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.Label LbData;
        private System.Windows.Forms.Label LbHora;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.Label lbLetreiro;
        private System.Windows.Forms.Label lbSenha;
    }
}