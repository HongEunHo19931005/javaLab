package verify.exam00;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������ �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();// 2021

		/*
		 * if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		 * System.out.println(year + "�� ����"); } else { System.out.println(year +
		 * "�� ���"); }
		 */
		// �ۼ� ��ġ
		GregorianCalendar c = new GregorianCalendar();
		if (c.isLeapYear(year)) {
			System.out.println(year + "�� ����");
		} else {
			System.out.println(year + "�� ���");
		}

	}

}
