package verify;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 �հ�:"+sum);
		System.out.println("���:"+sum / (float) 100);
	}

}
