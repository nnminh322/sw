/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connection.ConnectionToXampp;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import view.CitizenOfRGB;
import view.CitizenViewPanel;

/**
 *
 * @author sv_minhnn
 */
public class RegistrationBook {

    private String ID;
    private int householdNumber;
    private String householdHead;
    private int houseNumber;
    private String street;
    private String ward;
    private String district;
    public List<Citizen> listCitizen;

    public RegistrationBook(String ID, int householdNumber, String householdHead, int houseNumber, String street, String ward, String district) {
        this.ID = ID;
        this.householdNumber = householdNumber;
        this.householdHead = householdHead;
        this.houseNumber = houseNumber;
        this.street = street;
        this.ward = ward;
        this.district = district;
    }

    public RegistrationBook(String ID, int householdNumber, String householdHead, int houseNumber, String street, String ward, String district, List<Citizen> listCitizen) {
        this.ID = ID;
        this.householdNumber = householdNumber;
        this.householdHead = householdHead;
        this.houseNumber = houseNumber;
        this.street = street;
        this.ward = ward;
        this.district = district;
        this.listCitizen = listCitizen;
    }

    public RegistrationBook() {
        super();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getHouseholdNumber() {
        return householdNumber;
    }

    public void setHouseholdNumber(int householdNumber) {
        this.householdNumber = householdNumber;
    }

    public String getHouseholdHead() {
        return householdHead;
    }

    public void setHouseholdHead(String householdHead) {
        this.householdHead = householdHead;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public List<Citizen> getListCitizen() {
        return listCitizen;
    }

    public void setListCitizen(List<Citizen> listCitizen) {
        this.listCitizen = listCitizen;
    }

    public void insertCitizen(Citizen ctz) {
        this.listCitizen.add(ctz);
    }

    public static RegistrationBook getInstace() {
        return new RegistrationBook();
    }

    public List<RegistrationBook> show(DefaultTableModel md) {
        List<RegistrationBook> listRegistrationBook = new ArrayList<RegistrationBook>();
        try {
            Connection conn = ConnectionToXampp.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM RegistrationBook";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String ID = rs.getString("ID");
                int householdNumber = rs.getInt("HOUSEHOLDNUMBER");
                String householdHead = rs.getString("HOUSEHOLDHEAD");
                int houseNumber = rs.getInt("HOUSENUMBER");
                String street = rs.getString("STREET");
                String ward = rs.getString("WARD");
                String district = rs.getString("DISTRICT");

                RegistrationBook rgb = new RegistrationBook(ID, householdNumber, householdHead, houseNumber, street, ward, district);
                md.addRow(new Object[]{rgb.getID() + "", rgb.getHouseholdNumber() + "", rgb.getHouseholdHead() + "", rgb.getHouseNumber() + "", rgb.getStreet() + "", rgb.getWard() + "", rgb.getDistrict() + ""});
                listRegistrationBook.add(rgb);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listRegistrationBook;
    }

    @Override
    public String toString() {
        return "RegistrationBook{" + "ID=" + ID + ", householdNumber=" + householdNumber + ", householdHead=" + householdHead + ", houseNumber=" + houseNumber + ", street=" + street + ", ward=" + ward + ", district=" + district + '}';
    }

    public List<Citizen> addCitizenToRGB(List<Citizen> listCitizen, int i) {

        try {
            Connection conn = ConnectionToXampp.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM Citizen Where HOUSEHOLDNUMBER LIKE " + i;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String fullName = rs.getString("FULLNAME");
                String nickName = rs.getString("NICKNAME");
                Date dateOfBirth = rs.getDate("DATEOFBIRTH");
                String birthPlace = rs.getString("BIRTHPLACE");
                String domicile = rs.getString("DOMICILE");
                String ethnic = rs.getString("ETHNIC");
                String job = rs.getString("JOB");
                String workPlace = rs.getString("WORKPLACE");
                String citizenID = rs.getString("CITIZENID");
                Date dateRange = rs.getDate("DATERANGE");
                String issuedBy = rs.getString("ISSUEDBY");
                String relationWithHouseholdHead = rs.getString("RELATIONWITHHOUSEHOLDHEAD");
                String gender = rs.getString("GENDER");
                String householdNumber1 = rs.getString("HOUSEHOLDNUMBER");

                Citizen ctz = new Citizen(fullName, nickName, dateOfBirth, birthPlace, domicile, ethnic, job, workPlace, citizenID, dateRange, issuedBy, relationWithHouseholdHead, householdNumber1, gender);
                listCitizen.add(ctz);
                System.out.println(ctz.getFullName());

            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listCitizen;
    }

    public void showDetail(CitizenOfRGB citizenOfRGB, RegistrationBook rgb) {
        for (int i = 0; i < rgb.getListCitizen().size(); i++) {
            CitizenViewPanel citizenViewPanel = new CitizenViewPanel();

            citizenViewPanel.getjTextField_relationwithhouseholdhead().setText(rgb.getListCitizen().get(i).getRelationWithHouseholdHead());
            citizenViewPanel.getjTextField_fullname().setText(rgb.getListCitizen().get(i).getFullName());
            citizenViewPanel.getjTextField_nickname().setText(rgb.getListCitizen().get(i).getNickName());
            citizenViewPanel.getjTextField_dateofbirth().setText(rgb.getListCitizen().get(i).getDateOfBirth() + "");
            citizenViewPanel.getjTextField_gender().setText(rgb.getListCitizen().get(i).getGender());
            citizenViewPanel.getjTextField_birthplace().setText(rgb.getListCitizen().get(i).getBirthPlace());
            citizenViewPanel.getjTextField_domicile().setText(rgb.getListCitizen().get(i).getDomicile());
            citizenViewPanel.getjTextField_ethnic().setText(rgb.getListCitizen().get(i).getDomicile());
            //ton giao
            citizenViewPanel.getjTextField_job().setText(rgb.getListCitizen().get(i).getJob());
            citizenViewPanel.getjTextField14().setText(rgb.getListCitizen().get(i).getWorkPlace());
            citizenViewPanel.getjTextField_citizenid().setText(rgb.getListCitizen().get(i).getCitizenID());
            citizenViewPanel.getjTextField_issuedby().setText(rgb.getListCitizen().get(i).getIssuedBy());
            citizenViewPanel.getjTextField_daterange().setText(rgb.getListCitizen().get(i).getDateRange() + "");

            citizenOfRGB.AddCitizenToRegistrationBookView(citizenViewPanel);
        }
    }

}
