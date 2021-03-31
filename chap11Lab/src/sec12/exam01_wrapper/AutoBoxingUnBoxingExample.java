package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// AutoBoxing
		Integer o = 100;
		System.out.println("value:" + o.intValue());

		// AutoUnBoxing
		int value = o;
		System.out.println("value:" + value);

		// ¿¬»ê½ÃAutoUnBoxing
		int r = o + 100;
		System.out.println("r:" + r);
	}

}
