package sec14.exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date N = new Date();
		String strW = N.toString();
		System.out.println(strW);

		SimpleDateFormat S = new SimpleDateFormat("yyyy년MM월dd일 a hh시mm분ss초");
		String strW2 = S.format(N);
		System.out.println(strW2);

	}

}
