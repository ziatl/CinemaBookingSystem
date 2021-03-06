/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.frames;

import en.uog.entities.User;
import en.uog.frames.clients.IFAddMark;
import en.uog.frames.clients.IFPurshases;
import en.uog.frames.clients.IFViewPrograms;
import javax.swing.JOptionPane;

/**
 *
 * @author faycal
 */
public class WelcomeFrame extends javax.swing.JFrame {

    static User currentuser = new User();
    /**
     * Creates new form AccueilPanel
     */
    public WelcomeFrame(User user) {
        initComponents();
        currentuser = user;
        this.setLocationRelativeTo(null);
        if(currentuser.getProfile().getProfileName().equals("USER")){
            hideUser();
            desktop.removeAll();
            IFViewPrograms ifv = new IFViewPrograms(currentuser);
            ifv.setVisible(true);
            desktop.add(ifv);
          
        }else{
            hideAdmin();
              desktop.removeAll();
            IFAddMovie ifa = new IFAddMovie();
            ifa.setSize(desktop.getSize());
            ifa.setVisible(true);
            desktop.add(ifa);
        }
        
    }
    public void hideUser(){
         meneBar.remove(menuRooms);
         itemMovie.remove(itemAddMovie);
         itemProgram.remove(itemListProgram);
         itemProgram.remove(itemAddProgram);
         meneBar.remove(itemUsers);
         meneBar.remove(menuCategorie);
         
    }
    
    public void hideAdmin(){
        itemProgram.remove(itemViewProgram);
        itemMovie.remove(itemAddMarks);
        itemMovie.remove(itemMyPurschases);
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
        meneBar = new javax.swing.JMenuBar();
        itemDisconnect = new javax.swing.JMenu();
        itemConnexion = new javax.swing.JMenuItem();
        itemExit = new javax.swing.JMenuItem();
        itemProgram = new javax.swing.JMenu();
        itemAddProgram = new javax.swing.JMenuItem();
        itemListProgram = new javax.swing.JMenuItem();
        itemViewProgram = new javax.swing.JMenuItem();
        itemUsers = new javax.swing.JMenu();
        itemListUsers = new javax.swing.JMenuItem();
        menuCategorie = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        itemMovie = new javax.swing.JMenu();
        itemAddMovie = new javax.swing.JMenuItem();
        itemAddMarks = new javax.swing.JMenuItem();
        itemMyPurschases = new javax.swing.JMenuItem();
        menuRooms = new javax.swing.JMenu();
        btnAddRoom = new javax.swing.JMenuItem();
        btnListRooms = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(713, 515));
        setMinimumSize(new java.awt.Dimension(713, 515));
        setPreferredSize(new java.awt.Dimension(713, 515));
        setResizable(false);

        desktop.setLayout(new java.awt.BorderLayout(1, 0));

        itemDisconnect.setText("File");
        itemDisconnect.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N

