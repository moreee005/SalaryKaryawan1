package menu;

import java.util.List;
import java.util.Scanner;
import entity.*;
import repository.*;

public class Main {
    public static void main(String[] args) {
		Main main = new Main();
		main.showMain();
	}

		public void showMain(){
			while(true) {
				Scanner scanner = new Scanner(System.in);
				System.out.println(" ");
				System.out.println(

						"Menu :\n" +
								"1. Add Employee\n" +
								"2. Edit Employee\n" +
								"3. Data Employee\n" +
								"4. Data Payroll\n" +
								"5. Delete Employee\n" +
								"6. Searching\n" +
								"0. Exit\n");
				int input = scanner.nextInt();
				switch (input) {

					case 1:
						Add.showMenu();
						break;
					case 2:
						new Edit().showMenu();
						break;
					case 3:
						DataEmployee.showMenu();
						break;
					case 4:
						new DataPayroll().showMenu();
						break;
					case 5:
						new Delete().showMenu();
						break;
					default:
						throw new IllegalStateException("Unexpected value: " + input);
				}

			}




		}

}
