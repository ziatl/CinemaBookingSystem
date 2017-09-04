/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.frames.clients;

import en.uog.dao.BookingDaoImpl;
import en.uog.entities.OnScreen;
import en.uog.entities.User;
import en.uog.tablesmodel.clients.ModelListProgram;
import java.util.List;

/**
 *
 * @author aziz
 */
public class IFViewPrograms extends javax.swing.JInternalFrame {

    ModelListProgram programModel = new ModelListProgram();
     List<OnScreen> liste;
     BookingDaoImpl dao;
    /**
     * Creates new form IFViewPrograms
     */
    User currentUser = new User();
    public IFViewPrograms(User user) {
        initComponents();
        currentUser = user;
       
        tableProgram.setModel(programModel);
        dao = new BookingDaoImpl();
        liste = dao.getAllOnScreen();
        programModel.LoadOnScreen(liste);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        scrilll = new javax.swing.JScrollPane();
        tableProgram = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBuy = new javax.swing.JButton();

        jDesktopPane1.setLayout(new java.awt.BorderLayout());

        tableProgram.setModel(new javax.swing.table.DefaultTableModel(
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
        scrilll.setViewportView(tableProgram);

        jDesktopPane1.add(scrilll, java.awt.BorderLayout.CENTER);

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnBuy.setText("Buy");
        jPanel2.add(btnBuy, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrilll;
    private javax.swing.JTable tableProgram;
    // End of variables declaration//GEN-END:variables
}
