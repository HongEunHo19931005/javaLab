package sec13.exam01_math;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = Math.abs(-5);/// 절대값 5
		double v2 = Math.abs(-3.14);// 절대값 3.14
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);

		double v3 = Math.ceil(5.3);// 올림 값은 6
		double v4 = Math.ceil(-5.3);// 올림 값은 5
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);

		double v5 = Math.floor(5.3);// 버림 값은 5
		double v6 = Math.floor(-5.3);// 버림 값은 6
		System.out.println("v5=" + v5);
		System.out.println("v6=" + v6);

		double v7 = Math.random();// 랜덤값 0.0~1.0 사이의값
		System.out.println("v7=" + v7);

		long v8 = Math.round(5.3);// 반올림 5
		long v9 = Math.round(5.7);// 반올림 6
		System.out.println("v8=" + v8);
		System.out.println("v9=" + v9);
	}

}
