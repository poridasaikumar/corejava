package ClassTask;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {32,43,52,12,90,5};
    for (int i=0; i<a.length; i++) {
    	int temp=0;
    	for (int j=0; j< a.length; j++) {
    		if (a[i] <a[j])
    		{
    			temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		}
	}
    }
    for (int i=0; i<a.length; i++) {
    	System.out.println(a[i]+"");
	}
}


	


   int b[]= {23,34,54,12,90,9};{
     for (int i=0; i<b.length; i++) {
	int temp=0;
	for (int j=0; j< b.length; j++) {
		if (b[i] <b[j])
		{
			temp=b[i];
			b[i]=b[j];
			b[j]=temp;
		}
}
     }
		   
	for (int i=0; i<b.length; i++) {
	System.out.println(b[i]+"");
}
}
}
