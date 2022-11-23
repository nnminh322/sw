/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author sv_minhnn
 */
public class Permanent {

    private String citizenID;
    private Date registerDate;
    private String previousAddress;
    private String followingAddress;
    private boolean license;

    public Permanent(String citizenID, Date registerDate, String previousAddress, String followingAddress, boolean license) {
        this.citizenID = citizenID;
        this.registerDate = registerDate;
        this.previousAddress = previousAddress;
        this.followingAddress = followingAddress;
        this.license = license;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getPreviousAddress() {
        return previousAddress;
    }

    public void setPreviousAddress(String previousAddress) {
        this.previousAddress = previousAddress;
    }

    public String getFollowingAddress() {
        return followingAddress;
    }

    public void setFollowingAddress(String followingAddress) {
        this.followingAddress = followingAddress;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }
}
