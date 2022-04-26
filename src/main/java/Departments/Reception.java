package Departments;

import Patients.Patients;

public class Reception extends Department{

    protected Cardiology cardiology;
    protected AandE aAndE;


    public Reception(boolean open) {
        super(open);
    }

    public String checkIn(Patients patient){

        AandE aAndE = new AandE(true);
        Cardiology cardiology = new Cardiology(true);

        if (patient.getAilment() == "Broken leg"){
            aAndE.addPatients(patient);
            return ("Admitted to A&E");
        } else if (patient.getAilment() == "Heart attack"){
            cardiology.addPatients(patient);
            return ("Admitted to Cardiology");
        } else {
            return ("Sorry, we cannot treat your condition!");
        }
    }
}
