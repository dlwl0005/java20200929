package chap11.string;

public class StringEx1 {

	public static void main(String[] args) {
		// charAt
		String str1 = "java";
		str1.charAt(3);
		System.out.println(str1.charAt(3));
		
		//equals
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 +str5;
		
		System.out.println(str2 ==str6);
		System.out.println(str2.equals(str6));
		//indexOf
		System.out.println("--indexof--");
		String str7 = "axxbb";
		int c= str7.indexOf("x");
		System.out.println(c);
		System.out.println(str7.substring(c+1, c+2));
		//length
		System.out.println("------length------");
		String str8 = "이것이 자바다.          java";
		int l=str8.length();
		System.out.println(l);
		System.out.println(str8.charAt(l-1));//마지막문자가져오기
		
		//replace
		System.out.println("----replace-----");
		String str9 = "abcdefabcdefg";
		String str10 = str9.replace("abc", "123");
		System.out.println(str10);
		//substring
		System.out.println("------subString------");
		String str11 = "0123456789gjgj6757g";
		String sub = str11.substring(2,3);
		System.out.println(sub);
		sub = str11.substring(1, str11.length());
		System.out.println(sub);
		sub = str11.substring(str11.length()-2);
		System.out.println(sub);
		//trim
		System.out.println("-----trim-------");
		String str12 = " java ";
		String t = str12.trim();
		System.out.println(t);
		System.out.println(str12);
	}

}
