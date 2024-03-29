/*All Rights Reserved
Please don't share this source code with others.
Developed by Pubudu Ishan Wickrama Arachchi
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ishan
 */
public class ResetPassword extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form ResetPassword
     */
    public ResetPassword() {
        super("Forgot Password");
        initComponents();
        conn=javaconnect.ConnectDb();
        SeTVisibles();
        
        //block resizing and hide maximize button
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }
    
    public void SeTVisibles(){
        jLabel1.setVisible(true);
        jLabel6.setVisible(true);
        jTextField1.setEditable(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jLabel4.setVisible(false);
        jTextField3.setVisible(false);
        jTextField3.setEditable(false);
        jButton4.setVisible(false);
        jLabel3.setVisible(false);
        jLabel5.setVisible(false);
        jLabel2.setVisible(false);
        jLabel7.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jButton3.setVisible(false);                        
    }
    
    
    public void ResetPassword(){
        String P1=jPasswordField1.getText();
        String P2=jPasswordField2.getText();
        String UserName=jTextField1.getText();
        String SecurityPIN=jTextField3.getText();
        
        try{            
            if(P1.equals(P2)){     
                if(P1.equals("")|P2.equals("")){
                    JOptionPane.showMessageDialog(null, "Password Cannot be Empty");
                }else{
                    try{
                        String sql="update accounts set Password='"+P2+"' where User_Name='"+UserName+"' and Security_PIN='"+SecurityPIN+"'";
                        pst=conn.prepareStatement(sql);
                        pst.execute();

                        JOptionPane.showMessageDialog(null, "Password Successfully Changed");
                        jTextField3.setText("");
                        jTextField1.setText("");
                        jPasswordField1.setText("");
                        jPasswordField2.setText(""); 
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }           
                }
            }else{
                JOptionPane.showMessageDialog(null,"Password Not Same");
            }        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }        
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Reset Password");

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setText("Search User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("New Password");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Confirm Password");

        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Login Now");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Change Password");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPasswordField1.setEditable(false);
        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));

        jPasswordField2.setEditable(false);
        jPasswordField2.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setForeground(new java.awt.Color(0, 51, 255));
        jButton4.setText("Verify User");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Enter User Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Show");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Show");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });

        jLabel4.setText("Enter Security PIN");

        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)
                        .addComponent(jPasswordField1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7))))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButton2))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(608, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        // TODO add your handling code here:
        jPasswordField2.setEchoChar('*');
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
        jPasswordField2.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
        jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        jPasswordField1.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //Verify User
        String sql="select Security_PIN from accounts where User_Name=? and Security_PIN=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            pst.setString(2,jTextField3.getText());
            rs=pst.executeQuery();
            if(rs.next()){                
                jPasswordField1.setEditable(true);
                jPasswordField2.setEditable(true);
                jPasswordField1.setEchoChar('*');
                jPasswordField2.setEchoChar('*');
                
                jLabel1.setVisible(true);
                jLabel6.setVisible(true);
                jTextField1.setEditable(true);
                jButton1.setVisible(true);
                jLabel4.setText("Enter Security PIN Number");
                jLabel4.setVisible(true);
                jTextField3.setVisible(true);
                jTextField3.setEditable(true);
                jButton4.setVisible(true);
                jLabel3.setVisible(true);
                jLabel5.setVisible(true);
                jLabel2.setVisible(true);
                jLabel7.setVisible(true);
                jPasswordField1.setVisible(true);
                jPasswordField2.setVisible(true);
                jButton3.setVisible(true);
                jButton2.setVisible(true);
                rs.close();
                pst.close();
            }else{
                jTextField3.setText("");
                jLabel4.setVisible(true);
                jLabel4.setText("Invalid Security PIN Pleace enter correct Security PIN");
                jLabel1.setVisible(true);
                jLabel6.setVisible(true);
                jTextField1.setEditable(true);
                jButton1.setVisible(true);
                jTextField3.setEditable(true);
                jButton4.setVisible(true);
                jLabel3.setVisible(false);
                jLabel5.setVisible(false);
                jLabel2.setVisible(false);
                jLabel7.setVisible(false);
                jPasswordField1.setVisible(false);
                jPasswordField2.setVisible(false);
                jButton3.setVisible(false);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //passsword change
        ResetPassword();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //ForgotPassword cancel button
        setVisible(false);
        Login ob=new Login();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Reset password searach user
        String sql="select * from accounts where User_Name IN (?)";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                jLabel1.setVisible(true);
                jLabel6.setVisible(true);
                jTextField1.setEditable(true);
                jButton1.setVisible(true);
                jLabel4.setVisible(true);
                jLabel4.setText("Enter Security PIN Number");
                jTextField3.setVisible(true);
                jTextField3.setEditable(true);
                jButton4.setVisible(true);
                jLabel3.setVisible(false);
                jLabel5.setVisible(false);
                jLabel2.setVisible(false);
                jLabel7.setVisible(false);
                jPasswordField1.setVisible(false);
                jPasswordField2.setVisible(false);
                jButton3.setVisible(false);                
                rs.close();
                pst.close();
            }else{
                jTextField3.setText("");
                jTextField1.setText("");
                jLabel4.setVisible(true);
                jLabel4.setText("Invalid User Name");
                jLabel1.setVisible(true);
                jLabel6.setVisible(true);
                jTextField1.setEditable(true);
                jButton1.setVisible(true);
                jTextField3.setEditable(false);
                jButton4.setVisible(false);
                jLabel3.setVisible(false);
                jLabel5.setVisible(false);
                jLabel2.setVisible(false);
                jLabel7.setVisible(false);
                jPasswordField1.setVisible(false);
                jPasswordField2.setVisible(false);
                jButton3.setVisible(false);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextField3.setText("");
        jTextField1.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        
        jLabel1.setVisible(true);
        jLabel6.setVisible(true);
        jTextField1.setEditable(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jLabel4.setVisible(false);
        jTextField3.setVisible(false);
        jTextField3.setEditable(false);
        jButton4.setVisible(false);
        jLabel3.setVisible(false);
        jLabel5.setVisible(false);
        jLabel2.setVisible(false);
        jLabel7.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jButton3.setVisible(false);     
    }//GEN-LAST:event_jButton5ActionPerformed

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
            UIManager.setLookAndFeel("com.jtatoo.plaf.SmartLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
