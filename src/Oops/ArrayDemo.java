package Oops;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num[] = {2,3,4,5};
     System.out.println(num[1]);
     try {
    	 num[5]=9;
     }
	catch(Exception sai) {
		System.out.println();
	}
    finally {
    	System.out.println();
    }
     System.out.println("program is run after exemption");
}
}