package sec05.exam01_exit;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setSecurityManager(new SecurityManager() {

			@Override
			public void checkExit(int status) {
				// TODO Auto-generated method stub
				if (status != 5) {
					throw new SecurityException();
				}
			}

		});

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				System.exit(i);

			} catch (SecurityException e) {
				// 예외처리 내용이 없음.
			}
		}

		
		System.out.println("프로그램을 종료합니당.");
		System.exit(1);
		System.out.println("프로그램이 종료됩니당.");

	}

}
