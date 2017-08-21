/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.tablesmodel;

import en.uog.entities.Movie;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aziz
 */
public class AddMovieModel extends AbstractTableModel{
    public String[] columsName = new String[]{"Title","Abstract","Date release"};
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
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd MMMMM yyyy");
        for(Movie movie:movies){
            rows.add(new String[]{movie.getTitle(),movie.getMovieAbstract(),sdf.format(movie.getDateRelease())});
        }
        fireTableChanged(null);
    }
}
