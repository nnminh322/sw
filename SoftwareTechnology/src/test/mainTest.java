/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.sun.jdi.connect.spi.Connection;
import com.sun.source.tree.TryTree;
import connection.ConnectionToXampp;
import javax.swing.table.DefaultTableModel;
import model.RegistrationBook;
import view.Home;
import view.Login;

/**
 *
 * @author sv_minhnn
 */
public class mainTest {
    public static void main(String[] args) {
        RegistrationBook rb = new RegistrationBook("555", 1, "natmin", 22, "pm", "hbt", "dd");
        Home l = new Home();
        DefaultTableModel md = (DefaultTableModel) l.getjTable1().getModel();
        md.addRow(new Object[]{rb.getID()+"",rb.getHouseholdNumber()+"",rb.getHouseholdHead()+"",rb.getHouseNumber()+"",rb.getStreet()+"",rb.getWard()+"",rb.getDítrict()+""});
    }
}
