package com.bridgelabz.day10;

public class EmployeeWageUC8 {
    public static void main(String[] args) {
        calculateEmployeeWage("Amazon", 20, 5, 10);
        calculateEmployeeWage("Myntra", 18, 10, 8);

    }

    public static int calculateEmployeeWage(String companyName,int empRatePerHour, int noOfWorkingDays, int maxHrsInMonth) {

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
        System.out.println("Total Employee Wage for company: " + companyName + " is "+ totalEmpWage);
        System.out.println();
        return totalEmpWage;
    }
}
