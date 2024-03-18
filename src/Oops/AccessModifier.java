package Oops;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    
	}
  static private int a=20;
  static int b=30;
  static protected int c=40;
  static public int d=50;
  private static int add() {
  return a+b+c+d;
  
}
 static int sub() {
  return a-b-c-d;
 }
  
 protected static int mul() {
	return a*b*c*d;

 }
 public static int div() {
	 return (a+b)/(a-b);
 }
}
 