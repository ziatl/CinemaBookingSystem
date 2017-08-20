/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.frames;

import en.uog.dao.BookingDaoImpl;
import en.uog.entities.Movie;
import en.uog.entities.Room;
import en.uog.tablesmodel.AddRoomModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aziz
 */
public class IFAddRoom extends javax.swing.JInternalFrame {

    AddRoomModel roomModel = new AddRoomModel();
     List<Room> liste;
     BookingDaoImpl dao;
    /**
     * Creates new form IFAddRoom
     */
    public IFAddRoom() {
        initComponents();
        tableRoom.setModel(roomModel);
        dao = new BookingDaoImpl();
        liste = dao.getAllRoom();
        roomModel.LoadRoom(liste);
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
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfRoomId = new javax.swing.JTextField();
        errRoomId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfNumberOfPlace = new javax.swing.JTextField();
        errNumberPlace = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRoom = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jDesktopPane3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Apple Chancery", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add  Movie");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane3.add(jLabel1);
        jLabel1.setBounds(130, 10, 380, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Room id :");
        jDesktopPane3.add(jLabel2);
        jLabel2.setBounds(150, 50, 80, 16);
        jDesktopPane3.add(txfRoomId);
        txfRoomId.setBounds(240, 50, 60, 26);

        errRoomId.setForeground(new java.awt.Color(255, 255, 51));
        errRoomId.setText("err room id");
        jDesktopPane3.add(errRoomId);
        errRoomId.setBounds(310, 50, 210, 16);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Number of place :");
        jDesktopPane3.add(jLabel4);
        jLabel4.setBounds(76, 80, 150, 16);
        jDesktopPane3.add(txfNumberOfPlace);
        txfNumberOfPlace.setBounds(240, 80, 60, 26);

        errNumberPlace.setForeground(new java.awt.Color(255, 255, 51));
        errNumberPlace.setText("err number of place");
        jDesktopPane3.add(errNumberPlace);
        errNumberPlace.setBounds(310, 80, 210, 16);

        btnAdd.setText("Add Room");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jDesktopPane3.add(btnAdd);
        btnAdd.setBounds(250, 130, 97, 29);

        jPanel1.add(jDesktopPane3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jDesktopPane2.setLayout(new java.awt.BorderLayout());

        tableRoom.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableRoom);

        jDesktopPane2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(88, 88, 88))
        );

        jDesktopPane2.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel2.add(jDesktopPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (tableRoom.getSelectedRow() != -1) {
            Room room = liste.get(tableRoom.getSelectedRow());
            System.out.println(room.getId());
            dao = new BookingDaoImpl();
            dao.delRoom(room);
            dao = new BookingDaoImpl();
            liste = new ArrayList<Room>(dao.getAllRoom());
            roomModel.LoadRoom(liste);
            tableRoom.setModel(roomModel);
        }else{
            System.err.println("Please select room before");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Room room = new Room();
        room.setRoomId(txfRoomId.getText());
        room.setNumberOfPlace(Integer.parseInt(txfNumberOfPlace.getText()));
        
        dao = new BookingDaoImpl();
        dao.addRoom(room);
        dao = new BookingDaoImpl();
        liste = new ArrayList<Room>(dao.getAllRoom());
        roomModel.LoadRoom(liste);
        tableRoom.setModel(roomModel);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel errNumberPlace;
    private javax.swing.JLabel errRoomId;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRoom;
    private javax.swing.JTextField txfNumberOfPlace;
    private javax.swing.JTextField txfRoomId;
    // End of variables declaration//GEN-END:variables
}
