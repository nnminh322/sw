/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Citizen;

/**
 *
 * @author nnminh322
 */
public class CitizenController {
    private Citizen ctz;
    private List<Citizen> listCtz;
    
    public void showCitizen(DefaultTableModel md){
        ctz = new Citizen();
        ctz.show(md);
    }
}
