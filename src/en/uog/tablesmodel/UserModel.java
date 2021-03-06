/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.tablesmodel;

import en.uog.entities.User;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author faycal
 */
public class UserModel extends AbstractTableModel{
    public String[] columsName = new String[]{"Firstname","Lastname","Email"};
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
    
    public void loadUsers(List<User> users){
        rows = new Vector<String[]>();
        for (User user : users) {
            rows.add(new String[]{user.getFirstname(),user.getLastName(),user.getEmail(),String.valueOf(user.getId())});
        }
        fireTableChanged(null);
    }
    
}
