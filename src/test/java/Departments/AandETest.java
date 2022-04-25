package Departments;

import Patients.Patients;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AandETest {

    private AandE aAndE;

    @BeforeEach
      void setup(){
        AandE aAndE = new AandE(true);
    }

    @Test
    void startsWithZero(){
        AandE aAndE = new AandE(true);
        assertEquals(0, aAndE.patientsHere.size());
    }
}