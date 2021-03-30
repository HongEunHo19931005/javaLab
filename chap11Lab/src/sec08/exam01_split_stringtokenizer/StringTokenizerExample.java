package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "È«±æµ¿/ÀÌ¼öÈ«/¹Ú¿¬¼ö";
		StringTokenizer st = new StringTokenizer(n, "/");
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		System.out.println();

		st = st = new StringTokenizer(n, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);

		}
	}

}
