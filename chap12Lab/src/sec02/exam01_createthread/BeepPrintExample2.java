package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//how1
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		//how2
		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});*/
		
		//how3:람다식(익명구현객체를 간략하게 표현한 식) 이용
		/*Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		});*/
		//작업 스레드가 수행
		thread.start();
		//Main스레드가 수행
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}


