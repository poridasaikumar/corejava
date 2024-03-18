package dev.java.core.all.programs;

import java.util.Scanner;

import Task.LeapYear;

public class AllProgramsMain {
	static LeapYear leapYear = new LeapYear();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		methodCall();
	}

	static void methodCall() {
		
		System.out.println("1-aba");
		System.out.println("2-aba");
		System.out.println("3-leapyear");
		System.out.println("4-aba");
		
		
		System.out.println("PLease  Enter any option from the ABOVE ");
		int option = sc.nextInt();
		
		if (option==3) {
		System.out.println("PLease  Enter year to checl leap or not :: ");
		int year = sc.nextInt();
		boolean response = leapYear.checkLeapYear(year);
		
		if (response)
			System.out.println("LEAP YEAR ::: ");
		else
			System.out.println("NOT A LEAP YEAR ::: ");
		}else if (option==2) {
			System.out.println("PLease  Enter firast value :: ");
			int val1 = sc.nextInt();
			System.out.println("PLease  Enter second value :: ");
			int val2 = sc.nextInt();
			System.out.println("SUM :: " +(val1+val2));
//			sum(val1,val2);
			
		}

		System.out.println("Please enter 1- for awant to check another year, 0- for exit");
		int choice = sc.nextInt();
		if (choice == 1) {
			methodCall();
		} else {
			System.out.println(" END :::: ");
		}

	}

}
