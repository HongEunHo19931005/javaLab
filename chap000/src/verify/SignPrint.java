package verify;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		System.out.println((num > 0 )? "���":(num < 0 ? "����" : "0"));
	}
}





