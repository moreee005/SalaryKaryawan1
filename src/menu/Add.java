package menu;

import entity.Employee;
import repository.RepositoryEmployee;

import java.util.List;
import java.util.Scanner;
public class Add {
    public Add() {

    }

    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee ID: ");
        String employeeId = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Membuang newline karakter dari buffer

        System.out.print("Job Description: ");
        String jobDesc = sc.nextLine();

        System.out.print("Placement: ");
        String placement = sc.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();


        RepositoryEmployee repository = new RepositoryEmployee();
        repository.addEmployees(employeeId, name, address, age, jobDesc, placement, salary);

    }
}
