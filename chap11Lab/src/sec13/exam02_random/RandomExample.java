package sec13.exam02_random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] N = new int[6];
		// ���� ��ȣ
		Random R = new Random();
		System.out.println("���� ��ȣ:");
		for (int i = 0; i < 6; i++) {
			N[i] = R.nextInt(45) + 1;
			System.out.println(N[i] + " ");
		}
		int[] W = new int[6];
		R = new Random();
		System.out.println("����� ��ȣ:");
		for (int i = 1; i < 6; i++) {
			W[i] = R.nextInt(45) + 1;
			System.out.println(W[i] + " ");
		}

	}

}
