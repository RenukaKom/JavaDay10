package com.bridgelabz.day10;

public class EmployeeWageUC7 {
    public static void main(String[] args) {
        calculateEmployeeWage();
    }

    public static int calculateEmployeeWage() {
        final int empRatePerHour = 20;
        final int noOfWorkingDays = 20;
        final int maxHrsInMonth = 10;
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, totalEmpWage;
        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10 % 3);
            switch (empCheck) {
                case 1:
                    empHrs = 8;
                    break;
                case 2:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + " " + "Emp Hrs: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage: " + totalEmpWage);
        return totalEmpWage;
    }
}