package main.java.ExtractClass12.type3;

public class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;

    private TelephoneNumber officeTelephone = new TelephoneNumber();
    // TODO
    public String getTelephoneNumber(){
        return ("(" + getOfficeAreaCode() + ")" + officeNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
