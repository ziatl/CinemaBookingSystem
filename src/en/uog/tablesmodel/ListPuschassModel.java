/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.tablesmodel;

import en.uog.entities.BookTicket;
import en.uog.entities.OnScreen;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import sun.security.krb5.internal.Ticket;

/**
 *
 * @author aziz
 */
public class ListPuschassModel extends AbstractTableModel {
    public String[] columsName = new String[]{"Movie Name","Date Purshase","Price"};
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
    
    public void LoadTicket(List<BookTicket> bookTickets){
         rows = new Vector<String[]>();
        for(BookTicket bookTicket:bookTickets){
            OnScreen os = bookTicket.getOnScreen();
            rows.add(new String[]{""+os.getMovie().getTitle(),""+bookTicket.getDatePurchase(),""+os.getPrice()});
        }
        fireTableChanged(null);
    }
    
}
