package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[-128~127 �ʰ����� ���]");
		Integer v1 = 300;
		Integer v2 = 300;
		System.out.println("==���:" + (v1 == v2));// ==���:false
		System.out.println("��ڽ���==���:" + (v1.intValue() == (v2.intValue())));// ��ڽ���==���:true
		System.out.println("equals()���:" + v1.equals(v2));// equals()���:true

		System.out.println("[-128~127 �������� ���]");
		Integer v3 = 10;
		Integer v4 = 10;
		System.out.println("==���:" + (v3 == v4));// ==���:true
		System.out.println("��ڽ���==���:" + (v3.intValue() == (v4.intValue())));// ��ڽ���==���:true
		System.out.println("equals()���:" + v3.equals(v4));// equals()���:true

	}

}
