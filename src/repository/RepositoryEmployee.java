package repository;
import entity.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RepositoryEmployee {
    public static List <Employee> employees;
    public static List <Placement> placements;
    public static List <Programer> programers;
    public static List <ProjectLeader> projectLeaders;
    public static List <Analyst> analysts;

    public RepositoryEmployee(){
        this.employees = new ArrayList<>();
        this.placements = new ArrayList<>();
        this.programers = new ArrayList<>();
        this.projectLeaders = new ArrayList<>();
        this.analysts = new ArrayList<>();



        addEmployees();
        addPlacements();
        addProgramers();
        addProjectLeaders();
        addAnalysts();

    }
    public void addEmployees() {
        employees.add(new Employee("Emp-001", "Susi", "Bandung", 27, "Admin", "Jakarta",0));
        employees.add(new Employee("Emp-002", "Anto", "Bandung", 35, "Office Boy", "Bandung", 0));
        employees.add(new Employee("Emp-003", "Riman", "Jakarta", 28, "Human Resource Dev", "Bandung", 0));
        employees.add(new Employee("Prog-001", "Budi", "Bandung", 25, "Back End Dev", "Jakarta", 0));
        employees.add(new Employee("Prog-002", "Ani", "Bandung", 30, "Front End Dev", "Bandung", 0));
        employees.add(new Employee("Prog-003", "Ujang", "Jakarta", 28, "Full Stack Dev", "Bandung", 0));
        employees.add(new Employee("PL-001", "Ahmad", "Bandung", 25, "Project Leader", "Garut",0));
        employees.add(new Employee("PL-002", "Dani", "Bandung", 30, "Scrum Master", "Bekasi", 0));
        employees.add(new Employee("PL-003", "Cecep", "Jakarta", 28, "Project Owner", "Bogor", 0));
        employees.add(new Employee("AL-001", "Indah", "Garut", 25, "Analyst", "Jakarta", 0));
        employees.add(new Employee("AL-002", "Puspa", "Bandung", 30, "Analyst", "Bekasi", 0));
        employees.add(new Employee("AL-003", "Sari", "Jakarta", 28, "Analyst", "Bogor", 0));
    }
    public void addPlacements() {
        placements.add(new Placement("Garut", 1961085));
        placements.add(new Placement("Bandung", 3742276));
        placements.add(new Placement("Jakarta", 4453935));
        placements.add(new Placement("Bekasi", 4782935));
        placements.add(new Placement("Bogor", 4330249));
    }
    public void addProgramers(){
        programers.add(new Programer("Prog-001","Budi","Bandung",25,"Back End Dev", "Jakarta","Java",2,0,0));
        programers.add(new Programer("Prog-002","Ani","Bandung",30,"Front End Dev", "Bandung","React Js",6,0,0));
        programers.add(new Programer("Prog-003","Ujang","Jakarta",28,"Full Stack Dev", "Bandung","Kotlin",4,0,0));
    }

    public void addProjectLeaders(){
        projectLeaders.add(new ProjectLeader("PL-001","Ahmad","Bandung",25,"Project Leader", "Garut",2,0,0));
        projectLeaders.add(new ProjectLeader("PL-002","Dani","Bandung",30,"Scrum Master", "Bekasi",1,0,0));
        projectLeaders.add(new ProjectLeader("PL-003","Cecep","Jakarta",28,"Project Owner", "Bogor",4,0,0));
    }
    public void addAnalysts(){
        analysts.add(new Analyst("AL-001", "Indah", "Garut", 25, "Analyst", "Jakarta", 0, 0));
        analysts.add(new Analyst("AL-002", "Puspa", "Bandung", 30, "Analyst", "Bekasi", 0, 0));
        analysts.add(new Analyst("AL-003", "Sari", "Jakarta", 28, "Analyst", "Bogor", 0, 0));
    }


    public List<Employee> getEmployees() {
        return employees;
    }
    public List<Placement> getPlacements() {
        return placements;
    }
    public List<Programer> getProgramers() {
        return programers;
    }
    public List<ProjectLeader> getProjectLeaders() {
        return projectLeaders;
    }
    public static List<Analyst> getAnalysts() {
        return analysts;
    }

    public void addEmployees(String employeeId, String name, String address, int age, String jobDesc, String placement, double salary) {
        Employee newEmployee = new Employee(employeeId, name, address, age, jobDesc, placement, salary);
        employees.add(newEmployee);
    }
    public void addPlacements(String placement) {}

    public void removeEmployees(String employeeId) {

        Iterator<Employee> iterator = employees.iterator();


        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmployeeId().equals(employeeId)) {
                iterator.remove();
                System.out.println("Employee with ID " + employeeId + " has been removed.");
                return;
            }
        }

        System.out.println("Employee with ID " + employeeId + " not found.");
    }
    public void updateEmployeePlacement(String employeeId, String newPlacement) {
        List <Employee> employees = getEmployees();
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                employee.setPlacement(newPlacement);
                System.out.println("Placement for employee with EmployeeId " + employeeId + " updated successfully.");
                return;
            }
        }
        System.out.println("Employee with EmployeeId " + employeeId + " not found.");
    }


}
