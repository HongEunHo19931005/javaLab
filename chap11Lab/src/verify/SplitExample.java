package verify;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "아이디,이름,패스워드";
		// 작성 위치
		// #1: split() 메소드 이용
		String[] names = str.split("&|,|-");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();
		// #2: StringTokenizer 이용
		 
		 StringTokenizer s = new StringTokenizer(str, ",");
			int countTokens = s.countTokens();
			for (int i = 0; i < countTokens; i++) {
				String token = s.nextToken();
				System.out.println(token);

		}
	}
}
	


//실행 결과
//아이디
//이름
//패스워드
//
//아이디
//이름
//패스워드
