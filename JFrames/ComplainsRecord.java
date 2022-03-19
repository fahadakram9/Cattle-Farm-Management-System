
package Jframe;

import BL.Complains;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class ComplainsRecord extends javax.swing.JFrame {

   
    public ComplainsRecord() {
        initComponents();
          Updated_Table();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        ComplainHeading = new javax.swing.JLabel();
        ComplainRrecordHeading = new javax.swing.JLabel();
        ComplainId = new javax.swing.JLabel();
        ProductId = new javax.swing.JLabel();
        ComplainID = new javax.swing.JTextField();
        ProductID = new javax.swing.JTextField();
        ComplainAddBtn = new javax.swing.JButton();
        TablePane = new javax.swing.JScrollPane();
        ComplainTABLE = new javax.swing.JTable();
        ComplainDate = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        ComplainDes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        COMPLAINDES = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel3.setLayout(null);

        ComplainHeading.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ComplainHeading.setForeground(new java.awt.Color(0, 102, 102));
        ComplainHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ComplainHeading.setText("Complians");
        jPanel3.add(ComplainHeading);
        ComplainHeading.setBounds(90, 50, 170, 50);

        ComplainRrecordHeading.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ComplainRrecordHeading.setForeground(new java.awt.Color(0, 102, 102));
        ComplainRrecordHeading.setText("Complains record");
        jPanel3.add(ComplainRrecordHeading);
        ComplainRrecordHeading.setBounds(660, 90, 220, 30);

        ComplainId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComplainId.setForeground(new java.awt.Color(0, 102, 102));
        ComplainId.setText("ID");
        jPanel3.add(ComplainId);
        ComplainId.setBounds(70, 180, 19, 22);

        ProductId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ProductId.setForeground(new java.awt.Color(0, 102, 102));
        ProductId.setText("P_ID");
        jPanel3.add(ProductId);
        ProductId.setBounds(40, 240, 90, 22);
        jPanel3.add(ComplainID);
        ComplainID.setBounds(140, 170, 170, 30);
        jPanel3.add(ProductID);
        ProductID.setBounds(140, 230, 170, 30);

        ComplainAddBtn.setBackground(new java.awt.Color(0, 102, 102));
        ComplainAddBtn.setForeground(new java.awt.Color(255, 255, 255));
        ComplainAddBtn.setText("ADD");
        ComplainAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComplainAddBtnActionPerformed(evt);
            }
        });
        jPanel3.add(ComplainAddBtn);
        ComplainAddBtn.setBounds(40, 520, 100, 40);

        ComplainTABLE.setModel(new javax.swing.table.DefaultTableModel(
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
        ComplainTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComplainTABLEMouseClicked(evt);
            }
        });
        TablePane.setViewportView(ComplainTABLE);

        jPanel3.add(TablePane);
        TablePane.setBounds(490, 160, 550, 400);

        ComplainDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComplainDate.setForeground(new java.awt.Color(0, 102, 102));
        ComplainDate.setText("Launch Date");
        jPanel3.add(ComplainDate);
        ComplainDate.setBounds(20, 410, 100, 22);

        BackBtn.setBackground(new java.awt.Color(255, 255, 204));
        BackBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(0, 102, 102));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel3.add(BackBtn);
        BackBtn.setBounds(1060, 320, 110, 40);

        ComplainDes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComplainDes.setForeground(new java.awt.Color(0, 102, 102));
        ComplainDes.setText("Description");
        jPanel3.add(ComplainDes);
        ComplainDes.setBounds(30, 320, 100, 30);

        COMPLAINDES.setColumns(20);
        COMPLAINDES.setRows(5);
        jScrollPane2.setViewportView(COMPLAINDES);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(140, 290, 166, 96);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1366, 768);

        setSize(new java.awt.Dimension(1212, 657));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void connection (Connection connection) throws ClassNotFoundException{
        
       // This function is for creating connection with oracle database
        
        try {
            Class.forName("oracle.jdbc.OracleDriver"); // defining the oracle driver 
             connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:rimsha", "rimsha", "rimsha"); // establishing connection with user in orcale database
        } 
        
        catch (SQLException ex) { // throwing exception if thus user is not available
            
            Logger.getLogger(ComplainsRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private void ComplainAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComplainAddBtnActionPerformed
 
        // This button creating connection with database and adding in from texfield input
        
        try{
      
       Connection connection = null;
       connection(connection);
       String sql="insert into COMPLIANS"+"(COMP_ID,P_ID,DESCRIPTION,LAUNCH_DATE)"+"values(?,?,?,?)"; // inserting into table complain
        PreparedStatement preparedstatement = connection.prepareStatement(sql); // connection with sql for statement
        int a=(int) Integer.parseInt(ComplainID.getText()); // convert string to integer
        preparedstatement.setInt(1, a); // set complain id into table 
        preparedstatement.setString(2, ProductID.getText()); // set product id into table
       preparedstatement.setString(3, COMPLAINDES.getText()); // set complain description into table
       // preparedstatement.setString(4, COMPDATECHOOSER.getText());
     
         if(ProductID.getText().trim().isEmpty() ){ // if does not add the products id or customer id 
           
             JOptionPane.showMessageDialog(this,"Product key and customer key is mandatory to add!");
            
         }
         
         else{
              preparedstatement.executeUpdate(); // if everything running smoothly and has inserted into table
       
              JOptionPane.showMessageDialog(this,"Successfully Inserted!");
         }
       }
       
        catch(Exception e) // handling exceptions if table or column is not exist
       {
           JOptionPane.showMessageDialog(this,e.getMessage());
       }
    
        
     Updated_Table();
        
      
    }//GEN-LAST:event_ComplainAddBtnActionPerformed

    
      public void Updated_Table()
{
   // updating table in database  from texfield input
   
    try{
      Connection connection = null;
       connection(connection); // calling function for connection
        String sql="Select * from COMPLIANS"; // read all the rows from table
        PreparedStatement preparedstatement =null;  // initiliaze result set
        preparedstatement =connection.prepareStatement(sql); // connection with sql for statement
        ResultSet resultset =null; // initialize result set 
        resultset = preparedstatement.executeQuery(); // run query on statement and store and result set variable 
        ComplainTABLE.setModel(DbUtils.resultSetToTableModel(resultset)); // and then display into table 
      
       }
    
       catch(Exception e) // handling exception with that column is not exist
           {
           
           JOptionPane.showMessageDialog(this,e.getMessage());
       
       }
}
    
    
    
    private void ComplainTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComplainTABLEMouseClicked

    }//GEN-LAST:event_ComplainTABLEMouseClicked

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
   // show previous screen and disclose current screen 
        
        new CustomerRecord().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ComplainsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplainsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplainsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplainsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplainsRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextArea COMPLAINDES;
    private javax.swing.JButton ComplainAddBtn;
    private javax.swing.JLabel ComplainDate;
    private javax.swing.JLabel ComplainDes;
    private javax.swing.JLabel ComplainHeading;
    private javax.swing.JTextField ComplainID;
    private javax.swing.JLabel ComplainId;
    private javax.swing.JLabel ComplainRrecordHeading;
    private javax.swing.JTable ComplainTABLE;
    private javax.swing.JTextField ProductID;
    private javax.swing.JLabel ProductId;
    private javax.swing.JScrollPane TablePane;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
