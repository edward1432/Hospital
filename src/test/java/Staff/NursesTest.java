package Staff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NursesTest {

    @Test
    void canAddNurses(){
        Nurses nurse1 = new Nurses("Ratched", 30, "Female", "Adult Nurse");
        assertEquals("Hi there, my name is Nurse Ratched and my role is Adult Nurse", nurse1.introduce());
    }


}