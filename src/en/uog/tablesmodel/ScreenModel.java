/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.tablesmodel;

import en.uog.entities.OnScreen;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aziz
 */
public class ScreenModel extends AbstractTableModel {

    public String[] columsName = new String[]{"Room Id","Moovie","Date","Price"};
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
    public void LoadScreen(List<OnScreen> screens){
         rows = new Vector<String[]>();
          for (OnScreen screen : screens) {
            rows.add(new String[]{""
                      +""+screen.getRoom().getRoomId(),
                       ""+screen.getMovie().getTitle(),
                         ""+screen.getMovieDate(),
                        "‎£"+screen.getPrice()
              });
        }
        fireTableChanged(null);
    }
    
}
