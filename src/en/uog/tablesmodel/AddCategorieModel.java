/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.tablesmodel;

import en.uog.entities.Categorie;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aziz
 */
public class AddCategorieModel extends AbstractTableModel{
    public String[] columsName = new String[]{"Name","Description"};
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
    
    public void LoadCategorie(List<Categorie> categories){
        rows = new Vector<String[]>();
        for(Categorie categorie:categories){
            rows.add(new String[]{categorie.getName(),categorie.getDescription()});
        }
        fireTableChanged(null);
    }
}
