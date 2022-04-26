package Staff;


import Patients.Patients;
import Staff.Staff;

public class CanteenStaff extends Staff implements IntroduceSelf{

        private String todaySpecial;

        public String getTodaySpecial() {
            return todaySpecial;
        }

        public void setTodaySpecial(String todaySpecial) {
            this.todaySpecial = todaySpecial;
        }

        public CanteenStaff(String name, int age, String gender, String title) {
            super(name, age, gender, title);

        }

    @Override
    public String canIHelp() {
        return ("We have many dishes on offer, please take a look at our menu" );
    }

    // intro method - body

        public String introduce() {
            return ("Hi there, what can I get for you? Today's special is: " + todaySpecial);
        }


    }

