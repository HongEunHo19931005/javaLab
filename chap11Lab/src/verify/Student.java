package verify;

public class Student {

	private static final int Num = 0;
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	// 작성 위치

	@Override
	public int hashCode() {
		return Num;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student compareStudent = (Student) obj;
			if (this.studentNum == compareStudent.studentNum) {
				return true;
			}
		}
		return false;
	}

}
