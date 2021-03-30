package sec07.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "안녕하세요";

		byte[] bytes1 = s.getBytes();
		System.out.println("bytes1.length:" + bytes1.length);
		String s1 = new String(bytes1);
		System.out.println("bytes->String:" + s1);

		try {
			byte[] bytes2 = s.getBytes("EUC-KR");
			System.out.println("bytes2.length:" + bytes2.length);
			String s2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes->String:" + s2);

			byte[] bytes3 = s.getBytes("UTF-8");// 인코딩
			System.out.println("bytes3.length:" + bytes3.length);
			String s3 = new String(bytes3, "UTF-8");// 디코딩
			System.out.println("bytes->String:" + s3);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
