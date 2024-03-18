package Task;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();

	        double cube = Math.pow(number, 3); // Calculating the cube using Math.pow()

	        System.out.println("The cube of " + number + " is: " + cube);

	        scanner.close();
	    }
	
	}


