/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Aluno
 */
public class Tela1 extends javax.swing.JFrame {

    Calendar now = Calendar.getInstance();
    Date dataHora = new Date();
int seq = 0;
    String tipo = "";
    /**
     * Creates new form Tela1
     */
    public Tela1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cruzdosus = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        botaosenha = new javax.swing.JButton();
        senha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ETEC");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 70));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 70));

        cruzdosus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cruzdosus.png"))); // NOI18N
        cruzdosus.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        getContentPane().add(cruzdosus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 50, 50));

        lbHora.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        getContentPane().add(lbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 70, 50));
        getContentPane().add(lbData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 70, 60));

        botaosenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaosenha.setText("Retire sua senha");
        botaosenha.setToolTipText("");
        botaosenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosenhaActionPerformed(evt);
            }
        });
        getContentPane().add(botaosenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 190, 70));

        senha.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 80, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel1.setText("SUS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/deficiente.jpg"))); // NOI18N
        jButton1.setText("botaodeficiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 350, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ImageIcon imag = new  ImageIcon(Tela1.class.getResource("/Imagens/cruzdosus.png"));
        Image IN = imag.getImage().getScaledInstance(cruzdosus.getWidth(), cruzdosus.getHeight(), Image.SCALE_DEFAULT);
        cruzdosus.setIcon(new ImageIcon(IN));
        
        

        
        
        
        
        
        
      SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        lbData.setText(dt.format(dataHora));
	
	Timer timer = new Timer(1000, new dataHora());
        timer.start();  

        
        
    }//GEN-LAST:event_formWindowOpened

    private void botaosenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosenhaActionPerformed
        // TODO add your handling code here:
        tipo = "N";
        GeraSenha(tipo);
        
    }//GEN-LAST:event_botaosenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         tipo = "P";
        GeraSenha(tipo);
    }//GEN-LAST:event_jButton1ActionPerformed
class dataHora implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae)
        {
               Calendar now = Calendar.getInstance();
               lbHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
        

        
            
    }
    private void GeraSenha (String tipo){
    seq ++;
    senha.setVisible(true);
      senha.setText("<html><br><p style='font-size:18px; text-align:center'>SENHA</p><br><br><p style='font-size:24px; text-align:center'>"+tipo+""+seq+"</p><br><br><p style='font-size:10px;  text-align:center'>"+lbData.getText()+"</p><p  style='font-size:10px; text-align:center'>"+lbHora.getText()+"</p></html>");
    movimento();
   
}
     public void movimento()
    {
        new Thread()
        {
            public void run()
            { 

               int y = 612;
               int x = 0;
               
                while(true)
                {
                    if( x < 179 )
                    {
                        x = x+1; 
                        senha.setLocation(y , x);  
                    }
                    try
                    {
                        sleep(6);
                    }
                    catch (Exception e)
                    {
                    }
                }
            }
            
        }.start();
    }    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaosenha;
    private javax.swing.JLabel cruzdosus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel senha;
    // End of variables declaration//GEN-END:variables
}
