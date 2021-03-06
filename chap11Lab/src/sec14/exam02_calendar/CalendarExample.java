package sec14.exam02_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar n = Calendar.getInstance();
		Calendar n1 = new GregorianCalendar();

		int year = n.get(Calendar.YEAR);
		int month = n.get(Calendar.MONTH) + 1;
		int day = n.get(Calendar.DAY_OF_MONTH);
		int week = n.get(Calendar.DAY_OF_WEEK);

		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
		}
		int amPm = n.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = n.get(Calendar.HOUR);
		int minute = n.get(Calendar.MINUTE);
		int second = n.get(Calendar.SECOND);

		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(strWeek + "요일");
		System.out.println(strAmPm + " ");
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");

	}

}
