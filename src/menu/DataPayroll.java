package menu;
import entity.*;
import repository.*;
import java.util.Scanner;
import java.util.List;


public class DataPayroll {

    public DataPayroll() {

    }

    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        RepositoryEmployee repository = new RepositoryEmployee();
        List<Employee> employees = repository.getEmployees();
        double totalSalary = 0;
        System.out.printf("| %-5s | %-15s | %-10s | %-15s | %-20s | %-15s | %-15s | %-15s | \n", "No", "Employee Id", "Name", "Address", "Job Desc", "Placement", "Allowance", "Salary");
        int counter = 1;
        for (Employee employee : employees) {
            double salary = employee.calculateSalary();
            double allowance = employee.calculateAllowance();

            System.out.printf("| %-5d | %-15s | %-10s | %-15s | %-20s | %-15s | %-15.0f | %-15.0f | \n", counter++, employee.getEmployeeId(), employee.getName(), employee.getAdress(), employee.getJobdesc(), employee.getPlacement(), employee.calculateAllowance(), employee.calculateSalary());
            totalSalary += employee.calculateSalary();
        }System.out.printf("| %-5d |%-16s |%88s |%-16.0f |\n", counter, "Total Payroll", " ", totalSalary);

        System.out.printf("| %-5d | %-123s |",0,"Kembali Kemain Menu");
        System.out.println(" ");
        System.out.println("Input");
        int input = sc.nextInt();
        switch (input){
            case 0:
                new Main().showMain();
                break;
            default:
                System.out.println("Opsi tidak valid!");
                showMenu();

        }
    }
}
