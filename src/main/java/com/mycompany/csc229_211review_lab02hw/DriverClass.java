package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */

/**
 * DriverClass serves as the starting point for the program.
 * It will create a Student, ask the user for GPA, and print student details.
 */
public class DriverClass {

	public static void main(String[] args) {

		// Create a Student object (age must be short)
		Student std1= new Student("James", (short) 20);

//Ask the user enter GPA
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter GPA for " + std1.getName() + ": ");
		std1.setGpa(sc.nextDouble());


		//print details of the student
		System.out.println(std1);


	}

}