/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Akshay
 */
public class PatientList {
    private ArrayList<Patient> patientList;

    public PatientList(){
        this.patientList = new ArrayList<Patient>();
    }
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addPatient(){
        Patient patientObject = new Patient();
        patientList.add(patientObject);
        return patientObject;       
    }
    public void deletePatient(Patient patient){
        patientList.remove(patient);
    }
    
}
