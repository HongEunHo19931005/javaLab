package sec05.exam02_gc;

public class Employee {
	//�ʵ�
	public int eno;
	
	
	//������
	public Employee(int eno) {
		this.eno=eno;
		System.out.println("Employee("+eno+")�� ������");
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ���ŵ�");
		
	}
	
	

}
