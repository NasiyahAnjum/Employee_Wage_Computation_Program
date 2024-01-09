package com.java.employeewagecomputationprogram;

public class Employee_Wage_Computation_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Employee Wage Computation Program");
		final int FULL_TIME = 1;
        int empType = (int) (Math.random() * 100) % 2;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");

        } else
        {
            System.out.println("Employee is Absent");

        }
	}

}
