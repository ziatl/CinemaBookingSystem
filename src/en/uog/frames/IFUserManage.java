/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.frames;

import en.uog.dao.BookingDaoImpl;
import en.uog.entities.OnScreen;
import en.uog.entities.User;
import en.uog.tablesmodel.ScreenModel;
import en.uog.tablesmodel.UserModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author faycal
 */
public class IFUserManage extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form IFUserManage
     */
    UserModel userModel = new UserModel();
    List<User> liste;
    BookingDaoImpl dao;
    User currentUser;
    public IFUserManage(User user) {
        initComponents();
        currentUser = user;
        desktop.setSize(this.getSize());
        tableUser.setModel(userModel);
        BookingDaoImpl dao = new BookingDaoImpl();
        liste = dao.getAllUsers();
        userModel.loadUsers(liste);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        scrollUser = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnBan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(537, 481));
        setSize(new java.awt.Dimension(537, 481));

        desktop.setLayout(new java.awt.BorderLayout(3, 3));

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollUser.setViewportView(tableUser);

        desktop.add(scrollUser, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setText("Delete user ✕");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);

        btnBan.setText("Ban user");
        jPanel2.add(btnBan);

        desktop.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here: 
        if (tableUser.getSelectedRow() != -1) {
            

        User userU = liste.get(tableUser.getSelectedRow());
        if (userU.getProfile().getProfileName().equals("ADMIN")) {
            JOptionPane jop = new JOptionPane();	
            this.setVisible(false);
            int option = jop.showConfirmDialog(null, "You can not delete administrator", "Message", JOptionPane.WARNING_MESSAGE, JOptionPane.QUESTION_MESSAGE);		
            if(option == JOptionPane.OK_OPTION){
                this.setVisible(true);
            }else{
                this.setVisible(true);
            }
        }else{

            JOptionPane jop = new JOptionPane();	
            this.setVisible(false);
            int option = jop.showConfirmDialog(null, "Do you want to delete ?", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);		
            if(option == JOptionPane.OK_OPTION){
                if (tableUser.getSelectedRow() != -1) {
                    User user = liste.get(tableUser.getSelectedRow());
                    dao = new BookingDaoImpl();
                    dao.delUser(user);
                    liste.remove(tableUser.getSelectedRow());
                    dao = new BookingDaoImpl();
                    userModel = new UserModel();
                    dao = new BookingDaoImpl();
                    userModel.loadUsers(liste);
                    tableUser.removeAll();
                    tableUser.setModel(userModel);

                }else{
                    System.err.println("Please select user before");
                }
                this.setVisible(true);
            }else{
                this.setVisible(true);
            }            
        }   
        
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBan;
    private javax.swing.JButton btnDelete;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrollUser;
    private javax.swing.JTable tableUser;
    // End of variables declaration//GEN-END:variables
}
