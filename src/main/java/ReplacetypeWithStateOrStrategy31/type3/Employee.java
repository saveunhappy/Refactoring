package main.java.ReplacetypeWithStateOrStrategy31.type3;

public class Employee {
  //  private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private EmployeeType type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public int getType() {
        return type.getTypeCode();
    }
//
    public void setType(int arg) {
        switch (arg){
            case ENGINEER:
                type = new Engineer();
                break;
            case SALESMAN:
                type = new Salesman();
                break;
            case MANAGER:
                type = new Manager();
                break;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }

//    public Employee(int type) {
//        setType(type);
//    }
    public Employee(int type) {
        setType(type);
    }
    int payAmount(){
        switch (getType()){
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}