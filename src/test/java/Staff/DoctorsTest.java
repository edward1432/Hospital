package Staff;

import Patients.Patients;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorsTest{

    private Doctors doctors1;

    @BeforeEach
    void setup(){
        doctors1 = new Doctors("Shipman", 50, "Male", "Cardiologist");
    }

    @Test
    void canDischarge(){
        Patients patient1 = new Patients("Ana", "Female", "headache", true);
        assertEquals("Congratulations Ana! You have recovered from your headache. You can now go home.", doctors1.dischargePatient(patient1));

    }

    @Test
    void dischargeDead(){
        Patients patient2 = new Patients("Ana", "Female", "headache", false);
        assertEquals("RIP Ana :(", doctors1.dischargePatient(patient2));
    }


    // overloading testing on doctors
    @Test
    void canIhelp__noArgument(){
        assertEquals("I am off duty, sorry! come back to me at 12", doctors1.canIHelp());
    }

    @Test
    void canIhelp__argument(){
        assertEquals("I'm on my lunch break", doctors1.canIHelp("I'm on my lunch break"));
    }



}