package entity;

import repository.RepositoryEmployee;

import java.util.List;

public class Employee {
    private String employeeId;
    private String name;
    private String adress;
    private int age;
    private String jobDesc;
    private String placement;
    private double salary;

    public Employee(String employeeId, String name, String adress, int age, String jobDesc, String placement, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.jobDesc = jobDesc;
        this.placement = placement;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getAge() {
        return age;
    }

    public String getJobdesc() {
        return jobDesc;
    }

    public String setPlacement(String placement) {
        this.placement = placement;
        return placement;
    }

    public String getPlacement() {
        return placement;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double calculateSalary() {
        String placement = getPlacement();
        double umk = getUMK(placement);
        double salary = 0;

        salary = umk;

        if (getJobdesc().equals("Back End Dev") || getJobdesc().equals("Front End Dev") || getJobdesc().equals("Full Stack Dev")) {
            salary *= 1.5; // 150% dari UMK
        } else if (getJobdesc().equals("Project Leader") || getJobdesc().equals("Scrum Master" ) || getJobdesc().equals("Project Owner")) {
            salary *= 2.0; // 200% dari UMK
        } else if (getJobdesc().equals("Analyst")) {
            salary *= 1.6; // 160% dari UMK
        }

        return salary;
    }

    private double getUMK(String placement) {
        switch (getPlacement()) {
            case "Garut":
                return 1961085;
            case "Bandung":
                return 3742276;
            case "Jakarta":
                return 4453935;
            case "Bekasi":
                return 4782935;
            case "Bogor":
                return 4330249;
            default:
                return 0;
        }


    }
    public double calculateAllowance() {
        double salary = calculateSalary();
        double allowance = 0;
        RepositoryEmployee repository = new RepositoryEmployee();
        List<Programer> programers = repository.getProgramers();
        List<ProjectLeader> projectLeaders = repository.getProjectLeaders();
        List<Analyst> analysts = repository.getAnalysts();
        for(Programer programer : programers) {
            for(ProjectLeader projectLeader : projectLeaders) {
                for(Analyst analyst : analysts) {
                    if(programer.getExperience() > 4 && programer.getName().equals(getName())) {
                        allowance = salary * 0.20;
                    }else if(programer.getExperience() < 5 && programer.getName().equals(getName())) {
                        allowance = salary * 0.10;
                    }else if(projectLeader.getTotalProject() >= 2 && projectLeader.getName().equals(getName())) {
                        allowance = salary * 0.15;
                    }else if(projectLeader.getTotalProject() < 2 && projectLeader.getName().equals(getName())) {
                    allowance = salary * 0.05;
                    }else if(analyst.getEmployeeId().equals(getEmployeeId())) {
                    allowance = salary * 0.05;
                    }
                }
            }

        }
        return allowance;
    }



    public void displayDetails () {
        System.out.printf("| %-15s | %-10s | %-15s | %-10d | %-20s | %-15s | \n", employeeId, name, adress, age,jobDesc, this.placement);
    }
}