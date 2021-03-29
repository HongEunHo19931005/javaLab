package sec03.exam04_clone;

public class Member implements Cloneable{
	// �ʵ�
	public String id;
	public String name;
	public String passWord;
	public int age;
	public boolean aduit;

	// ������
	public Member(String id, String name, String passWord, int age, boolean aduit) {
		super();
		this.id = id;
		this.name = name;
		this.passWord = passWord;
		this.age = age;
		this.aduit = aduit;
	}
	//clone()�޼ҵ带 �̿��Ͽ� ��ü�� �����Ѵ�.
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();//��ü ���� ����!
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
