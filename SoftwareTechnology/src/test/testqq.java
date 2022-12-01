/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Citizen;
import view.CitizenOfRGB;
import view.CitizenViewPanel;

/**
 *
 * @author sv_minhnn
 */
public class testqq {

    public static CitizenOfRGB citizenOfRGB;
    public static CitizenViewPanel citizenViewPanel;
    public static CitizenViewPanel citizenViewPanel1;
    public static CitizenViewPanel citizenViewPanel2;

    public static Citizen citizen;

    public static void main(String[] args) throws ParseException {
        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse("04-03-2002");
        Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse("01-09-2017");
        Citizen t = new Citizen("Nguyen Nhat Minh", "natmin", date1, "Tan Trao, Thanh Mien, Hai Duong", "Tan Trao, Thanh Mien, Hai Duong", "Kinh", "developer", "Landmard 72", "030202002902", date2, "Cuc canh sat", "Chủ hộ", "1", "Nam");
        citizenOfRGB = new CitizenOfRGB();
        citizenViewPanel = new CitizenViewPanel();
        citizenViewPanel1 = new CitizenViewPanel();
        citizenViewPanel2 = new CitizenViewPanel();
        
//        citizenViewPanel.getjTextField_fullname().setEditable(false);
        
        t.showDetailjpn(citizenViewPanel, t);
        t.showDetailjpn(citizenViewPanel1, t);
//        t.showDetailjpn(citizenViewPanel2, t);

        citizenViewPanel2.lockForBirth();
        citizenOfRGB.AddCitizenToRegistrationBookView(citizenViewPanel);
        citizenOfRGB.AddCitizenToRegistrationBookView(citizenViewPanel1);
        citizenOfRGB.AddCitizenToRegistrationBookView(citizenViewPanel2);
        for (int i = 0; i < 10; i++) {
            citizenViewPanel = new CitizenViewPanel();
            t.showDetailjpn(citizenViewPanel, t);

            citizenOfRGB.AddCitizenToRegistrationBookView(citizenViewPanel);

        }

        citizenOfRGB.setVisible(true);
    }
}
