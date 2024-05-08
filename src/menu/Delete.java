package menu;
import java.util.Scanner;
import repository.RepositoryEmployee;

public class Delete {
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Id");
        String employeeId = sc.nextLine();

        RepositoryEmployee repository = new RepositoryEmployee();
        repository.removeEmployees(employeeId);


    }
}
