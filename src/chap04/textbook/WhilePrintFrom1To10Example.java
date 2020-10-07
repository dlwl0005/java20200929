package chap04.textbook;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("=========================");
		//11~20
		int j = 11;
		while(j <=20) {
			System.out.println(j);
			j++;
		}
		System.out.println("=========================");
		//1~9홀수
		int k = 1;
		while(k <= 9) {
			System.out.println(k);
			k+=2;
		}
		System.out.println("=========================");
		//10~1
		int h = 10;
		while(h >=1) {
			System.out.println(h);
			h--;
		}
		System.out.println("=========================");
		//10~2짝수
		int g = 10;
		while(g >=2) {
			System.out.println(g);
			g -= 2;
		}
		
		
	}

}
