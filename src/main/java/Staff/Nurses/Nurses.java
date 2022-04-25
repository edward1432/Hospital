package Staff.Nurses;


import Staff.Staff;

import java.util.ArrayList;

public class Nurses extends Staff {

    // constructor

    // adding new nurse to array list

    public Nurses(String name, int age, String gender, String title) {
        super(name, age, gender, title);
    }

    // intro method - body

    public String introduce() {
        return ("Hi there, my name is Nurse " + name + " and my role is " + title);
    }
}
