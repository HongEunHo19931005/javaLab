package verify;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "���̵�,�̸�,�н�����";
		// �ۼ� ��ġ
		// #1: split() �޼ҵ� �̿�
		String[] names = str.split("&|,|-");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();
		// #2: StringTokenizer �̿�
		 
		 StringTokenizer s = new StringTokenizer(str, ",");
			int countTokens = s.countTokens();
			for (int i = 0; i < countTokens; i++) {
				String token = s.nextToken();
				System.out.println(token);

		}
	}
}
	


//���� ���
//���̵�
//�̸�
//�н�����
//
//���̵�
//�̸�
//�н�����
