package Staff;

import Departments.DischargingPatients;
import Patients.Patients;

import java.util.ArrayList;

public class  Doctors extends Staff implements IntroduceSelf, TreatPatients, DischargingPatients {


   // constructor

    public Doctors(String name, int age, String gender, String title) {
        super(name, age, gender, title);
    }


    @Override
    public String canIHelp() {
        return ("I am off duty, sorry! come back to me at 12");
    }

    public String canIHelp(String phrase){
        return phrase;
    }

    // intro method - body

    public String introduce() {
        return ("Hi there, my name is Dr. " + name + " and my role is " + title);
    }

    public boolean treatPatients(){
        return true;
    }

    public String dischargePatient(Patients patients) {
        if (patients.isWillRecover()) {
            return "Congratulations " + patients.getName() + "! You have recovered from your " + patients.getAilment() + ". You can now go home.";
        } else
        System.out.println("RIP :( " + patients.getName());
        return "RIP " + patients.getName() + " :(";


    }



}
