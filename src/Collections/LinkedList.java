package Collections;

public class LinkedList {
	import java.util.LinkedList;
{

		public static void main(String[] args) {
			
			LinkedList<String> alist = new LinkedList<String>();
			
			alist.add("code");
			alist.add("begun");
			alist.add("java");
			alist.add("javascript");
			
			System.out.println(alist);
			System.out.println("the last element:"+alist.removeLast());
		//	System.out.println("first element:"+alist.removeFirst());
			System.out.println("element:"+alist.getFirst());
			System.out.println("element:"+alist.get(0));
			System.out.println("element:"+alist.peekFirst());
			
			
		}

	}


