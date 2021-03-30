package sec07.exam02_method;

public class StringValueOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ValueOf<-기본타입을 문자열 타입으로 변환
		//기본형->참조형으로 변환
		String s1 = String.valueOf(10);// 10->"10"
		String s2 = String.valueOf(10.5);// 10.5->"10.5"
		String s3 = String.valueOf(true);// true->"true"

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
