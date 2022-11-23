/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.RegistrationBook;

/**
 *
 * @author nnminh322
 */
public class RegistrationBookController {
    private RegistrationBook rgb;
    private ArrayList<RegistrationBook> listRgb;

    public RegistrationBookController getInstance(){
        return new RegistrationBookController();
    }
    
    public RegistrationBookController() {
        super();
    }
    
    
    
    public void showRegistrationBook(DefaultTableModel md){
        rgb = new RegistrationBook();
        rgb.show(md);
    }
    
    
}
