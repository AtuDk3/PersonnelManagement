/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import model.Employee;
import model.FullTimeEmployee;
import model.TemporaryEmployee;
import view.ConsoleView;

public class MainController {
    private List<Employee> employeeList = new ArrayList<>();
    private ConsoleView view = new ConsoleView();

    public void run() {
        int choice;
        do {
            choice = view.displayMainMenu();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployeeList();
                    break;
                case 3:
                    sortBySalaryDescending();
                    break;
                case 4:
                    findAndDeleteEmployee();
                    break;
                case 5:
                    displayAverageSalary();
                    break;
                case 6:
                    view.displayMessage("Goodbye!");
                    break;
                default:
                    view.displayMessage("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private void addEmployee() {
        System.out.println("1. Add temporary employee");
        System.out.println("2. Add full-time employee");
        int type = view.displayMainMenu();
        if (type == 1) {
            TemporaryEmployee tempEmployee = view.inputTemporaryEmployee();
            tempEmployee.calculateSalary();
            employeeList.add(tempEmployee);
        } else if (type == 2) {
            FullTimeEmployee fullTimeEmployee = view.inputFullTimeEmployee();
            fullTimeEmployee.calculateSalary();
            employeeList.add(fullTimeEmployee);
        }
    }

    private void displayEmployeeList() {
        System.out.println("Employee list:");
        for (Employee employee : employeeList) {
            employee.printInfo();
        }
    }

    private void sortBySalaryDescending() {
        employeeList.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        displayEmployeeList();
    }

    private void findAndDeleteEmployee() {
        String firstName = view.inputEmployeeName();
        employeeList.removeIf(employee -> employee.getFirstName().equalsIgnoreCase(firstName));
        view.displayMessage("Employee with the name " + firstName + " has been deleted.");
    }

    private void displayAverageSalary() {
        double totalTempSalary = employeeList.stream()
                .filter(emp -> emp instanceof TemporaryEmployee)
                .mapToDouble(Employee::getSalary)
                .sum();
        long tempCount = employeeList.stream()
                .filter(emp -> emp instanceof TemporaryEmployee)
                .count();

        double totalFullTimeSalary = employeeList.stream()
                .filter(emp -> emp instanceof FullTimeEmployee)
                .mapToDouble(Employee::getSalary)
                .sum();
        long fullTimeCount = employeeList.stream()
                .filter(emp -> emp instanceof FullTimeEmployee)
                .count();

        double avgTempSalary = (tempCount > 0) ? totalTempSalary / tempCount : 0;
        double avgFullTimeSalary = (fullTimeCount > 0) ? totalFullTimeSalary / fullTimeCount : 0;

        view.displayMessage("Average salary of temporary employees: " + avgTempSalary);
        view.displayMessage("Average salary of full-time employees: " + avgFullTimeSalary);
    }
}

