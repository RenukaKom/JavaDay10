package com.bridgelabz.day10;

/* To Calculate Monthly Employee Wage*/
public class EmployeeWageUC5 {
    static final int isFullTime = 1;
    static final int isPartTime = 2;
    static int empRatePerHour = 20;
    static final int noOfWorkingDays = 20;

    public static void main(String[] args) {
        int empFullHrs;
        double salary;
        int totalEmpWage = 0;
        for (int day = 0; day < noOfWorkingDays; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10 % 3);
            switch (empCheck) {
                case 1:
                    empFullHrs = 8;
                    break;
                case 2:
                    empFullHrs = 4;
                    break;
                default:
                    empFullHrs = 0;
            }
            salary = empRatePerHour * empFullHrs;
            totalEmpWage += salary;
            System.out.println("Daily Employee Wage is " + salary);

        }
        System.out.println();
        System.out.println("Monthly Employee Wage is " + totalEmpWage);
    }


}