        itemConnexion.setText("Disconnect");
        itemConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConnexionActionPerformed(evt);
            }
        });
        itemDisconnect.add(itemConnexion);

        itemExit.setText("Exit");
        itemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitActionPerformed(evt);
            }
        });
        itemDisconnect.add(itemExit);

        meneBar.add(itemDisconnect);

        itemProgram.setText("Programs");
        itemProgram.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N

        itemAddProgram.setText("Add Program");
        itemAddProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddProgramActionPerformed(evt);
            }
        });
        itemProgram.add(itemAddProgram);

        itemListProgram.setText("List Programs");
        itemListProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListProgramActionPerformed(evt);
            }
        });
        itemProgram.add(itemListProgram);

        itemViewProgram.setText("View Programs");
        itemViewProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemViewProgramActionPerformed(evt);
            }
        });
        itemProgram.add(itemViewProgram);

        meneBar.add(itemProgram);

        itemUsers.setText("Users");
        itemUsers.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N

        itemListUsers.setText("List of users");
        itemListUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListUsersActionPerformed(evt);
            }
        });
        itemUsers.add(itemListUsers);

        meneBar.add(itemUsers);

        menuCategorie.setText("Categories");
        menuCategorie.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N

        jMenuItem1.setText("Add categorie");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCategorie.add(jMenuItem1);

        meneBar.add(menuCategorie);

        itemMovie.setText("Movies");
        itemMovie.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N

        itemAddMovie.setText("Add movie");
        itemAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddMovieActionPerformed(evt);
            }
        });
        itemMovie.add(itemAddMovie);

        itemAddMarks.setText("Add marks");
        itemAddMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddMarksActionPerformed(evt);
            }
        });
        itemMovie.add(itemAddMarks);

        itemMyPurschases.setText("My purchases");
        itemMyPurschases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMyPurschasesActionPerformed(evt);
            }
        });
        itemMovie.add(itemMyPurschases);

        meneBar.add(itemMovie);

        menuRooms.setText("Rooms");
        menuRooms.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N

        btnAddRoom.setText("Add Room");
        btnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomActionPerformed(evt);
            }
        });
        menuRooms.add(btnAddRoom);

        btnListRooms.setText("List of Rooms");
        btnListRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListRoomsActionPerformed(evt);
            }
        });
        menuRooms.add(btnListRooms);

        meneBar.add(menuRooms);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N
        meneBar.add(jMenu2);

        setJMenuBar(meneBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConnexionActionPerformed
        // TODO add your handling code here:
        JOptionPane jop = new JOptionPane();	
        this.setVisible(false);
        int option = jop.showConfirmDialog(null, "Do you want to disconnect ?", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);		
        if(option == JOptionPane.OK_OPTION){
        this.dispose();
        ConnexionFrame cf = new ConnexionFrame();
        cf.setVisible(true);
        }else{
        this.setVisible(true);
        }
        
    }//GEN-LAST:event_itemConnexionActionPerformed

    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed
        // TODO add your handling code here:
        JOptionPane jop = new JOptionPane();	
        this.setVisible(false);
        int option = jop.showConfirmDialog(null, "Do you want to quit ?", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);		
        if(option == JOptionPane.OK_OPTION){
        System.exit(0);
        }else{
        this.setVisible(true);
        }
    }//GEN-LAST:event_itemExitActionPerformed

    private void itemListUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListUsersActionPerformed

           // TODO add your handling code here:
        desktop.removeAll();
        IFUserManage ifu = new IFUserManage(currentuser);
        ifu.setSize(desktop.getSize());
        ifu.setVisible(true);
        desktop.add(ifu);

    }//GEN-LAST:event_itemListUsersActionPerformed

    private void itemAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddMovieActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        IFAddMovie ifa = new IFAddMovie();
        ifa.setSize(desktop.getSize());
        ifa.setVisible(true);
        desktop.add(ifa);
        
    }//GEN-LAST:event_itemAddMovieActionPerformed

    private void btnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        IFAddRoom ifa = new IFAddRoom();
        ifa.setVisible(true);
        desktop.add(ifa);
    }//GEN-LAST:event_btnAddRoomActionPerformed

    private void itemAddProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddProgramActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        IFProgrammScreen ifp = new IFProgrammScreen(currentuser);
        ifp.setVisible(true);
        desktop.add(ifp);
    }//GEN-LAST:event_itemAddProgramActionPerformed

    private void itemListProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListProgramActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        IFListeScreen ifp = new IFListeScreen();
        ifp.setVisible(true);
        desktop.add(ifp);
    }//GEN-LAST:event_itemListProgramActionPerformed

    private void itemViewProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemViewProgramActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        IFViewPrograms ifv = new IFViewPrograms(currentuser);
        ifv.setVisible(true);
        desktop.add(ifv);
    }//GEN-LAST:event_itemViewProgramActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        IFAddCategorie ifa = new IFAddCategorie();
        ifa.setVisible(true);
        desktop.add(ifa);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itemAddMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddMarksActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        IFAddMark ifa = new IFAddMark(currentuser);
        ifa.setVisible(true);
        desktop.add(ifa);
    }//GEN-LAST:event_itemAddMarksActionPerformed

    private void itemMyPurschasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMyPurschasesActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        IFPurshases ifp = new IFPurshases(currentuser);
        ifp.setVisible(true);
        desktop.add(ifp);
    }//GEN-LAST:event_itemMyPurschasesActionPerformed

    private void btnListRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListRoomsActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        IFAddRoom ifa = new IFAddRoom();
        ifa.setVisible(true);
        desktop.add(ifa);
    }//GEN-LAST:event_btnListRoomsActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeFrame(currentuser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAddRoom;
    private javax.swing.JMenuItem btnListRooms;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem itemAddMarks;
    private javax.swing.JMenuItem itemAddMovie;
    private javax.swing.JMenuItem itemAddProgram;
    private javax.swing.JMenuItem itemConnexion;
    private javax.swing.JMenu itemDisconnect;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenuItem itemListProgram;
    private javax.swing.JMenuItem itemListUsers;
    private javax.swing.JMenu itemMovie;
    private javax.swing.JMenuItem itemMyPurschases;
    private javax.swing.JMenu itemProgram;
    private javax.swing.JMenu itemUsers;
    private javax.swing.JMenuItem itemViewProgram;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar meneBar;
    private javax.swing.JMenu menuCategorie;
    private javax.swing.JMenu menuRooms;
    // End of variables declaration//GEN-END:variables
}
