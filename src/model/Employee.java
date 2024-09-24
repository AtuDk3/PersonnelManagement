/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public abstract class Employee {
    protected String id;
    protected String lastName;
    protected String firstName;
    protected int age;
    protected String birthDate;
    protected int workingDays;
    protected double salary;

    public Employee(String id, String lastName, String firstName, int age, String birthDate, int workingDays) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.birthDate = birthDate;
        this.workingDays = workingDays;
    }

    // Abstract method to calculate salary
    public abstract void calculateSalary();

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void printInfo() {
        System.out.printf("ID: %s - Last Name: %s - First Name: %s - Age: %d - Birth Date: %s - Working Days: %d - Salary: %.2f\n", 
            id, lastName, firstName, age, birthDate, workingDays, salary);
    }
}

