package Oops;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    InterfaceImpl obj=new InterfaceImpl();
    obj.method();
    System.out.println(obj.method(10, 20));
    System.out.println(obj.method(10, 20,30));
    System.out.println(obj.method(10, 20,30,40));
	}

}
