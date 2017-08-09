/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.frames;

import en.uog.dao.BookingDaoImpl;
import en.uog.dao.SendMail;
import en.uog.dao.ValidationProvider;
import en.uog.entities.Profile;
import en.uog.entities.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import java.util.Properties;
import javax.swing.text.DateFormatter;


/**
 *
 * @author aziz
 */
public class InscriptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form InscriptionFrame
     */
    public InscriptionFrame() {
        initComponents();
        this.errNUll();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dekstop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfFirstname = new javax.swing.JTextField();
        txfLastName = new javax.swing.JTextField();
        txfTelephone = new javax.swing.JTextField();
        txfAddress = new javax.swing.JTextField();
        txfEmail = new javax.swing.JTextField();
        txfPassword = new javax.swing.JTextField();
        errFistnamt = new javax.swing.JLabel();
        errLastName = new javax.swing.JLabel();
        errTelephone = new javax.swing.JLabel();
        errAddress = new javax.swing.JLabel();
        errEmail = new javax.swing.JLabel();
        errPassword = new javax.swing.JLabel();
        errBirthday = new javax.swing.JLabel();
        btnInscription = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        errInscription = new javax.swing.JLabel();
        panBirthday = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inscription");
        setBackground(new java.awt.Color(65, 105, 170));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Firtname :");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Lastname :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Contact :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Address :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Email :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Password :");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Birthday :");

        txfFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfFirstnameActionPerformed(evt);
            }
        });

        txfLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfLastNameActionPerformed(evt);
            }
        });

        txfTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTelephoneActionPerformed(evt);
            }
        });

        txfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfAddressActionPerformed(evt);
            }
        });

        txfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEmailActionPerformed(evt);
            }
        });

        txfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPasswordActionPerformed(evt);
            }
        });

        errFistnamt.setForeground(new java.awt.Color(255, 255, 102));
        errFistnamt.setText("err Firtname");

        errLastName.setForeground(new java.awt.Color(255, 255, 102));
        errLastName.setText("jLabel8");

        errTelephone.setForeground(new java.awt.Color(255, 255, 102));
        errTelephone.setText("jLabel8");

        errAddress.setForeground(new java.awt.Color(255, 255, 102));
        errAddress.setText("jLabel8");

        errEmail.setForeground(new java.awt.Color(255, 255, 102));
        errEmail.setText("jLabel8");

        errPassword.setForeground(new java.awt.Color(255, 255, 102));
        errPassword.setText("jLabel8");

        errBirthday.setForeground(new java.awt.Color(255, 255, 102));
        errBirthday.setText("jLabel8");

        btnInscription.setText("Inscription");
        btnInscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscriptionActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Apple Chancery", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 102));
        jLabel8.setText("Inscription");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        errInscription.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        errInscription.setForeground(new java.awt.Color(255, 102, 102));
        errInscription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errInscription.setText("Login or Password is incorrect");

        panBirthday.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panBirthdayLayout = new javax.swing.GroupLayout(panBirthday);
        panBirthday.setLayout(panBirthdayLayout);
        panBirthdayLayout.setHorizontalGroup(
            panBirthdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );
        panBirthdayLayout.setVerticalGroup(
            panBirthdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        dekstop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(txfFirstname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(txfLastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(txfTelephone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(txfAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(txfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(txfPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(errFistnamt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(errLastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(errTelephone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(errAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(errEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(errPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(errBirthday, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(btnInscription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(btnCancel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(errInscription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(panBirthday, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dekstopLayout = new javax.swing.GroupLayout(dekstop);
        dekstop.setLayout(dekstopLayout);
        dekstopLayout.setHorizontalGroup(
            dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dekstopLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dekstopLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dekstopLayout.createSequentialGroup()
                        .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dekstopLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txfLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfTelephone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dekstopLayout.createSequentialGroup()
                                        .addGap(0, 187, Short.MAX_VALUE)
                                        .addComponent(btnCancel))
                                    .addComponent(txfFirstname)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dekstopLayout.createSequentialGroup()
                                        .addComponent(panBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(dekstopLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnInscription, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dekstopLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errFistnamt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(errLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                        .addComponent(errTelephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(errAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(errEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(errPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(dekstopLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dekstopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errInscription, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        dekstopLayout.setVerticalGroup(
            dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dekstopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errInscription)
                .addGap(18, 18, 18)
                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(errFistnamt))
                .addGap(18, 18, 18)
                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(errLastName))
                .addGap(18, 18, 18)
                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(errTelephone))
                .addGap(18, 18, 18)
                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(errAddress))
                .addGap(18, 18, 18)
                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(errEmail))
                .addGap(18, 18, 18)
                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(errPassword))
                .addGap(18, 18, 18)
                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(panBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errBirthday))
                .addGap(59, 59, 59)
                .addComponent(btnInscription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addGap(151, 151, 151))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLastNameActionPerformed

    private void txfFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfFirstnameActionPerformed

    private void txfTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTelephoneActionPerformed

    private void txfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfAddressActionPerformed

    private void txfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEmailActionPerformed

    private void txfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPasswordActionPerformed

    private void btnInscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscriptionActionPerformed
        // TODO add your handling code here:
        dao = new BookingDaoImpl();
        if (this.validation()){
            User user = new User();
            user.setAddress(txfAddress.getText().trim());
            user.setFirstname(txfFirstname.getText().trim());
            user.setLastName(txfLastName.getText().trim());
            user.setBirthday(new Date());
            user.setEmail(txfEmail.getText().trim());
            user.setPassword(txfPassword.getText().trim().trim());
            //Set profile User
            Profile p = dao.findProfileByName("USER");
            user.setProfile(p);
            dao.addUser(user);
            SendMail.SendEmail(txfFirstname.getText().trim(), txfEmail.getText().trim(), txfPassword.getText().trim().trim());
            this.dispose();
            ConnexionFrame cf = new ConnexionFrame();
            cf.setVisible(true);
        }
    }//GEN-LAST:event_btnInscriptionActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ConnexionFrame cf = new ConnexionFrame();
        cf.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(InscriptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscriptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscriptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscriptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscriptionFrame().setVisible(true);
            }
        });
    }
    BookingDaoImpl dao = new BookingDaoImpl();
    static String MESSAGE_EMPTY = "can not be empty";
    static String EMAIL_EXIST = "email already exist";
    static String EMAIL_FORMAT_INCORRECT = "set a correct email format";
    boolean validation = true;
    public boolean validation(){
        errNUll();
        validation = true;
        //Address
        if (txfAddress.getText().trim().isEmpty()) {
            errAddress.setText(MESSAGE_EMPTY);
            validation = false;
        }
        //Email
        if (txfEmail.getText().trim().isEmpty()) {
            errEmail.setText(MESSAGE_EMPTY);
            validation = false;
        }else if (dao.findUserByEmail(txfEmail.getText().trim())!=null){
            errEmail.setText(EMAIL_EXIST);
            validation = false;
        }else if (!ValidationProvider.validEmail(txfEmail.getText().trim())){
            errEmail.setText(EMAIL_FORMAT_INCORRECT);
            validation = false;
        }
        //FIrsname
        if (txfFirstname.getText().trim().isEmpty()) {
            errFistnamt.setText(MESSAGE_EMPTY);
            validation = false;
        }
        //Lastname
        if (txfLastName.getText().trim().isEmpty()) {
            errLastName.setText(MESSAGE_EMPTY);
            validation = false;
        }
        //Contact
        if (txfTelephone.getText().trim().isEmpty()) {
            errTelephone.setText(MESSAGE_EMPTY);
            validation = false;
        }
        
        return validation;
    }
    
    public void errNUll(){
        this.errAddress.setText("");
        this.errBirthday.setText("");
        this.errEmail.setText("");
        this.errFistnamt.setText("");
        this.errInscription.setText("");
        this.errLastName.setText("");
        this.errPassword.setText("");
        this.errTelephone.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInscription;
    private javax.swing.JDesktopPane dekstop;
    private javax.swing.JLabel errAddress;
    private javax.swing.JLabel errBirthday;
    private javax.swing.JLabel errEmail;
    private javax.swing.JLabel errFistnamt;
    private javax.swing.JLabel errInscription;
    private javax.swing.JLabel errLastName;
    private javax.swing.JLabel errPassword;
    private javax.swing.JLabel errTelephone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panBirthday;
    private javax.swing.JTextField txfAddress;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfFirstname;
    private javax.swing.JTextField txfLastName;
    private javax.swing.JTextField txfPassword;
    private javax.swing.JTextField txfTelephone;
    // End of variables declaration//GEN-END:variables
}
