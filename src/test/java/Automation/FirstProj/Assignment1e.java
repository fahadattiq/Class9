package Automation.FirstProj;

import java.util.Scanner;

public class Assignment1e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program if user gives even number it print “qa jobs in lahore” 
		//and if user give odd number it prints “automation testing course”.
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
		
		if (userInput % 2 == 0) {
			System.out.println("QA jobs in Lahore");
		}
		else
		{
			System.out.println("Automation testing course");
		}

	}

}
