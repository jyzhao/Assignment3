/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.ArrayList;


/**
 *
 * @author zhaojiyuan
 */
public class Patient {
    private ArrayList<VitalSign> vitalSignList;

    private String patientName;
    private String patientID;
    private int age;
    private String primaryDoctorName;
    private String preferredPharmacy;
   

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }

    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }

    public String getPreferredPharmacy() {
        return preferredPharmacy;
    }

    public void setPreferredPharmacy(String preferredPharmacy) {
        this.preferredPharmacy = preferredPharmacy;
    }
  
    public Patient() {
        vitalSignList = new ArrayList<>();
        
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public VitalSign addVitalSign() {
        VitalSign vitalSign = new VitalSign();
        this.vitalSignList.add(vitalSign);
        return vitalSign;
    }
    
    public void removeVitalSign(VitalSign vitalSign) {
        this.vitalSignList.remove(vitalSign);
    }
   
    @Override
    public String toString() {
        return patientName;
    }
    
}
