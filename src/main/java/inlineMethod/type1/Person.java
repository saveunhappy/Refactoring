package main.java.inlineMethod.type1;

public class Person {
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    private Integer number;


    int getRating(){
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }
    boolean moreThanFiveLateDeliveries(){
        return number > 5;
    }
}
