package Departments;

import Patients.Patients;
import Staff.Staff;

import java.util.ArrayList;

public abstract class Department {
    protected boolean open = true;
    protected ArrayList<Staff> staffHere;
    protected ArrayList<Patients> patientsHere;
    protected AandE aAndE;
    protected Cardiology cardiology;

    public Department(boolean open) {
        this.open = open;
        this.staffHere = new ArrayList<>();
        this.patientsHere = new ArrayList<>();
    }


    public void open(){
        this.open = true;
    }

    public void close(){
        this.open = false;
    }

    // Method -------

    public void addStaff(Staff staff){
        this.staffHere.add(staff);
    }

    public ArrayList<Staff> getStaffHere() {
        return staffHere;
    }

    public void setStaffHere(ArrayList<Staff> staffHere) {
        this.staffHere = staffHere;
    }

    public ArrayList<Patients> getPatientsHere() {
        return patientsHere;
    }

    public void setPatientsHere(ArrayList<Patients> patientsHere) {
        this.patientsHere = patientsHere;
    }


}
