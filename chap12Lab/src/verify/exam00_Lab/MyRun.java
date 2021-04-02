package verify.exam00_Lab;

//인터페이스 Runnable 를 구현 클래스로 생성
//작성위치
public class MyRun implements Runnable {
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print("T");
		}
	}

}
