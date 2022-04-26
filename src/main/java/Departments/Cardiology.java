package Departments;

import Patients.Patients;

public class Cardiology extends Department implements AdmittingPatients {

    public Cardiology(boolean open){
        super(true);
    }

    public void addPatients(Patients patients){
        patientsHere.add(patients);
    }
}
