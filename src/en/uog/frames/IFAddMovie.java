/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.frames;

import en.uog.dao.BookingDaoImpl;
import en.uog.dao.ValidationProvider;
import en.uog.entities.Categorie;
import en.uog.entities.Movie;
import en.uog.tablesmodel.AddMovieModel;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author faycal
 */
public class IFAddMovie extends javax.swing.JInternalFrame {

     public static UtilDateModel model = new UtilDateModel();
     public static JDatePanelImpl datePanel = new JDatePanelImpl(model);
     public static JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
     
     AddMovieModel movieModel = new AddMovieModel();
     List<Movie> liste;
     BookingDaoImpl dao;
     String imageName = "";
     List<Categorie> listeCategories;

     
    /**
     * Creates new form IFAddMovie
     */
    public IFAddMovie() {
        initComponents();
        model.setValue(new Date());
        panDate.add(datePicker);
        
        tableMovie.setModel(movieModel);
        dao = new BookingDaoImpl();
        liste = dao.getAllMovies();
        movieModel.LoadMovie(liste);
        initErr();
        listeCategories = dao.getAllCategorie();
        comboCategorie.removeAllItems();
        comboCategorie.addItem(" ");
        for (Categorie categorie : listeCategories) {
            comboCategorie.addItem(categorie.getName());
        }
    }
    public void initErr(){
        errTtile.setText("");
        errAbstract.setText("");

        errImage.setText("");
        errCategorie.setText("");
    }
    
