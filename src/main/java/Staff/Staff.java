package Staff;

import java.util.ArrayList;

public abstract class Staff {

    // properties

    protected String name;
    protected int age;
    protected String gender;
    protected String title;
    protected ArrayList<Staff> Staff;

    public Staff(ArrayList<Staff> allStaff) {
        this.Staff = new ArrayList<>();
    }

    // Constructor

    public Staff(String name, int age, String gender, String title) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.title = title;
    }

    // getters and Setters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getTitle() {
        return title;
    }


    // Behaviours/ Methods

    public abstract String introduce();

    }


