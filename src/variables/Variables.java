package variables;

public class Variables {
	static int a=7;
	int b=3;

	public static void main(String[] args) {
		Variables v=new Variables();
		int c=4;
		System.out.println("Local variable:"+c);
		System.out.println( "Class level variable:"+v.b);
		System.out.println( "Static variable:"+a);
		 

	}

}
