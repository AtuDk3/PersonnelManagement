/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class TemporaryEmployee extends Employee {
    private static final double DISCOUNT_RATE = 0.5;
    private static final double DAILY_PAY = 1_000_000;

    public TemporaryEmployee(String id, String lastName, String firstName, int age, String birthDate, int workingDays) {
        super(id, lastName, firstName, age, birthDate, workingDays);
    }

    @Override
    public void calculateSalary() {
        this.salary = workingDays * DAILY_PAY * DISCOUNT_RATE;
    }
}

