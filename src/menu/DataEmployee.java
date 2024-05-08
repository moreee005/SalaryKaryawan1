package menu;

import entity.Employee;
import repository.RepositoryEmployee;

import java.util.List;
import java.util.Scanner;
public class DataEmployee {
    public DataEmployee(){

    }
    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        RepositoryEmployee repository = new RepositoryEmployee();
        List<Employee> employees = repository.getEmployees();
        System.out.printf("| %-5s | %-15s | %-10s | %-15s | %-10s | %-20s | %-15s | \n", "No", "Employee Id", "Name", "Address","Age", "Job Desc", "Placement");
        int counter = 1;
        for (Employee employee : employees) {
            System.out.printf("| %-5d ",counter++);
            employee.displayDetails();
        }System.out.printf("| %-5d | %-100s |",0,"Kembali Kemain Menu");
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
