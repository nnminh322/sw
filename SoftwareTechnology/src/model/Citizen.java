/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connection.ConnectionToXampp;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import view.CitizenView;
import view.CitizenViewPanel;

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
    private String citizenID;
    private Date dateRange;
    private String issuedBy;
    private String relationWithHouseholdHead;
    private String householdNumber;
    private List<Permanent> listPermanent;
    private String note;
    private String gender;

    public Citizen(String fullName, String nickName, Date dateOfBirth, String birthPlace, String domicile, String ethnic, String job, String workPlace, String citizenID, Date dateRange, String issuedBy, String relationWithHouseholdHead, String householdNumber, List<Permanent> listPermanent, String note, String gender) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.dateOfBirth = dateOfBirth;
        this.birthPlace = birthPlace;
        this.domicile = domicile;
        this.ethnic = ethnic;
        this.job = job;
        this.workPlace = workPlace;
        this.citizenID = citizenID;
        this.dateRange = dateRange;
        this.issuedBy = issuedBy;
        this.relationWithHouseholdHead = relationWithHouseholdHead;
        this.householdNumber = householdNumber;
        this.listPermanent = listPermanent;
        this.note = note;
        this.gender = gender;
    }

    public Citizen(String fullName, String nickName, Date dateOfBirth, String birthPlace, String domicile, String ethnic, String job, String workPlace, String citizenID, Date dateRange, String issuedBy, String relationWithHouseholdHead, String householdNumber, String gender) {
        this.fullName = fullName;
        this.nickName = nickName;
        this.dateOfBirth = dateOfBirth;
        this.birthPlace = birthPlace;
        this.domicile = domicile;
        this.ethnic = ethnic;
        this.job = job;
        this.workPlace = workPlace;
        this.citizenID = citizenID;
        this.dateRange = dateRange;
        this.issuedBy = issuedBy;
        this.relationWithHouseholdHead = relationWithHouseholdHead;
        this.householdNumber = householdNumber;
        this.gender = gender;
    }



    public Citizen() {
        super();
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
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void insertPermanent(Permanent p) {
        this.listPermanent.add(p);
    }

    public List<Citizen> show(DefaultTableModel md) {
        List<Citizen> listCitizen = new ArrayList<Citizen>();

        try {
            Connection conn = ConnectionToXampp.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM Citizen";
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
                String householdNumber = rs.getString("HOUSEHOLDNUMBER");
                
                Citizen ctz = new Citizen(fullName, nickName, dateOfBirth, birthPlace, domicile, ethnic, job, workPlace, citizenID, dateRange, issuedBy, relationWithHouseholdHead, householdNumber, gender);
                md.addRow(new Object[]{ctz.getFullName()+"",ctz.getNickName()+"",ctz.getDateOfBirth()+"",ctz.getDomicile()+"",ctz.getEthnic()+"",ctz.getJob()+"",ctz.getCitizenID()+"",ctz.getGender()+"",ctz.getHouseholdNumber()+""});
                listCitizen.add(ctz);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listCitizen;
    }
    
    public void showDetail(CitizenView citizenView, Citizen ctz){
        citizenView.getjTextField_relationwithhouseholdhead().setText(ctz.getRelationWithHouseholdHead());
        citizenView.getjTextField_fullname().setText(ctz.getFullName());
        citizenView.getjTextField_nickname().setText(ctz.getNickName());
        citizenView.getjTextField_dateofbirth().setText(ctz.getDateOfBirth()+"");
        citizenView.getjTextField_gender().setText(ctz.getGender());
        citizenView.getjTextField_birthplace().setText(ctz.getBirthPlace());
        citizenView.getjTextField_domicile().setText(ctz.getDomicile());
        citizenView.getjTextField_ethnic().setText(ctz.getDomicile());
        //ton giao
        citizenView.getjTextField_job().setText(ctz.getJob());
        citizenView.getjTextField14().setText(ctz.getWorkPlace());
        citizenView.getjTextField_citizenid().setText(ctz.getCitizenID());
        citizenView.getjTextField_issuedby().setText(ctz.getIssuedBy());
        citizenView.getjTextField_daterange().setText(ctz.getDateRange()+"");
        
    }
    //
        public void showDetailjpn(CitizenViewPanel newJPanel1, Citizen ctz){
        newJPanel1.getjTextField_relationwithhouseholdhead().setText(ctz.getRelationWithHouseholdHead());
        newJPanel1.getjTextField_fullname().setText(ctz.getFullName());
        newJPanel1.getjTextField_nickname().setText(ctz.getNickName());
        newJPanel1.getjTextField_dateofbirth().setText(ctz.getDateOfBirth()+"");
        newJPanel1.getjTextField_gender().setText(ctz.getGender());
        newJPanel1.getjTextField_birthplace().setText(ctz.getBirthPlace());
        newJPanel1.getjTextField_domicile().setText(ctz.getDomicile());
        newJPanel1.getjTextField_ethnic().setText(ctz.getDomicile());
        //ton giao
        newJPanel1.getjTextField_job().setText(ctz.getJob());
        newJPanel1.getjTextField14().setText(ctz.getWorkPlace());
        newJPanel1.getjTextField_citizenid().setText(ctz.getCitizenID());
        newJPanel1.getjTextField_issuedby().setText(ctz.getIssuedBy());
        newJPanel1.getjTextField_daterange().setText(ctz.getDateRange()+"");
        
    }
}
