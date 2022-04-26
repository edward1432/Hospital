package Staff;

public abstract class Staff {

    // properties

    protected String name;
    protected int age;
    protected String gender;
    protected String title;


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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Behaviour - can i help you?

    public abstract String canIHelp();
}

