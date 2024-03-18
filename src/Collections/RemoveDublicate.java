package Collections;

import java.util.ArrayList;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 ArrayList<Integer> Arr= new ArrayList<Integer>();
 Arr.add(1);
 Arr.add(2);
 Arr.add(3);
 Arr.add(2);
 Arr.add(1);
 System.out.println("Before duplicate:"+Arr);
 
 for(int i=0;i<Arr.size();i++) {
	 for(j=i+1;j<Arr.size();j++) {
		if(Arr.get(i)==Arr.get(j)) {
			Arr.remove(j);
		}
	 }
 }
System.out.println(After dublicate:"+Arr);
	}

}
