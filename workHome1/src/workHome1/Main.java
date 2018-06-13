package workHome1;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t;
		Date date = new Date();
		t = date.getTime();
		Calendar cl = Calendar.getInstance();
		cl.add(Calendar.MONTH, -1);
		date = cl.getTime();
		t = t - date.getTime();
		System.out.println(t);
	}

}
