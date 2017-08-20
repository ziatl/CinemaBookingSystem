/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.tablesmodel;

import en.uog.entities.Room;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aziz
 */
public class AddRoomModel extends AbstractTableModel {
    public String[] columsName = new String[]{"Room Id","Number of Place"};
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
    
    public void LoadRoom(List<Room> rooms){
         rows = new Vector<String[]>();
        for(Room room:rooms){
            rows.add(new String[]{""+room.getRoomId(),""+room.getNumberOfPlace()});
        }
        fireTableChanged(null);
    }
    
}
