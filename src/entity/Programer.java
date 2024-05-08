package entity;

public class Programer extends Employee{
    private String programLang;
    private int experience;
    private double allowance;

    public Programer(String employeeId, String name, String address, int age, String jobDesc,String placement, String programLang, int experience,double allowance, double salary) {
        super(employeeId, name, address, age, jobDesc, placement, salary);
        this.programLang = programLang;
        this.experience = experience;
        this.allowance = allowance;
    }
    public String getProgramLang() {return programLang;}
    public int getExperience() {return experience;}
    public double getAllowance() {return allowance;}

    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}
