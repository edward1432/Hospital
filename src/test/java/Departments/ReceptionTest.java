package Departments;

import Patients.Patients;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceptionTest {

    @Test
    void assignPatients(){
        Reception reception = new Reception(true);
        assertEquals("Admitted to Cardiology", reception.checkIn(new Patients("Edward", "Male","Heart attack",45667865)));
    }
}