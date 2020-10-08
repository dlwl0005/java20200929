package chap05;

public class ReferenceType2 {

	public static void main(String[] args) {
		int i = 30;
		int j = i;
		
		String str1 = "java";
		String str2 = str1;//str1과 같은 메모리에 저장
		System.out.println(i == j);
		System.out.println(str1 == str2);
	}

}
