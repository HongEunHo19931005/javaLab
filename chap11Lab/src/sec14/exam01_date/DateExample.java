package sec14.exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date N = new Date();
		String strW = N.toString();
		System.out.println(strW);

		SimpleDateFormat S = new SimpleDateFormat("yyyy��MM��dd�� a hh��mm��ss��");
		String strW2 = S.format(N);
		System.out.println(strW2);

	}

}
