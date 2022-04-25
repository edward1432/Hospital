package Patients;

public class Patients {

    private String name;
    private String gender;
    private String ailment;
    private int IDNumber;

    // constructors
    public Patients(String name, String gender, String ailment, int IDNumber) {
        this.name = name;
        this.gender = gender;
        this.ailment = ailment;
        this.IDNumber = IDNumber;
    }

    // getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }


}
