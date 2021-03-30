package sec05.exam02_gc;

public class Employee {
	//필드
	public int eno;
	
	
	//생성자
	public Employee(int eno) {
		this.eno=eno;
		System.out.println("Employee("+eno+")가 생성됨");
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Employee(" + eno + ") 이 메모리에서 제거됨");
		
	}
	
	

}
