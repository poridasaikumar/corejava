package dateformat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Date date=new Date();
    System.out.println(date);
    LocalDate localdate=LocalDate.now();
    System.out.println(localdate);
    LocalDateTime localdatetime= LocalDateTime.now();
    System.out.println(localdatetime);
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    System.out.println(dtf.format(localdatetime));
    DateTimeFormatter dtf1=DateTimeFormatter.BASIC_ISO_DATE;
    System.out.println(dtf1);
    DateTimeFormatter dtf2=DateTimeFormatter.ISO_LOCAL_TIME;
    System.out.println(dtf2);
	}
}
