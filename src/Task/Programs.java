package Task;

import java.util.Scanner;

public class Programs {

	public static void main(String[] args)
	{
	
	Scanner scanner=new Scanner(System.in);	

    System.out.println(" 1.primenumber ");
    System.out.println("2. is leap year ");
    System.out.println("3 .is for Fibon ");
    System.out.println(" 4.evenorodd");

	 int a=scanner.nextInt();	 programsmethod(a);
	}
	public static void  programsmethod(int a) {
		if(a==1) {
			System.out.println("enter the number");
			Scanner scanner=new Scanner(System.in);
			 int b=scanner.nextInt();
			 PrimeNumber.primenumbermethod(b);
		}
		else if(a==3) {
			System.out.println("enter the number");
			Scanner scanner=new Scanner(System.in);
			 int b=scanner.nextInt();
			 Fibnonci.	same();
}
		
}
}