/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.frames;

import en.uog.dao.BookingDaoImpl;
import en.uog.entities.OnScreen;
import en.uog.tablesmodel.ScreenModel;
import java.util.List;

/**
 *
 * @author aziz
 */
public class IFListeScreen extends javax.swing.JInternalFrame {

    ScreenModel screenModel = new ScreenModel();
    List<OnScreen> liste;
    BookingDaoImpl dao;
    /**
     * Creates new form IFListeScreen
     */
    public IFListeScreen() {
        initComponents();
        tableScreen.setModel(screenModel);
        BookingDaoImpl dao = new BookingDaoImpl();
        liste = dao.getAllOnScreen();
        screenModel.LoadScreen(liste);
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        scrool = new javax.swing.JScrollPane();
        tableScreen = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jDesktopPane1.setLayout(new java.awt.BorderLayout());

        tableScreen.setModel(new javax.swing.table.DefaultTableModel(
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
        scrool.setViewportView(tableScreen);

        jDesktopPane1.add(scrool, java.awt.BorderLayout.CENTER);

        jPanel1.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrool;
    private javax.swing.JTable tableScreen;
    // End of variables declaration//GEN-END:variables
}
