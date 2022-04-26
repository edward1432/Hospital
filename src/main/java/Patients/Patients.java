package Patients;

public class Patients {

    private String name;
    private String gender;
    private String ailment;
    private boolean willRecover;

    // constructors
    public Patients(String name, String gender, String ailment, boolean willRecover) {
        this.name = name;
        this.gender = gender;
        this.ailment = ailment;
        this.willRecover = willRecover;
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

    public boolean isWillRecover() {
        return willRecover;
    }

    public void setWillRecover(boolean willRecover) {
        this.willRecover = willRecover;
    }
}
