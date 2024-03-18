package Task;

public class Fibnonci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		same();
		}
		public static void same() {
			
 int a=0,b=1,c,i;
 System.out.print(a);
 System.out.print(b);
 System.out.print("");
 
 for( i=2;i<=10;i++) {
	 c=a+b;
	 System.out.print(" ");
	 System.out.print(c);
	 a=b;
	 b=c;
 }                      
   }
	
}	

