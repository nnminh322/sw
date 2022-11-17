/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author sv_minhnn
 */
public class Citizen {
    private String fullName;
    private String nickName;
    private Date dateOfBirth;
    private String birthPlace;
    private String domicile;
    private String ethnic;
    private String job;
    private String workPlace;
    private String CitizenID;
    private Date dateRange;
    private String issuedBy;
    private String relationWithHouseholdHead;
    private String householdNumber;
    private List<Permanent> listPermanent;
    private String note;

    public Citizen(String fullName, String nickName, Date dateOfBirth, String birthPlace, String domicile, String ethnic, String job, String workPlace, String CitizenID, Date dateRange, String issuedBy, String relationWithHouseholdHead, String householdNumber, List<Permanent> listPermanent, String note) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.dateOfBirth = dateOfBirth;
        this.birthPlace = birthPlace;
        this.domicile = domicile;
        this.ethnic = ethnic;
        this.job = job;
        this.workPlace = workPlace;
        this.CitizenID = CitizenID;
        this.dateRange = dateRange;
        this.issuedBy = issuedBy;
        this.relationWithHouseholdHead = relationWithHouseholdHead;
        this.householdNumber = householdNumber;
        this.listPermanent = listPermanent;
        this.note = note;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getCitizenID() {
        return CitizenID;
    }

    public void setCitizenID(String CitizenID) {
        this.CitizenID = CitizenID;
    }

    public Date getDateRange() {
        return dateRange;
    }

    public void setDateRange(Date dateRange) {
        this.dateRange = dateRange;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getRelationWithHouseholdHead() {
        return relationWithHouseholdHead;
    }

    public void setRelationWithHouseholdHead(String relationWithHouseholdHead) {
        this.relationWithHouseholdHead = relationWithHouseholdHead;
    }

    public String getHouseholdNumber() {
        return householdNumber;
    }

    public void setHouseholdNumber(String householdNumber) {
        this.householdNumber = householdNumber;
    }

    public List<Permanent> getListPermanent() {
        return listPermanent;
    }

    public void setListPermanent(List<Permanent> listPermanent) {
        this.listPermanent = listPermanent;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    public void insertPermanent(Permanent p){
        this.listPermanent.add(p);
    }
    
}
