package sec07.exam02_method;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java Programming";
		String s2 = "JAVA Programming";

		System.out.println(s1.equals(s2));// false

		String lowerS1 = s1.toLowerCase();
		String lowerS2 = s2.toLowerCase();
		System.out.println(lowerS1.equals(lowerS2));// true

	}

}
