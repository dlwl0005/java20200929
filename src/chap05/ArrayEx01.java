package chap05;

public class ArrayEx01 {

	public static void main(String[] args) {
		int i1= 30;
		int i2 = 50;
		int i3 = 20;
		int i4 = 70;
		
		int[] arr1;
		arr1 = new int[3];
		
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
		
		arr1[0] = 99;
		arr1[1] = 88;
		arr1[2] = 77;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		int[] arr2;
		arr2 = arr1;// 같은 인스턴스를 갖게 된다.
		arr2[0] = 55;
		System.out.println(arr2[0]);
		System.out.println(arr1[0]);
	}

}
