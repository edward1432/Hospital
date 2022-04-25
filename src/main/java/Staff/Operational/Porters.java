package Staff.Operational;


import Staff.Staff;

public abstract class Porters extends Staff {

        // constructor

        public Porters(String name, int age, String gender, String title) {
            super(name, age, gender, title);
        }

        // intro method - body

        public String introduce() {
            return ("Hi there, my name is  " + name + " and my role is " + title);
        }

    }
