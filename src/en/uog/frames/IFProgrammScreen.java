/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.frames;

import en.uog.dao.BookingDaoImpl;
import en.uog.dao.ValidationProvider;
import en.uog.entities.Movie;
import en.uog.entities.OnScreen;
import en.uog.entities.Room;
import en.uog.entities.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author aziz
 */
public class IFProgrammScreen extends javax.swing.JInternalFrame {
    
    User currentUser;
     public static UtilDateModel model = new UtilDateModel();
     public static JDatePanelImpl datePanel = new JDatePanelImpl(model);
     public static JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
    
    Map<Integer, Integer> mapMinute = new HashMap<Integer,Integer>();
    Map<Integer, Integer> mapHour = new HashMap<Integer,Integer>();
    BookingDaoImpl dao;
    Map<String, Integer> mapMovie = new HashMap<String, Integer>();
    Map<String, Integer> mapRoom = new HashMap<String, Integer>();
    List<Room> listRoom = new ArrayList<Room>();
    List<Movie> listMovie = new ArrayList<Movie>();
    
    //Getting values 
    Integer idMovie = 0;
    Integer idRoom = 0;
    Integer minute = 0;
    Integer hour = 0;
    Double price = 0.0;
    
    /**
     * Creates new form IFProgrammScreen
     */
    public IFProgrammScreen(User user) {
        initComponents();
        lblShowNumber.setText(ValidationProvider.generateShowNumber());
        currentUser = user;
        model.setValue(new Date());
        panDate.add(datePicker);
        dao = new BookingDaoImpl();
        listMovie = dao.getAllMovies();
        listRoom = dao.getAllRoom();
        initializ();
    }
    public  void initializ(){
        comboHour.removeAllItems();
        comboHour.addItem(" ");
        comboMin.removeAllItems();
        comboMin.addItem(" ");
        comboRoom.removeAllItems();
        comboRoom.addItem(" ");
        comboMovie.removeAllItems();
        comboMovie.addItem(" ");
        
        for (int i = 1; i <= 60; i++) {
            mapMinute.put(i, i);
            comboMin.addItem(""+i);
        }
        for (int i = 1; i <= 24; i++) {
            mapHour.put(i, i);
            comboHour.addItem(""+i);
        }
        for (Room room : listRoom) {
            mapRoom.put(room.getRoomId(),room.getId());
            comboRoom.addItem(room.getRoomId());
        }
        for (Movie movie : listMovie) {
            mapMovie.put(movie.getTitle(),movie.getId());
            comboMovie.addItem(movie.getTitle());
        }  
         
       resetError();
    }
    public void resetElements(){
        initializ();
    }
    public void resetError(){
         //Set null errors
       errDate.setText("");
       errMovie.setText("");
       errPrice.setText("");
       errTime.setText("");
       errRoom.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        lblShowNumber = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panDate = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txfPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboMovie = new javax.swing.JComboBox<>();
        comboRoom = new javax.swing.JComboBox<>();
        comboMin = new javax.swing.JComboBox<>();
        comboHour = new javax.swing.JComboBox<>();
        btnProgram = new javax.swing.JButton();
        errPrice = new javax.swing.JLabel();
        errMovie = new javax.swing.JLabel();
        errRoom = new javax.swing.JLabel();
        errDate = new javax.swing.JLabel();
        errTime = new javax.swing.JLabel();

        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jDesktopPane1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Apple Chancery", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Program Screen");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(130, 10, 380, 30);

        lblShowNumber.setForeground(new java.awt.Color(0, 255, 153));
        lblShowNumber.setText("hGg43G3Gh");
        jDesktopPane1.add(lblShowNumber);
        lblShowNumber.setBounds(230, 50, 200, 16);

        jLabel3.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Price :");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(110, 260, 120, 20);

        jLabel4.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Show Number : ");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(110, 50, 120, 15);
        jDesktopPane1.add(panDate);
        panDate.setBounds(240, 170, 220, 30);

        jLabel5.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Room :");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(100, 120, 120, 20);

        jLabel6.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Movie time :");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(110, 230, 120, 20);

        txfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPriceActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txfPrice);
        txfPrice.setBounds(240, 260, 100, 26);

        jLabel7.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Movie date :");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(110, 170, 120, 20);

        jLabel8.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Movie :");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(100, 90, 120, 20);

        comboMovie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMovieItemStateChanged(evt);
            }
        });
        comboMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMovieActionPerformed(evt);
            }
        });
        jDesktopPane1.add(comboMovie);
        comboMovie.setBounds(250, 90, 320, 27);

        comboRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRoom.setSelectedIndex(-1);
        jDesktopPane1.add(comboRoom);
        comboRoom.setBounds(250, 120, 130, 27);

        comboMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboMin.setSelectedIndex(-1);
        jDesktopPane1.add(comboMin);
        comboMin.setBounds(320, 230, 90, 27);

        comboHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboHour.setSelectedIndex(-1);
        jDesktopPane1.add(comboHour);
        comboHour.setBounds(240, 230, 80, 27);

        btnProgram.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        btnProgram.setText("Program");
        btnProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnProgram);
        btnProgram.setBounds(280, 320, 85, 29);

        errPrice.setForeground(new java.awt.Color(255, 255, 51));
        errPrice.setText("set price");
        errPrice.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jDesktopPane1.add(errPrice);
        errPrice.setBounds(350, 260, 130, 20);

        errMovie.setForeground(new java.awt.Color(255, 255, 51));
        errMovie.setText("select");
        jDesktopPane1.add(errMovie);
        errMovie.setBounds(570, 90, 80, 20);

        errRoom.setForeground(new java.awt.Color(255, 255, 51));
        errRoom.setText("select");
        jDesktopPane1.add(errRoom);
        errRoom.setBounds(380, 126, 80, 20);

        errDate.setForeground(new java.awt.Color(255, 255, 51));
        errDate.setText("select");
        jDesktopPane1.add(errDate);
        errDate.setBounds(470, 176, 80, 20);

        errTime.setForeground(new java.awt.Color(255, 255, 51));
        errTime.setText("time is not valid");
        errTime.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jDesktopPane1.add(errTime);
        errTime.setBounds(420, 230, 130, 20);

        getContentPane().add(jDesktopPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPriceActionPerformed

    private void comboMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMovieActionPerformed
        // TODO add your handling code here:
        System.err.println(evt.getSource());
    }//GEN-LAST:event_comboMovieActionPerformed

    private void comboMovieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMovieItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMovieItemStateChanged

    Boolean validation = true;
    public boolean validation(){
        resetError();
        validation = true;
        if (comboMovie.getSelectedItem().equals(" ")){
            errMovie.setText("Select movie");
            validation = false;
        }
        if (comboRoom.getSelectedItem().equals(" ")){
            errRoom.setText("Select room");
            validation = false;
        }
        try {
            price = Double.parseDouble(txfPrice.getText());
            if (price <= 0) {
                 errPrice.setText("Set valid price");
                validation = false;
            }
        } catch (Exception e) {
            errPrice.setText("Set valid price");
            validation = false;
        }
        
        try {
            minute = Integer.parseInt((String) comboMin.getSelectedItem());
            hour = Integer.parseInt((String) comboHour.getSelectedItem());
        } catch (Exception e) {
            errTime.setText("Set valid time");
            validation = false;
        }
        return validation;
    }
    private void btnProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramActionPerformed
        // TODO add your handling code here:
        if (validation()) {
            idMovie = mapMovie.get(comboMovie.getSelectedItem());
            idRoom = mapRoom.get(comboRoom.getSelectedItem());
            minute = Integer.parseInt((String) comboMin.getSelectedItem());
            hour = Integer.parseInt((String) comboHour.getSelectedItem());

            Date date = (Date) datePicker.getModel().getValue();
            date.setMinutes(minute);
            date.setHours(hour);

             //Programm
             OnScreen onScreen = new OnScreen();
             onScreen.setUser(dao.findUserById(currentUser.getId()));
             onScreen.setRoom(dao.findRoomById(idRoom));
             onScreen.setMovie(dao.findMovieById(idMovie));
             onScreen.setPrice(Double.parseDouble(txfPrice.getText()));
             onScreen.setShowNo(lblShowNumber.getText());
             onScreen.setMovieDate(date);
             onScreen.setShowNo(lblShowNumber.getText());
             dao = new BookingDaoImpl();
             dao.addOnScreen(onScreen);
             
             resetElements();
             lblShowNumber.setText(ValidationProvider.generateShowNumber());   
        }
        
    }//GEN-LAST:event_btnProgramActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProgram;
    private javax.swing.JComboBox<String> comboHour;
    private javax.swing.JComboBox<String> comboMin;
    private javax.swing.JComboBox<String> comboMovie;
    private javax.swing.JComboBox<String> comboRoom;
    private javax.swing.JLabel errDate;
    private javax.swing.JLabel errMovie;
    private javax.swing.JLabel errPrice;
    private javax.swing.JLabel errRoom;
    private javax.swing.JLabel errTime;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblShowNumber;
    private javax.swing.JPanel panDate;
    private javax.swing.JTextField txfPrice;
    // End of variables declaration//GEN-END:variables
}
