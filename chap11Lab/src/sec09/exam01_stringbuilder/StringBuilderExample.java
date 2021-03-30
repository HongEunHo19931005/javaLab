package sec09.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder();

		s.append("java");
		s.append("Progaram Studey");
		System.out.println(s.toString());

		s.insert(4, "2");
		System.out.println(s.toString());

	}

}
