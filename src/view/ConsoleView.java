/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
import model.FullTimeEmployee;
import model.TemporaryEmployee;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public int displayMainMenu() {
        System.out.println("*** Employee Management ***");
        System.out.println("1. Add employee");
        System.out.println("2. Show employee list");
        System.out.println("3. Sort by descending salary");
        System.out.println("4. Find and delete employee by name");
        System.out.println("5. Show average salary by employee type");
        System.out.println("6. Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        return choice;
    }

    public TemporaryEmployee inputTemporaryEmployee() {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();  // Use nextLine() for String inputs

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        System.out.print("Enter birth date (dd/MM/yyyy): ");
        String birthDate = scanner.nextLine();

        System.out.print("Enter working days: ");
        int workingDays = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        return new TemporaryEmployee(id, lastName, firstName, age, birthDate, workingDays);
    }

    public FullTimeEmployee inputFullTimeEmployee() {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        System.out.print("Enter birth date (dd/MM/yyyy): ");
        String birthDate = scanner.nextLine();

        System.out.print("Enter working days: ");
        int workingDays = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        System.out.print("Enter overtime hours: ");
        int overtimeHours = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        return new FullTimeEmployee(id, lastName, firstName, age, birthDate, workingDays, overtimeHours);
    }

    public String inputEmployeeName() {
        System.out.print("Enter employee's first name: ");
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

