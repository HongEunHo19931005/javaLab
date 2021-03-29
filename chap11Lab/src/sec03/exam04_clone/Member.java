package sec03.exam04_clone;

public class Member implements Cloneable{
	// 필드
	public String id;
	public String name;
	public String passWord;
	public int age;
	public boolean aduit;

	// 생성자
	public Member(String id, String name, String passWord, int age, boolean aduit) {
		super();
		this.id = id;
		this.name = name;
		this.passWord = passWord;
		this.age = age;
		this.aduit = aduit;
	}
	//clone()메소드를 이용하여 객체를 복제한다.
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();//객체 깊은 복제!
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
