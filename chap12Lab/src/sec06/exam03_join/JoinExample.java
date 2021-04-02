package sec06.exam03_join;

public class JoinExample {
	//mian 스레드가 실행
	public static void main(String[] args) {
		//작업 스레드를 생성
		SumThread sumThread = new SumThread();
		//작업스레드가 실행
		sumThread.start();
		try {
			//main스레드가 작업 스레드가 완료될때까지 대기중
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}

