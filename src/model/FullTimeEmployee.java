/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class FullTimeEmployee extends Employee {
    private static final double DAILY_PAY = 1_000_000;
    private static final double OT_PAY_PER_HOUR = 100_000;
    private int overtimeHours;

    public FullTimeEmployee(String id, String lastName, String firstName, int age, String birthDate, int workingDays, int overtimeHours) {
        super(id, lastName, firstName, age, birthDate, workingDays);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public void calculateSalary() {
        this.salary = workingDays * DAILY_PAY + overtimeHours * OT_PAY_PER_HOUR;
    }
}

