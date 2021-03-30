package verify;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = 1; i <= 100; i++) {
			str += i;
		}
		System.out.println(str);
		// 작성 위치
		StringBuilder s =new StringBuilder();
		for (int i = 1; i <= 100; i++)
			s.append(i);
		System.out.println(s.toString());
		

	}

}
//실행 결과
//12345678910111213141516171819202122232....100
//12345678910111213141516171819202122232....100