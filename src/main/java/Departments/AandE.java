package Departments;

import Patients.Patients;
import Staff.Staff;

import java.util.ArrayList;

public class AandE extends Department implements AdmittingPatients{

    public AandE(boolean open){
        super( true);
    }

    public void addPatients(Patients patients){
        patientsHere.add(patients);
    }
}
