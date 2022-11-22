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
    private List<Citizen> listCitizen;

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
    
    public static RegistrationBook getInstace(){
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
                md.addRow(new Object[]{rgb.getID()+"",rgb.getHouseholdHead()+"",rgb.getHouseholdHead()+"",rgb.getHouseNumber()+"",rgb.getStreet()+"",rgb.getWard()+"",rgb.getDistrict()+""});
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
    
    
}
