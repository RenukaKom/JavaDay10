package com.bridgelabz.day10;
/* To Calculate Daily Employee Wage*/
public class EmployeeWageUC2 {
    public static void main(String[] args) {
        int isFullTime = 1;
        double empRatePerHour =20;
        double empCheck = Math.floor(Math.random() * 10 % 2);
        System.out.println(empCheck);
        if (empCheck == isFullTime) {
            int empFullHrs = 8;
            double salary = (empRatePerHour * empFullHrs);
            System.out.println("Salary is " + salary);
        } else {
            int empFullHrs = 0;
            double salary = (empRatePerHour * empFullHrs);
            System.out.println("Salary is " + salary);
        }
    }
}
