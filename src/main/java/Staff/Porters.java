package Staff;


import Staff.Staff;

public class Porters extends Staff{

        // constructor

        public Porters(String name, int age, String gender, String title) {
            super(name, age, gender, title);
        }

    @Override
    public String canIHelp() {
        return ("Are there any patients to be transported?");
    }

}
