package chap02.type.casting;

import java.util.Scanner;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		//primitive type 8개
		
		//1byte	2byte 4byte 8byte
		//boolean char
		//byte short int long
		//			float double
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 10000000000L;
		
		// 자동 형변환
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
		//강제 형변환
		longValue = 230000000000000L;
		intValue = (int) longValue;
		System.out.println(intValue);
	}
}
