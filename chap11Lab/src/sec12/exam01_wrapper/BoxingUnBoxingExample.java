package sec12.exam01_wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Boxing:참조형(heep)<-기본형(stack)
		Integer o1 = new Integer(100);// Integer<-기본형
		Integer o2 = new Integer(200);// Integer<-String
		Integer o3 = Integer.valueOf("300");// Integer<-String

		// UnBoxingr 기본형<-참조형
		int v1 = o1.intValue();
		int v2 = o2.intValue();
		int v3 = o3.intValue();

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);

	}

}
