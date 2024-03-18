package Task;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();

	        System.out.println("Before swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        int temp;

	        // Swapping logic using a temporary variable
	        temp = num1;
	        num1 = num2;
	        num2 = temp;

	        System.out.println("\nAfter swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        scanner.close();
	    }
	}
	


