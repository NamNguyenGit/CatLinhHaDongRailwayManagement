/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllFrames;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Entities.User;
import DAOImplement.UserDAOImplement;
/**
 *
 * @author acer
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form ClientLoginFrame
     */
    public RegisterFrame() {
         try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(RegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        setLocationRelativeTo(null);
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
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(852, 500));
        setResizable(false);

        jPanel1.setLayout(null);
        jPanel1.add(username);
        username.setBounds(340, 300, 220, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 350, 130, 40);
        jPanel1.add(password);
        password.setBounds(340, 360, 220, 22);

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton1.setText("Join Us");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 410, 140, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-arrow-48.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 50, 60);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(180, 90, 110, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Date of birth");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 140, 130, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Phone");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(180, 240, 110, 20);
        jPanel1.add(Phone);
        Phone.setBounds(340, 240, 220, 22);
        jPanel1.add(gender);
        gender.setBounds(340, 190, 220, 22);
        jPanel1.add(dob);
        dob.setBounds(340, 140, 220, 22);
        jPanel1.add(Name);
        Name.setBounds(340, 90, 220, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(180, 190, 110, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USERNAME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 290, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 480);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        ClientLoginFrame CLF = new ClientLoginFrame();
        CLF.show();
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Name_user = Name.getText().trim();
        String dateofbirth = dob.getText().trim();
        String Gender_user = gender.getText().trim();
        String Phone_user = Phone.getText().trim();
        String Username_user = username.getText().trim();
        String Password_user = password.getText().trim();
        
        String error = "";
       
        if(Name_user.length()==0){
            error += "\n Name required";
        }
       
        if(dateofbirth.length()==0){
            error += "\n Date of birth required";
        }
        if(Gender_user.length()==0){
            error += "\n Gender required";
        }
        if(Phone_user.length()==0){
            error += "\n Phone  required";
        }
        if(Username_user.length()==0){
            error += "\n Username required";
        }
        if(Password_user.length()==0){
            error += "\n Password required";
        }

        if (error.length() == 0) {
            User s1 = new User();
            s1.setName(Name_user);
            s1.setDob(dateofbirth);
            s1.setGender(Gender_user);
            s1.setPhone(Phone_user);
            s1.setUsername(Username_user);
            s1.setPassword(Password_user);
           

            boolean bl = new UserDAOImplement().insertUser(s1);
            if (bl) {
                JOptionPane.showMessageDialog(this, "Welcome to Cat Linh Ha Dong Overhead Railway");
                
                Name.setText(null);
                dob.setText(null);
                gender.setText(null);
                Phone.setText(null);
                username.setText(null);
                password.setText(null);
                
                ClientLoginFrame CLF = new ClientLoginFrame();
                CLF.show();
                dispose();
                

            } else {
                JOptionPane.showMessageDialog(null, "Opps something went wrong !!");
                Name.setText(null);
                dob.setText(null);
                gender.setText(null);
                Phone.setText(null);
                username.setText(null);
                password.setText(null);
            }

        } else {
            JOptionPane.showMessageDialog(null, error);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
