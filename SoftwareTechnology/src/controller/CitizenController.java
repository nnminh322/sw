/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Citizen;
import view.CitizenView;
import view.CitizenViewPanel;

/**
 *
 * @author nnminh322
 */
public class CitizenController {

    private Citizen ctz;
    private List<Citizen> listCtz;

    public Citizen getCtz() {
        return ctz;
    }

    public void setCtz(Citizen ctz) {
        this.ctz = ctz;
    }

    public List<Citizen> getListCtz() {
        return listCtz;
    }

    public void setListCtz(List<Citizen> listCtz) {
        this.listCtz = listCtz;
    }

    public void showCitizen(DefaultTableModel md) {
        ctz = new Citizen();
        this.setListCtz(ctz.show(md));
    }

    public void showDetailCtz(int i, CitizenView citizenView) {
        listCtz.get(i).showDetail(citizenView, listCtz.get(i));
    }
}
