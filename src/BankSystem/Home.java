/*
 * To change this license heade    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Insets getBorderInsets(Component c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isBorderOpaque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
r, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author iktakhairul
 */

public class Home extends javax.swing.JFrame {
    
Connection conn;
ResultSet rs;
PreparedStatement pst;

    /**
     * Creates new form Home
     */
    public Home() {
        super("Home");
        initComponents();
        conn=javaconnect.ConnecrDb();//
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        UserID = new javax.swing.JTextField();
        UserPIN = new javax.swing.JPasswordField();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 0, 0)
        );
        jTextField2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 255, 102));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Being with us");
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(370, 430, 200, 24);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(0,0,0,0));
        jTextField3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 255, 102));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Best Service For Best Clients");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(220, 450, 500, 30);

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Join now");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 600, 120, 30);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(0,0,0,0)
        );
        jTextField4.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 255, 204));
        jTextField4.setText("Sign in to Account");
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(950, 290, 240, 40);

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(0,0,0,0));
        jTextField8.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText("Account ID");
        jTextField8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField8);
        jTextField8.setBounds(1020, 360, 120, 30);

        UserID.setBackground(new java.awt.Color(255, 255, 204));
        UserID.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        UserID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153)));
        getContentPane().add(UserID);
        UserID.setBounds(1170, 360, 170, 30);

        UserPIN.setBackground(new java.awt.Color(204, 204, 255));
        UserPIN.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        UserPIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserPIN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153)));
        UserPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserPINActionPerformed(evt);
            }
        });
        getContentPane().add(UserPIN);
        UserPIN.setBounds(1170, 410, 170, 30);

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(0,0,0,0)
        );
        jTextField7.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText("Password");
        jTextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField7);
        jTextField7.setBounds(1020, 410, 120, 30);

        jButton3.setBackground(new java.awt.Color(0,0,0,0)
        );
        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 102));
        jButton3.setText("Forgot Password?");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1230, 450, 110, 17);

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(0, 0, 0, 0)
        );
        jTextField5.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("@2018Iktakhairul");
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(770, 730, 180, 20);

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1020, 480, 320, 23);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(0,0,0,0));
        jTextField6.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Humpty-Dumpty Bank LTD.");
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(110, 260, 710, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginback.jpg"))); // NOI18N
        jLabel1.setText("jLabel2");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1390, 760);

        jMenuBar3.setBackground(new java.awt.Color(51, 153, 255));
        jMenuBar3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jMenu5.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
        jMenu5.setText("Menu");

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_TAB, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Create Account");
        jMenuItem14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuItem14.setPreferredSize(new java.awt.Dimension(200, 20));
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_TAB, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setText("About Me");
        jMenuItem16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuItem16.setPreferredSize(new java.awt.Dimension(200, 20));
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.META_MASK));
        jMenuItem13.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.background"));
        jMenuItem13.setText(" Help");
        jMenuItem13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jMenuItem13.setPreferredSize(new java.awt.Dimension(180, 18));
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem15.setText("Exit");
        jMenuItem15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuItem15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem15.setPreferredSize(new java.awt.Dimension(200, 20));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuBar3.add(jMenu5);

        setJMenuBar(jMenuBar3);

        setBounds(0, 0, 1391, 806);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        
        AccountResister ob = new AccountResister();
        setVisible(false);
        ob.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        AboutMe ob = new AboutMe();
        setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:

        System.exit(0);

    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sql = "select * from Account where ID = ? and PIN = ? ";
        try{

            pst = conn.prepareStatement(sql);
            pst.setString(1, UserID.getText());
            pst.setString(2, UserPIN.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                setVisible(false);
                ///////////////*********************** create object here [ ligin/homo to go which page ]  ********** //done
                BankMenu ob = new BankMenu();
                ob.setVisible(true);//************ set true //done
                rs.close();
                pst.close();

            }else{
                JOptionPane.showMessageDialog(null, "Incorrect Credensial");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{/////******************************* 2nd try start
            try{
                rs.close();
                pst.close();

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, "Incorrect Credensial try2 catch");
            } /////************************************ 2nd try ended

        }////****************************************** close finally expretion..

    }//GEN-LAST:event_jButton1ActionPerformed

    private void UserPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserPINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPINActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AccountResister ob = new AccountResister();
        setVisible(false);
        ob.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        ForgetPassword ob = new ForgetPassword();
        setVisible(false);
        ob.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        Help obh1 = new Help();
        setVisible(false);
        obh1.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UserID;
    private javax.swing.JPasswordField UserPIN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