    boolean validation = true;
    public boolean validation(){
        validation = true;
        if (txfTitle.getText().equals("")) {
            validation = false;
            errTtile.setText("Set a valid value");
        }
        
        if (txfAbstract.getText().equals("")) {
            validation = false;
            errTtile.setText("Set a valid value"); 
        }
        
        if (comboCategorie.getSelectedIndex()==0) {
            validation = false;
            errCategorie.setText("select categorie");
        }
        
 
        return validation;
    }
    ImageIcon imageCour = null;
    public ImageIcon reseizeImgae(String imagePath){
        ImageIcon myImg = new ImageIcon(imagePath);
        
        Image img = myImg.getImage();
        Image newImg = img.getScaledInstance(imgMoovie.getWidth(), imgMoovie.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        imageCour = image;
        return image;  
    }
    public void saveImage(ImageIcon imageIco) throws IOException{
        
        File file = new File(imageName);
        BufferedImage bf = new BufferedImage(imageIco.getIconWidth(), imageIco.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        ImageIO.write(bf, "jpeg", file);    
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfTitle = new javax.swing.JTextField();
        errTtile = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        txfAbstract = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        scrListe = new javax.swing.JScrollPane();
        tableMovie = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        panDate = new javax.swing.JPanel();
        btnAddMovie = new javax.swing.JButton();
        btnAddImage = new javax.swing.JButton();
        imgMoovie = new javax.swing.JLabel();
        errAbstract = new javax.swing.JLabel();
        errImage = new javax.swing.JLabel();
        comboCategorie = new javax.swing.JComboBox<>();
        errCategorie = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        desktop.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Apple Chancery", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add  Movie");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktop.add(jLabel1);
        jLabel1.setBounds(130, 10, 380, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Title :");
        desktop.add(jLabel2);
        jLabel2.setBounds(50, 40, 36, 16);
        desktop.add(txfTitle);
        txfTitle.setBounds(90, 40, 290, 26);

        errTtile.setForeground(new java.awt.Color(255, 255, 51));
        errTtile.setText("err title");
        desktop.add(errTtile);
        errTtile.setBounds(390, 40, 210, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Release date :");
        desktop.add(jLabel3);
        jLabel3.setBounds(10, 170, 90, 16);

        txfAbstract.setColumns(20);
        txfAbstract.setRows(5);
        scrollPane.setViewportView(txfAbstract);

        desktop.add(scrollPane);
        scrollPane.setBounds(90, 70, 290, 60);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Abstract:");
        desktop.add(jLabel4);
        jLabel4.setBounds(16, 70, 70, 16);

        tableMovie.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMovie.setSize(new java.awt.Dimension(620, 64));
        scrListe.setViewportView(tableMovie);

        desktop.add(scrListe);
        scrListe.setBounds(10, 210, 680, 170);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        desktop.add(btnDelete);
        btnDelete.setBounds(320, 390, 97, 29);
        desktop.add(panDate);
        panDate.setBounds(100, 170, 220, 30);

        btnAddMovie.setText("Add movie");
        btnAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMovieActionPerformed(evt);
            }
        });
        desktop.add(btnAddMovie);
        btnAddMovie.setBounds(210, 390, 110, 29);

        btnAddImage.setText("load image");
        btnAddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImageActionPerformed(evt);
            }
        });
        desktop.add(btnAddImage);
        btnAddImage.setBounds(530, 130, 113, 29);

        imgMoovie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMoovie.setText("jLabel5");
        desktop.add(imgMoovie);
        imgMoovie.setBounds(550, 40, 80, 80);

        errAbstract.setForeground(new java.awt.Color(255, 255, 51));
        errAbstract.setText("err abstract");
        desktop.add(errAbstract);
        errAbstract.setBounds(390, 70, 140, 16);

        errImage.setForeground(new java.awt.Color(255, 255, 51));
        errImage.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        errImage.setText("err image");
        desktop.add(errImage);
        errImage.setBounds(390, 90, 140, 16);

        comboCategorie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        desktop.add(comboCategorie);
        comboCategorie.setBounds(90, 140, 130, 27);

        errCategorie.setForeground(new java.awt.Color(255, 255, 51));
        errCategorie.setText("err category");
        desktop.add(errCategorie);
        errCategorie.setBounds(230, 140, 140, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Category :");
        desktop.add(jLabel5);
        jLabel5.setBounds(10, 140, 80, 16);

        getContentPane().add(desktop);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMovieActionPerformed
        // TODO add your handling code here:
        if (validation()) {
            Movie movie = new Movie();
            movie.setTitle(txfTitle.getText());
            movie.setMovieAbstract(txfAbstract.getText());
            Date selectDate = (Date) datePicker.getModel().getValue();
            movie.setDateRelease(selectDate);
            if (imageCour!=null) {
//                try {
//                    saveImage(imageCour);
//                } catch (IOException ex) {
//                    System.err.println("Errer enregistrement image");
//                }
                movie.setImage(imageName);
            }
            Categorie categorie = listeCategories.get(comboCategorie.getSelectedIndex()-1);
            movie.setCategorie(categorie);
            dao.addMovie(movie);
            dao = new BookingDaoImpl();
            liste = new ArrayList<Movie>(dao.getAllMovies());
            movieModel.LoadMovie(liste);
            tableMovie.setModel(movieModel); 
            this.txfAbstract.setText("");
            this.txfTitle.setText("");
        }
    }//GEN-LAST:event_btnAddMovieActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        JOptionPane jop = new JOptionPane();	
        this.setVisible(false);
        int option = jop.showConfirmDialog(null, "Do you want to delete ?", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);		
        if(option == JOptionPane.OK_OPTION){
            if (tableMovie.getSelectedRow() != -1) {
                Movie movie = liste.get(tableMovie.getSelectedRow());
                System.out.println(movie.getId());
                dao = new BookingDaoImpl();
                dao.delMovie(movie);
                dao = new BookingDaoImpl();
                liste = new ArrayList<Movie>(dao.getAllMovies());
                movieModel.LoadMovie(liste);
                tableMovie.setModel(movieModel);
            }else{
                System.err.println("Please select movie before");
            }
            this.setVisible(true);
        }else{
            this.setVisible(true);
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImageActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter =  new FileNameExtensionFilter("*.Images","jpg","jpeg","tiff","gift","png");
        jf.addChoosableFileFilter(filter);
        int result = jf.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
            File selectedFile = jf.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            imageName = selectedFile.getName();
            System.err.println(ValidationProvider.generateImageName()+imageName);
            imgMoovie.setIcon(reseizeImgae(path));
        }else if (result == JFileChooser.CANCEL_OPTION){
            System.out.println("No file select");
        }
            
        
    }//GEN-LAST:event_btnAddImageActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddImage;
    private javax.swing.JButton btnAddMovie;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> comboCategorie;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel errAbstract;
    private javax.swing.JLabel errCategorie;
    private javax.swing.JLabel errImage;
    private javax.swing.JLabel errTtile;
    private javax.swing.JLabel imgMoovie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panDate;
    private javax.swing.JScrollPane scrListe;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tableMovie;
    private javax.swing.JTextArea txfAbstract;
    private javax.swing.JTextField txfTitle;
    // End of variables declaration//GEN-END:variables
}
