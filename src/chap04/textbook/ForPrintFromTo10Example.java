package chap04.textbook;

public class ForPrintFromTo10Example {

	public static void main(String[] args) {
		
		
		// 1 -> 2 ->code ->3 ->2
		
		// 1~10
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
	}
		System.out.println("====================");
		// 11~20
		for(int j = 11; j <=20; j ++) {
			System.out.println(j);
		}
		System.out.println("====================");
		for(int l = 1; l<10; l++) {
			if(l%2 ==1) {
			System.out.println(l);
			}
		}
		System.out.println("====================");
		for(int k = 10; k>=1; k--) {
			System.out.println(k);
		}
		System.out.println("====================");
		for(int u = 1; u<=10; u++) {
			if(u%2 ==0) {
				System.out.println(u);
			}
		}
		
		
	}
}
