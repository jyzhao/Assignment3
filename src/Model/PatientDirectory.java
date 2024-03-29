/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
/**
 *
 * @author zhaojiyuan
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;
    public PatientDirectory() {
        this.patientDirectory = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Patient createAndAddAccount() {
            Patient patient = new Patient();
            patientDirectory.add(patient);
            return patient;
        }
    
    public void deletePatient (Patient patient) {
        patientDirectory.remove(patient);
    }
    
    public Patient searchUsingPatientID (String patientID) {
        for (Patient account: patientDirectory) {
            if (account.getPatientID().equals(patientID)) {
                return account;
            }
        }
        return null;
    }
    
}
