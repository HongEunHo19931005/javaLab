package sec03.exam04_clone;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member original = new Member("���", "ȫ�浿", "12345", 25, true);

		// ���� ��ü�� ���� �Ŀ� �н����� ����;
		Member cloned = original.getMember();
		cloned.passWord = "67890";

		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id:" + cloned.id);
		System.out.println("name:" + cloned.name);
		System.out.println("passWord:" + cloned.passWord);
		System.out.println("age:" + cloned.age);
		System.out.println("adult:" + cloned.aduit);

		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id:" + original.id);
		System.out.println("name:" + original.name);
		System.out.println("passWord:" + original.passWord);
		System.out.println("age:" + original.age);
		System.out.println("adult:" + original.aduit);

	}

}
