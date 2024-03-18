package dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCheck {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat datef=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String d1="25/12/2023 12:23:39";
		String d2="26/12/2023 12:26:38";
		Date a=datef.parse(d1);
		Date b=datef.parse(d2);
		if(a.after(b)) {
			System.out.println("after");
			
		}
		else if(a.before(b)){
			System.out.println("before");
		}
		else 
		{
			System.out.println("equals");
		}
	}
	}


