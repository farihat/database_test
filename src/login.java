// Create A JFrame Named "Java_Form_Login"
/*
package javaapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;


/**
 *
 * @author 1bestcsharp.blogspot.com
 */
/*
public class Java_Form_Login extends javax.swing.JFrame {

    /**
     * Creates new form Java_Form_Login
     */
/*
    public Java_Form_Login() {
        initComponents();
    }

    // Set Timer
    Timer timer1 = new Timer(30, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(jPanel_Message.getHeight() != 105){
                jPanel_Message.setBounds(0,0,Java_Form_Login.this.getSize().width,jPanel_Message.getHeight() + 5);
                if(jPanel_Message.getHeight() == 105){
                    timer1.stop();
                }
            }
        }
    });

    Timer timer2 = new Timer(30, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(jPanel_Message.getHeight() != 0){
                jPanel_Message.setBounds(0,0,Java_Form_Login.this.getSize().width,jPanel_Message.getHeight() - 5);
                if(jPanel_Message.getHeight() == 0){
                    timer2.stop();
                }
            }
        }
    });


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton_Login = new javax.swing.JButton();
        jPanel_Message = new javax.swing.JPanel();
        jLabel_Message = new javax.swing.JLabel();
        jButton_Ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.decode("#bdb76b")
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Username :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Password :");

        jTextField_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton_Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Login.setText("Login");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jPanel_Message.setBackground(java.awt.Color.decode("#3a5795"));

        jLabel_Message.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jButton_Ok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Ok.setText("Ok");
        jButton_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MessageLayout = new javax.swing.GroupLayout(jPanel_Message);
        jPanel_Message.setLayout(jPanel_MessageLayout);
        jPanel_MessageLayout.setHorizontalGroup(
                jPanel_MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_MessageLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
        );
        jPanel_MessageLayout.setVerticalGroup(
                jPanel_MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_MessageLayout.createSequentialGroup()
                                .addGroup(jPanel_MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_MessageLayout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jLabel_Message))
                                        .addGroup(jPanel_MessageLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jButton_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPasswordField_Password)))
                                .addGap(26, 26, 26)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))
                        .addComponent(jPanel_Message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jButton_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jCheckBox1))))
                                .addContainerGap(110, Short.MAX_VALUE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    // Button Login
    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {

        Connection connection;
        PreparedStatement ps;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            ps = connection.prepareStatement("SELECT `username`, `password` FROM `users` WHERE `username` = ? AND `password` = ?");
            ps.setString(1, jTextField_Username.getText());
            ps.setString(2, String.valueOf(jPasswordField_Password.getPassword()));
            ResultSet result = ps.executeQuery();
            if(result.next()){
                jLabel_Message.setText("Login Successesfully");
                jLabel_Message.setForeground(Color.GREEN);
                timer1.start();
            }
            else{
                jLabel_Message.setText("Invalide Username Or Password");
                jLabel_Message.setForeground(Color.RED);
                timer1.start();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Java_Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton_OkActionPerformed(java.awt.event.ActionEvent evt) {

        timer2.start();
    }

    // Show And Hide Password Using jCheckBox
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {

        if(jCheckBox1.isSelected()){
            jPasswordField_Password.setEchoChar((char)0);
        }else{
            jPasswordField_Password.setEchoChar('*');
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Java_Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_Form_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_Login;
    private javax.swing.JButton jButton_Ok;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Message;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Message;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration                   
}



*/
        //Read more at http://1bestcsharp.blogspot.com/2015/06/java-create-login-form-window-mysql-database-in-java-netbeans.html#1A8Dhx1LGXuR27S7.99