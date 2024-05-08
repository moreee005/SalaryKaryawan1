package entity;

public class ProjectLeader extends Employee{
    private int totalProject;
    private double allowance;

    public ProjectLeader(String employeeId, String name, String address, int age, String jobDesc,String placement, int totalProject,double allowance, double salary) {
        super(employeeId, name, address, age, jobDesc, placement, salary);
        this.totalProject = totalProject;
        this.allowance = allowance;
    }
    public int getTotalProject() {return totalProject;}
    public double getAllowance() {return allowance;}
}
