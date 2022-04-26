package Staff;


import Staff.Staff;

import java.util.ArrayList;

public class Nurses extends Staff implements IntroduceSelf, TreatPatients{

    // constructor

    // adding new nurse to array list

    public Nurses(String name, int age, String gender, String title) {
        super(name, age, gender, title);
    }

    @Override
    public String canIHelp() {
        return ("Do you need any medication?");
    }

    // intro method - body

    public String introduce() {
        return ("Hi there, my name is Nurse " + name + " and my role is " + title);
    }

    public boolean treatPatients(){
        if (Math.random() == 0){
            return false;
        } else return true;


    }
}
