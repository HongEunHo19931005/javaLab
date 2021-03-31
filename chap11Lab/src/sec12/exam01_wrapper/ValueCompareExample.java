package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[-128~127 초과값일 경우]");
		Integer v1 = 300;
		Integer v2 = 300;
		System.out.println("==결과:" + (v1 == v2));// ==결과:false
		System.out.println("언박싱후==결과:" + (v1.intValue() == (v2.intValue())));// 언박싱후==결과:true
		System.out.println("equals()결과:" + v1.equals(v2));// equals()결과:true

		System.out.println("[-128~127 범위값일 경우]");
		Integer v3 = 10;
		Integer v4 = 10;
		System.out.println("==결과:" + (v3 == v4));// ==결과:true
		System.out.println("언박싱후==결과:" + (v3.intValue() == (v4.intValue())));// 언박싱후==결과:true
		System.out.println("equals()결과:" + v3.equals(v4));// equals()결과:true

	}

}
