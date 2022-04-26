package Departments;

import Patients.Patients;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceptionTest {

    private Reception reception;

    @BeforeEach
    void setup(){
        reception = new Reception(true);
    }

    @Test
    void assignPatientsToCardiology(){
        assertEquals("Admitted to Cardiology", reception.checkIn(new Patients("Edward", "Male","Heart attack", true)));
    }

    @Test
    void assignPatientsToAAndE(){
        assertEquals("Admitted to A&E", reception.checkIn(new Patients("Ana", "Female","Broken leg", true)));
    }

    @Test
    void rejectPatients(){
        assertEquals("Sorry, we cannot treat your condition!", reception.checkIn(new Patients("Ana", "Female","Headache", false)));
    }


}