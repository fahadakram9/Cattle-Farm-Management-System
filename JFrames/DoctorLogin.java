/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import conn.JavaConnectDB;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import conn.JavaConnectDB;
import conn.JavaConnectDBROLE;
import java.sql.Connection;

/**
 *
 * @author rimsh
 */
public class DoctorLogin extends javax.swing.JFrame {

      Connection connection = null;
    OraclePreparedStatement preparedstatement = null;
    OracleResultSet resultset = null;
    String username = null;
    String password = null;
    
    /**
     * Creates new form DoctorLogin
     */
    public DoctorLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        DoctorUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DoctorLoginBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        DoctorLoginTitle = new javax.swing.JLabel();
        DoctorPassword = new javax.swing.JPasswordField();
        DoctorBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(DoctorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 190, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 60, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        DoctorLoginBtn.setBackground(new java.awt.Color(255, 255, 255));
        DoctorLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DoctorLoginBtn.setForeground(new java.awt.Color(0, 102, 102));
        DoctorLoginBtn.setText("LOGIN");
        DoctorLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorLoginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DoctorLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 140, 50));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DoctorLoginTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        DoctorLoginTitle.setForeground(new java.awt.Color(255, 255, 255));
        DoctorLoginTitle.setText("Doctor Login");
        jPanel2.add(DoctorLoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 90));
        jPanel1.add(DoctorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 190, 40));

        DoctorBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DoctorBack.setForeground(new java.awt.Color(0, 102, 102));
        DoctorBack.setText("back");
        DoctorBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorBackActionPerformed(evt);
            }
        });
        jPanel1.add(DoctorBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 100, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1010, 530);

        setSize(new java.awt.Dimension(647, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DoctorLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorLoginBtnActionPerformed
// getiing useranem and password from textfield and checking from data base and login 
        
        
username = DoctorUsername.getText();
password = DoctorPassword.getText();
 connection = JavaConnectDB.ConnectDB();
        
        try{
            String sql = "select username , password from DLogin where username = ? AND password = ? ";
            preparedstatement = (OraclePreparedStatement) connection.prepareStatement(sql);
            preparedstatement.setString(1,DoctorUsername.getText());
            preparedstatement.setString(2,DoctorPassword.getText());
            
            resultset = (OracleResultSet) preparedstatement.executeQuery();
           
            if(resultset.next() == false)
            {
               JOptionPane.showMessageDialog(null," login successfuly");
               DoctorRecord m = new DoctorRecord();
               m.username = this.username;
               m.password = this.password;
               m.setVisible(true);
               this.setVisible(false);
            }
            else
            {
                 JOptionPane.showMessageDialog(null," invalid login");
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_DoctorLoginBtnActionPerformed

    private void DoctorBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorBackActionPerformed
        // this button is for to visible previous creen and disclose the current screen

        new DistributorVisitorLogin().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_DoctorBackActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoctorBack;
    private javax.swing.JButton DoctorLoginBtn;
    private javax.swing.JLabel DoctorLoginTitle;
    private javax.swing.JPasswordField DoctorPassword;
    private javax.swing.JTextField DoctorUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
