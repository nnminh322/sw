/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Citizen;
import model.RegistrationBook;
import view.BirthView;
import view.CitizenOfRGB;
import view.CitizenViewPanel;

/**
 *
 * @author nnminh322
 */
public class RegistrationBookController {
    public DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private Citizen ctz;
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

    public RegistrationBookController getInstance() {
        return new RegistrationBookController();
    }

    public RegistrationBookController() {
        super();
    }

    public void showRegistrationBook(DefaultTableModel md) {
        rgb = new RegistrationBook();
        this.setListRgb(rgb.show(md));
    }

    public void showDetailRgb(int i, CitizenOfRGB citizenOfRGB) {
        for (int j = 0; j < listRgb.get(i).listCitizen.size(); j++) {
            citizenViewPanel = new CitizenViewPanel();
            listRgb.get(i).listCitizen.get(j).showDetailjpn(citizenViewPanel, listRgb.get(i).listCitizen.get(j));
            citizenOfRGB.AddCitizenToRegistrationBookView(citizenViewPanel);
        }
    }

    public void addListCitizen(int i) {
        this.listRgb.get(i).listCitizen = new ArrayList<>();
        this.listRgb.get(i).addCitizenToRGB(this.listRgb.get(i).listCitizen, this.listRgb.get(i).getHouseholdNumber());
    }

    public void BirthCitizen(BirthView birthView, int i) throws ParseException {
        String fullName = birthView.getCitizenViewPanel().getjTextField_fullname().getText();
        String nickName = birthView.getCitizenViewPanel().getjTextField_nickname().getText();
        Date dateOfBirth = df.parse(birthView.getCitizenViewPanel().getjTextField_dateofbirth().getText());
//        Date dateOfBirth = birthView.getCitizenViewPanel().getjTextField_dateofbirth().ge();
        String gender = birthView.getCitizenViewPanel().getjTextField_gender().getText();
        String birthPlace = birthView.getCitizenViewPanel().getjTextField_gender().getText();
        String domicile = birthView.getCitizenViewPanel().getjTextField_domicile().getText();
        String ethnic = birthView.getCitizenViewPanel().getjTextField_ethnic().getText();
//        String region = birthView.getCitizenViewPanel().getjTextField_nickname().getText();
        ctz = new Citizen(fullName, nickName, dateOfBirth, birthPlace, domicile, ethnic, gender);
//        this.listRgb = new ArrayList<>();
//        this.addListCitizen(i);
        ctz.setHouseholdNumber(Integer.toString(this.listRgb.get(i).getHouseholdNumber()));
//        System.out.println(ctz.toString());
//        System.out.println(ctz.getHouseholdNumber());
        ctz.insertCitizen(ctz);

    }
}
