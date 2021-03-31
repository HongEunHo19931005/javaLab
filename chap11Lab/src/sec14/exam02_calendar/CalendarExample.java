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
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
		case Calendar.SATURDAY:
			strWeek = "��";
			break;
		default:
			strWeek = "��";
		}
		int amPm = n.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}

		int hour = n.get(Calendar.HOUR);
		int minute = n.get(Calendar.MINUTE);
		int second = n.get(Calendar.SECOND);

		System.out.println(year + "��");
		System.out.println(month + "��");
		System.out.println(day + "��");
		System.out.println(strWeek + "����");
		System.out.println(strAmPm + " ");
		System.out.println(hour + "��");
		System.out.println(minute + "��");
		System.out.println(second + "��");

	}

}
