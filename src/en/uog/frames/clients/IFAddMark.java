/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.frames.clients;

import en.uog.dao.BookingDaoImpl;
import en.uog.entities.Movie;
import en.uog.entities.Star;
import en.uog.entities.User;
import en.uog.tablesmodel.AddMarkModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aziz
 */
public class IFAddMark extends javax.swing.JInternalFrame {

    AddMarkModel movieModel = new AddMarkModel();
    List<Movie> liste;
    BookingDaoImpl dao;
    
    User currentUser;
    Movie currentMovie;
    /**
     * Creates new form IFAddMark
     */
    public IFAddMark(User user) {
        initComponents();
        currentUser = user;
        tableMark.setModel(movieModel);
        dao = new BookingDaoImpl();
        liste = dao.getAllMovies();
        movieModel.LoadMovie(liste);
        errSelection.setText("");
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
        jPanel1 = new javax.swing.JPanel();
        lblMovie = new javax.swing.JLabel();
        spinnerMark = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnAddMark = new javax.swing.JButton();
        errSelection = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMark = new javax.swing.JTable();

        jDesktopPane1.setLayout(new java.awt.BorderLayout());

        lblMovie.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        lblMovie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovie.setText("Select movie");

        spinnerMark.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        spinnerMark.setToolTipText("");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Select your mark :");

        btnAddMark.setText("Add/Update your mark");
        btnAddMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMarkActionPerformed(evt);
            }
        });

        errSelection.setForeground(new java.awt.Color(255, 51, 153));
        errSelection.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMovie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddMark)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)))
                .addGap(34, 34, 34)
                .addComponent(errSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMark)
                    .addComponent(errSelection))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tableMark.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMarkMouseClicked(evt);
            }
        });
        tableMark.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tableMarkPropertyChange(evt);
            }
        });
        tableMark.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableMarkKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableMark);

        jDesktopPane1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarkActionPerformed
        // TODO add your handling code here:
        if (tableMark.getSelectedRow() != -1) {
            errSelection.setText("");
            currentMovie = liste.get(tableMark.getSelectedRow());
            lblMovie.setText(currentMovie.getTitle());
            dao = new BookingDaoImpl();
            Star star = new Star();
            star.setMark((int) spinnerMark.getValue());
            star.setUser(currentUser);
            star.setMovie(currentMovie);
            dao.addStar(star);
            dao = new BookingDaoImpl();
            liste = new ArrayList<Movie>(dao.getAllMovies());
            movieModel.LoadMovie(liste);
            tableMark.setModel(movieModel); 
        }else{
            errSelection.setText("select movie before");
        }
            
    }//GEN-LAST:event_btnAddMarkActionPerformed

    private void tableMarkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableMarkKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tableMarkKeyPressed

    private void tableMarkPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tableMarkPropertyChange
        // TODO add your handling code here:
        if (tableMark.getSelectedRow() != -1) {
            currentMovie = liste.get(tableMark.getSelectedRow());
            lblMovie.setText(currentMovie.getTitle());
        }
    }//GEN-LAST:event_tableMarkPropertyChange

    private void tableMarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMarkMouseClicked
        // TODO add your handling code here:
        if (tableMark.getSelectedRow() != -1) {
            currentMovie = liste.get(tableMark.getSelectedRow());
            lblMovie.setText(currentMovie.getTitle());
        }
    }//GEN-LAST:event_tableMarkMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMark;
    private javax.swing.JLabel errSelection;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMovie;
    private javax.swing.JSpinner spinnerMark;
    private javax.swing.JTable tableMark;
    // End of variables declaration//GEN-END:variables
}
