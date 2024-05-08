package entity;

public class Analyst extends Employee {
    private double allowance;

    public Analyst(String employeeId, String name, String address, int age, String jobDesc,String placement,double allowance, double salary){
        super(employeeId, name, address, age, jobDesc, placement, salary);
        this.allowance = allowance;
    }
    public double getAllowance() {return allowance;}
}
