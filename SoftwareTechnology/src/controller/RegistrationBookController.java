/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.RegistrationBook;
import view.CitizenOfRGB;
import view.CitizenViewPanel;

/**
 *
 * @author nnminh322
 */
public class RegistrationBookController {
    private RegistrationBook rgb;
    private List<RegistrationBook> listRgb;
    public CitizenViewPanel citizenViewPanel;

    public RegistrationBook getRgb() {
        return rgb;
    }

    public void setRgb(RegistrationBook rgb) {
        this.rgb = rgb;
    }

    public List<RegistrationBook> getListRgb() {
        return listRgb;
    }

    public void setListRgb(List<RegistrationBook> listRgb) {
        this.listRgb = listRgb;
    }

    public RegistrationBookController getInstance(){
        return new RegistrationBookController();
    }
    
    public RegistrationBookController() {
        super();
    }
    
    
    
    public void showRegistrationBook(DefaultTableModel md){
        rgb = new RegistrationBook();
        this.setListRgb(rgb.show(md));
    }

    public void showDetailRgb(int i, CitizenOfRGB citizenOfRGB) {
        for (int j = 0; j < listRgb.get(i).listCitizen.size(); j++) {
            citizenViewPanel = new CitizenViewPanel();
            listRgb.get(i).listCitizen.get(j).showDetailjpn(citizenViewPanel ,listRgb.get(i).listCitizen.get(j));
        }
//        listRgb.get(i).showDetail(citizenOfRGB, listRgb.get(i));
    }

    public void addListCitizen(int i) {
        this.listRgb.get(i).listCitizen = new ArrayList<>();
        this.listRgb.get(i).addCitizenToRGB(this.listRgb.get(i).listCitizen, this.listRgb.get(i).getHouseNumber());
    }
        
        
    
    
}
