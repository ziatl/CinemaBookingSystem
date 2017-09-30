/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.tablesmodel;

import en.uog.entities.BookTicket;
import en.uog.entities.Movie;
import en.uog.entities.OnScreen;
import en.uog.entities.Star;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import sun.security.krb5.internal.Ticket;

/**
 *
 * @author aziz
 */
public class ListRecommandationModel extends AbstractTableModel {
    public String[] columsName = new String[]{"Movie name","Mark","Price","Show Date"};
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
    
    public void LoadOnScreen(List<OnScreen> onScreens){
        rows = new Vector<String[]>();
        for(OnScreen onScreen:onScreens){
            double somme = 0;
            for (Star star : onScreen.getMovie().getStars()) {
                somme = somme + star.getMark();
            }
            if (onScreen.getMovie().getStars().size()!=0) {
                somme = somme / onScreen.getMovie().getStars().size();
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
            
            rows.add(new String[]{""+onScreen.getMovie().getTitle(),""+som,"‎£"+onScreen.getPrice(),""+onScreen.getMovieDate()});
        }
        fireTableChanged(null);
    }
    
}
