/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import BL.Customer;
import conn.ManagerCustomerLogin;
import conn.JavaConnectDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;


/**
 *
 * @author rimsh
 */
public class CustomerRecord extends javax.swing.JFrame {
    
    
 


  
    public CustomerRecord() {
        initComponents();
        Updated_Table();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        CustomerTitle = new javax.swing.JLabel();
        CustomerRecordTitle = new javax.swing.JLabel();
        CustomerID = new javax.swing.JLabel();
        CustomerNAME = new javax.swing.JLabel();
        CustomerEMAIL = new javax.swing.JLabel();
        CustomerId = new javax.swing.JTextField();
        CustomerName = new javax.swing.JTextField();
        CustomerEmail = new javax.swing.JTextField();
        CustomerAdd = new javax.swing.JButton();
        CustomerUpdate = new javax.swing.JButton();
        CustomerTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CustomerCNIC = new javax.swing.JLabel();
        CustomerNIC = new javax.swing.JTextField();
        CustomerPHONE = new javax.swing.JLabel();
        CustomerPhone = new javax.swing.JTextField();
        CustomerLogout = new javax.swing.JButton();
        CustomerADDRESS = new javax.swing.JLabel();
        CustomerAddress = new javax.swing.JTextField();
        CustomerOrders = new javax.swing.JButton();
        CustomerComplains = new javax.swing.JButton();
        CustomerDelete = new javax.swing.JButton();
        CustomerProducts = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel3.setLayout(null);

        CustomerTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        CustomerTitle.setForeground(new java.awt.Color(0, 102, 102));
        CustomerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerTitle.setText("Cutomer");
        jPanel3.add(CustomerTitle);
        CustomerTitle.setBounds(90, 50, 170, 50);

        CustomerRecordTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CustomerRecordTitle.setForeground(new java.awt.Color(0, 102, 102));
        CustomerRecordTitle.setText("Customers Records");
        jPanel3.add(CustomerRecordTitle);
        CustomerRecordTitle.setBounds(660, 90, 220, 30);

        CustomerID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CustomerID.setForeground(new java.awt.Color(0, 102, 102));
        CustomerID.setText("ID");
        jPanel3.add(CustomerID);
        CustomerID.setBounds(70, 140, 19, 22);

        CustomerNAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CustomerNAME.setForeground(new java.awt.Color(0, 102, 102));
        CustomerNAME.setText("Name");
        jPanel3.add(CustomerNAME);
        CustomerNAME.setBounds(40, 240, 90, 22);

        CustomerEMAIL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CustomerEMAIL.setForeground(new java.awt.Color(0, 102, 102));
        CustomerEMAIL.setText("Email");
        jPanel3.add(CustomerEMAIL);
        CustomerEMAIL.setBounds(30, 290, 90, 22);
        jPanel3.add(CustomerId);
        CustomerId.setBounds(140, 140, 170, 30);
        jPanel3.add(CustomerName);
        CustomerName.setBounds(140, 240, 170, 30);

        CustomerEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerEmailActionPerformed(evt);
            }
        });
        jPanel3.add(CustomerEmail);
        CustomerEmail.setBounds(140, 290, 170, 30);

        CustomerAdd.setBackground(new java.awt.Color(0, 102, 102));
        CustomerAdd.setForeground(new java.awt.Color(255, 255, 255));
        CustomerAdd.setText("ADD");
        CustomerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerAddActionPerformed(evt);
            }
        });
        jPanel3.add(CustomerAdd);
        CustomerAdd.setBounds(40, 560, 100, 40);

        CustomerUpdate.setBackground(new java.awt.Color(0, 102, 102));
        CustomerUpdate.setForeground(new java.awt.Color(255, 255, 255));
        CustomerUpdate.setText("Update");
        CustomerUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(CustomerUpdate);
        CustomerUpdate.setBounds(160, 560, 100, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        CustomerTable.setViewportView(jTable1);

        jPanel3.add(CustomerTable);
        CustomerTable.setBounds(490, 160, 550, 400);

        CustomerCNIC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CustomerCNIC.setForeground(new java.awt.Color(0, 102, 102));
        CustomerCNIC.setText("CNIC");
        jPanel3.add(CustomerCNIC);
        CustomerCNIC.setBounds(60, 190, 60, 22);
        jPanel3.add(CustomerNIC);
        CustomerNIC.setBounds(140, 190, 170, 30);

        CustomerPHONE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CustomerPHONE.setForeground(new java.awt.Color(0, 102, 102));
        CustomerPHONE.setText("Phone Number");
        jPanel3.add(CustomerPHONE);
        CustomerPHONE.setBounds(20, 340, 120, 22);
        jPanel3.add(CustomerPhone);
        CustomerPhone.setBounds(140, 340, 170, 30);

        CustomerLogout.setBackground(new java.awt.Color(255, 255, 204));
        CustomerLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CustomerLogout.setForeground(new java.awt.Color(0, 102, 102));
        CustomerLogout.setText("Logout");
        CustomerLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerLogoutActionPerformed(evt);
            }
        });
        jPanel3.add(CustomerLogout);
        CustomerLogout.setBounds(1060, 320, 110, 40);

        CustomerADDRESS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CustomerADDRESS.setForeground(new java.awt.Color(0, 102, 102));
        CustomerADDRESS.setText("Address");
        jPanel3.add(CustomerADDRESS);
        CustomerADDRESS.setBounds(40, 400, 70, 30);
        jPanel3.add(CustomerAddress);
        CustomerAddress.setBounds(140, 400, 170, 30);

        CustomerOrders.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CustomerOrders.setForeground(new java.awt.Color(0, 102, 102));
        CustomerOrders.setText("Orders");
        CustomerOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerOrdersActionPerformed(evt);
            }
        });
        jPanel3.add(CustomerOrders);
        CustomerOrders.setBounds(1060, 400, 110, 40);

        CustomerComplains.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CustomerComplains.setForeground(new java.awt.Color(0, 102, 102));
        CustomerComplains.setText("Complains");
        CustomerComplains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerComplainsActionPerformed(evt);
            }
        });
        jPanel3.add(CustomerComplains);
        CustomerComplains.setBounds(1060, 470, 110, 40);

        CustomerDelete.setBackground(new java.awt.Color(0, 102, 102));
        CustomerDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CustomerDelete.setForeground(new java.awt.Color(255, 255, 255));
        CustomerDelete.setText("Delete");
        CustomerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(CustomerDelete);
        CustomerDelete.setBounds(280, 560, 90, 40);

        CustomerProducts.setText("Products");
        CustomerProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerProductsActionPerformed(evt);
            }
        });
        jPanel3.add(CustomerProducts);
        CustomerProducts.setBounds(1060, 530, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1406, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
     public void connection (Connection connection) throws ClassNotFoundException{ //establishing conncetion with oracle
        
       // This function is for creating connection with oracle database
        
        try {
            Class.forName("oracle.jdbc.OracleDriver"); // defining the oracle driver 
             connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rimsha", "rimsha", "rimsha"); // establishing connection with user in orcale database
        } 
        
        catch (SQLException ex) { // throwing exception if thus user is not available
            
            Logger.getLogger(ComplainsRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    private void CustomerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerAddActionPerformed
     //adding data from texfield into database table columns
        
        try{
       Connection connection = null;
       connection(connection);
        String sql="insert into CUSTOMER"+"(C_ID,C_NAME,C_PHONE,C_EMAILADDRESS,C_CNIC,C_ADDRESS)"+"values(?,?,?,?,?,?)";
        PreparedStatement  preparedstatement =connection.prepareStatement(sql);
        int a=(int) Integer.parseInt(CustomerId.getText());
        
         preparedstatement.setInt(1, a);
 
         preparedstatement.setString(2, CustomerName.getText());
         preparedstatement.setString(3, CustomerPhone.getText());
         preparedstatement.setString(4, CustomerEmail.getText());
         preparedstatement.setString(5, CustomerNIC.getText());
         preparedstatement.setString(6, CustomerAddress.getText());
         preparedstatement.executeUpdate();
        JOptionPane.showMessageDialog(this,"Successfully Inserted!");
       }
       catch(Exception e)
       {JOptionPane.showMessageDialog(this,e.getMessage());
       }
    
        
     Updated_Table();
        
        
    }//GEN-LAST:event_CustomerAddActionPerformed

    private void CustomerUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerUpdateActionPerformed
// updating data from texfield into database table columns
        
         try{
      Connection connection = null;
       connection(connection);
        String sql="Update CUSTOMER set C_NAME =?,C_PHONE=?,C_EMAILADDRESS=?,C_CNIC=?,C_ADDRESS=?"+" where C_ID =?";
        PreparedStatement  preparedstatement =connection.prepareStatement(sql);
        
         preparedstatement.setString(1, CustomerName.getText());
         preparedstatement.setString(2, CustomerPhone.getText());
         preparedstatement.setString(3, CustomerEmail.getText());
        preparedstatement.setString(4, CustomerNIC.getText());
         preparedstatement.setString(4, CustomerAddress.getText());
         int a=(int) Integer.parseInt(CustomerId.getText());
        preparedstatement.setInt(5, a);
         preparedstatement.executeUpdate();
        JOptionPane.showMessageDialog(this,"Successfully Updated!");
       }
       catch(Exception e)
       {JOptionPane.showMessageDialog(this,e.getMessage());
       }  
              
       Updated_Table();

    }//GEN-LAST:event_CustomerUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

       
    }//GEN-LAST:event_jTable1MouseClicked

    private void CustomerLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerLogoutActionPerformed
     // this button is for to visible previous creen and disclose the current screen
        
        new ManagerCustomerLogin().setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_CustomerLogoutActionPerformed

    private void CustomerEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerEmailActionPerformed

    private void CustomerOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerOrdersActionPerformed
        // this button is for to visible previous creen and disclose the current screen
        
        new OrdersRecords().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomerOrdersActionPerformed

    private void CustomerComplainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerComplainsActionPerformed
        // this button is for to visible previous creen and disclose the current screen
        
        new ComplainsRecord().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomerComplainsActionPerformed

    
    
    public void Updated_Table()
{
    try{
       Class.forName("oracle.jdbc.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rimsha", "rimsha", "rimsha");
        String sql="Select * from CUSTOMER";
        PreparedStatement  preparedstatement =null;
         preparedstatement =connection.prepareStatement(sql);
        ResultSet resultset=null;
        resultset= preparedstatement.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(resultset));
      
       }
       catch(Exception e)
       {JOptionPane.showMessageDialog(this,e.getMessage());
       }  
}
    
    
    
  
    
    
    private void CustomerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerDeleteActionPerformed
        
        // establishing conncetion with oracle and deleting data in database table columns
        
         try{
        Class.forName("oracle.jdbc.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rimsha", "rimsha", "rimsha");
        String sql="delete from CUSTOMER where C_ID=?";
        PreparedStatement  preparedstatement=connection.prepareStatement(sql);
        int a=(int) Double.parseDouble(CustomerId.getText());
         preparedstatement.setInt(1, a);
         preparedstatement.executeUpdate();
        JOptionPane.showMessageDialog(this,"Successfully Deleted!");
       }
       catch(Exception e)
       {JOptionPane.showMessageDialog(this,e.getMessage());
       }
    }//GEN-LAST:event_CustomerDeleteActionPerformed

    private void CustomerProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerProductsActionPerformed
       // this button is for to visible previous creen and disclose the current screen

        new ProductsRecord().setVisible(true);
this.dispose();

        
    }//GEN-LAST:event_CustomerProductsActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerADDRESS;
    private javax.swing.JButton CustomerAdd;
    private javax.swing.JTextField CustomerAddress;
    private javax.swing.JLabel CustomerCNIC;
    private javax.swing.JButton CustomerComplains;
    private javax.swing.JButton CustomerDelete;
    private javax.swing.JLabel CustomerEMAIL;
    private javax.swing.JTextField CustomerEmail;
    private javax.swing.JLabel CustomerID;
    private javax.swing.JTextField CustomerId;
    private javax.swing.JButton CustomerLogout;
    private javax.swing.JLabel CustomerNAME;
    private javax.swing.JTextField CustomerNIC;
    private javax.swing.JTextField CustomerName;
    private javax.swing.JButton CustomerOrders;
    private javax.swing.JLabel CustomerPHONE;
    private javax.swing.JTextField CustomerPhone;
    private javax.swing.JButton CustomerProducts;
    private javax.swing.JLabel CustomerRecordTitle;
    private javax.swing.JScrollPane CustomerTable;
    private javax.swing.JLabel CustomerTitle;
    private javax.swing.JButton CustomerUpdate;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
