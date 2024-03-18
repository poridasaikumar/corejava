package dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String... args) {
		Date ss=new Date();
		System.out.println(ss);
		String s="dd/MM/YYYY";
		SimpleDateFormat df=new SimpleDateFormat(s);
		System.out.println(df.format(ss));
		String r="YYYY/MM/dd";
		SimpleDateFormat u= new SimpleDateFormat(r);
		System.out.println(u.format(ss));
	}

}
