package verify.exam00_Lab;

public class MovieThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("�������� ����մϴ�.");
			// �ۼ� ��ġ
			Thread.interrupted();
			break; 
		
		}
		
	}
}