package Task;

public class LeapYear {

	public boolean checkLeapYear(int year) {
		boolean flag = false;
		if ((year % 4 == 0 & year % 100 != 0) || (year % 400 == 0))
			flag = true;
		return flag;
	}

}
