/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.tablesmodel;

import en.uog.entities.Movie;
import en.uog.entities.Star;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aziz
 */
public class AddMarkModel extends AbstractTableModel{
    public String[] columsName = new String[]{"Total mark","Title","Categorie"};
    private Vector<String[]> rows = new Vector<String[]>();
    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return columsName.length;
    }

    @Override
    public String getColumnName(int column) {
        return columsName[column];

    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex)[columnIndex];
    }
    
    public void LoadMovie(List<Movie> movies){
        rows = new Vector<String[]>();
       
        for(Movie movie:movies){
            double somme = 0;
            for (Star star : movie.getStars()) {
                somme = somme + star.getMark();
            }
            if (movie.getStars().size()!=0) {
                somme = somme / movie.getStars().size();
            }
            String som = "no mark";
            if(somme>=1 && somme<2){
                som = "★☆☆☆☆";
            }
            if(somme>=2 && somme<3){
                som = "★★☆☆☆";
            }
            if(somme>=3 && somme<4){
                som = "★★★☆☆";
            }
            if(somme>=4 && somme<5){
                som = "★★★★☆";
            }
            if(somme==5){
                som = "★★★★★";
            }
            rows.add(new String[]{""+som,movie.getTitle(),movie.getCategorie().getName()});
        }
        fireTableChanged(null);
    }
}
