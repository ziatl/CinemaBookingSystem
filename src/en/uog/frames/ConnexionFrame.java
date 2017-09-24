/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package en.uog.frames;

import en.uog.dao.BookingDaoImpl;
import en.uog.dao.ValidationProvider;
import en.uog.database.PersistenceManager;
import en.uog.entities.User;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author faycal
 */
public class ConnexionFrame extends javax.swing.JFrame implements WindowListener{
    boolean validation = true;
    /** Creates new form ConnexionFrame */
    public ConnexionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        errNUll();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnInscription = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfLogin = new javax.swing.JTextField();
        errPassword = new javax.swing.JLabel();
        errLogin = new javax.swing.JLabel();
        errConnexion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txfPassw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connexion");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(506, 394));
        setMinimumSize(new java.awt.Dimension(506, 394));
        setName("connexionFrame"); // NOI18N

        jDesktopPane1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cinema Booking System");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(70, 30, 380, 50);

        btnLogin.setBackground(new java.awt.Color(153, 0, 255));
        btnLogin.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log in ☺");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnLogin);
        btnLogin.setBounds(140, 290, 110, 29);

        btnInscription.setBackground(new java.awt.Color(51, 51, 255));
        btnInscription.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        btnInscription.setForeground(new java.awt.Color(255, 255, 255));
        btnInscription.setText("Join system ☞");
        btnInscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscriptionActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnInscription);
        btnInscription.setBounds(270, 290, 110, 29);

        jLabel2.setFont(new java.awt.Font("Marker Felt", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(220, 200, 80, 18);

        jLabel3.setFont(new java.awt.Font("Marker Felt", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(230, 120, 60, 18);

        jLabel4.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("© Copyright 2017 T. FAYÇAL");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(160, 380, 190, 16);

        txfLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfLoginActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txfLogin);
        txfLogin.setBounds(120, 140, 280, 26);

        errPassword.setForeground(new java.awt.Color(255, 255, 51));
        errPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errPassword.setText("err password");
        jDesktopPane1.add(errPassword);
        errPassword.setBounds(120, 250, 280, 16);

        errLogin.setForeground(new java.awt.Color(255, 255, 51));
        errLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errLogin.setText("err login");
        jDesktopPane1.add(errLogin);
        errLogin.setBounds(120, 170, 280, 16);

        errConnexion.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        errConnexion.setForeground(new java.awt.Color(255, 102, 102));
        errConnexion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errConnexion.setText("Login or Password is incorrect");
        jDesktopPane1.add(errConnexion);
        errConnexion.setBounds(150, 90, 230, 17);

        jButton1.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        jButton1.setText("Welcome");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(200, 330, 120, 29);

        txfPassw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDesktopPane1.add(txfPassw);
        txfPassw.setBounds(120, 220, 280, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        em = PersistenceManager.getEntityManager();
        validation();
        if (validation) {
            if(this.login() != null){
          
                this.dispose();
                WelcomeFrame wf = new WelcomeFrame(login());
                wf.setVisible(true);
            }else{
                this.errConnexion.setText("Login or Password is incorrect");
            }
        } else {
           
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLoginActionPerformed

    private void btnInscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscriptionActionPerformed
        // TODO add your handling code here:
        this.dispose();
        InscriptionFrame ifr = new InscriptionFrame();
        ifr.setVisible(true);
    }//GEN-LAST:event_btnInscriptionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PrincipalFrame pf = new PrincipalFrame();
        pf.setVisible(true);
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
            java.util.logging.Logger.getLogger(ConnexionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnexionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnexionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnexionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnexionFrame().setVisible(true);
            }
        });
    }
    EntityManager em = PersistenceManager.getEntityManager();
    BookingDaoImpl dao = new BookingDaoImpl();
    static String EMAIL_FORMAT_INCORRECT = "set a correct email format";
    static String MESSAGE_EMPTY = "can not be empty";
    public void validation(){
        validation = true;
        errNUll();
        if (!ValidationProvider.minString(txfPassw.getText().trim(), 8)) {
            validation = false;
            errPassword.setText("minimum 8 charaters");
        }else if (txfPassw.getText().trim().isEmpty()){
            validation = false;
            errPassword.setText(MESSAGE_EMPTY);
        }
        
        if (txfLogin.getText().trim().isEmpty()){
            validation = false;
            errLogin.setText(MESSAGE_EMPTY);
        }else if(!ValidationProvider.validEmail(txfLogin.getText().trim())){
            validation = false;
            errLogin.setText(EMAIL_FORMAT_INCORRECT);
         }
    }
    private User login() {
       dao = new BookingDaoImpl();
       return dao.login(txfLogin.getText(), txfPassw.getText());
    }
    public void errNUll(){
        this.errPassword.setText("");
        this.errLogin.setText("");
        this.errConnexion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscription;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel errConnexion;
    private javax.swing.JLabel errLogin;
    private javax.swing.JLabel errPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txfLogin;
    private javax.swing.JPasswordField txfPassw;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
