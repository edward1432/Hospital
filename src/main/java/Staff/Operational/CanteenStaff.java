package Staff.Operational;


import Staff.Staff;

public abstract class  CanteenStaff extends Staff {

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

        // intro method - body

        public String introduce() {
            return ("Hi there, what can I get for you? Today's special is: " + todaySpecial);
        }

    }
