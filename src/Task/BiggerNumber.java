package Task;

import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        double number1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double number2 = scanner.nextDouble();

	        if (number1 > number2) {
	            System.out.println(number1 + " is greater than " + number2);
	        } else if (number2 > number1) {
	            System.out.println(number2 + " is greater than " + number1);
	        } else {
	            System.out.println("Both numbers are equal.");
	        }

	        scanner.close();
	    }
	}


