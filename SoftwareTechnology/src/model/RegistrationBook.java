/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

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
    private String dítrict;
    private List<Citizen> listCitizen;

    public RegistrationBook(String ID, int householdNumber, String householdHead, int houseNumber, String street, String ward, String dítrict) {
        this.ID = ID;
        this.householdNumber = householdNumber;
        this.householdHead = householdHead;
        this.houseNumber = houseNumber;
        this.street = street;
        this.ward = ward;
        this.dítrict = dítrict;
    }

    
    
    public RegistrationBook(String ID, int householdNumber, String householdHead, int houseNumber, String street, String ward, String dítrict, List<Citizen> listCitizen) {
        this.ID = ID;
        this.householdNumber = householdNumber;
        this.householdHead = householdHead;
        this.houseNumber = houseNumber;
        this.street = street;
        this.ward = ward;
        this.dítrict = dítrict;
        this.listCitizen = listCitizen;
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

    public String getDítrict() {
        return dítrict;
    }

    public void setDítrict(String dítrict) {
        this.dítrict = dítrict;
    }

    public List<Citizen> getListCitizen() {
        return listCitizen;
    }

    public void setListCitizen(List<Citizen> listCitizen) {
        this.listCitizen = listCitizen;
    }
    
    public void insertCitizen(Citizen ctz){
        this.listCitizen.add(ctz);
    }

}
