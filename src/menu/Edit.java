package menu;
import java.util.Scanner;
import repository.RepositoryEmployee;

public class Edit {
    public void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        String employeeId = scanner.nextLine();
        System.out.println("Enter new placement:");
        String newPlacement = scanner.nextLine();

        RepositoryEmployee repository = new RepositoryEmployee();
        repository.updateEmployeePlacement(employeeId, newPlacement);

    }


}
