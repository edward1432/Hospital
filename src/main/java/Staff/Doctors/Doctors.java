package Staff.Doctors;

import Staff.Staff;

import java.util.ArrayList;

public class  Doctors extends Staff {


   // constructor

    public Doctors(String name, int age, String gender, String title, ArrayList<Doctors> doctors) {
        super(name, age, gender, title);
    }

    public Doctors(String name, int age, String gender, String title) {
        super(name, age, gender, title);
    }

    // intro method - body

    public String introduce() {
        return ("Hi there, my name is Dr. " + name + " and my role is " + title);
    }

}
