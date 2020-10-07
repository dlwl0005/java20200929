package chap04.exercies;

import java.util.Scanner;

public class Exercise07Scanner {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("입력");
//		String line = scanner.nextLine();
//		
//		System.out.println("출력");
//		System.out.println(line);
//		
//		int num = Integer.valueOf(line);
//		int i = num *2;
//		System.out.println(i);
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금|3.잔고|4.종료");
			System.out.println("-------------------------");
			System.out.println("선택>");
			
			int line = scanner.nextInt();
			if(line == 1) {
				System.out.println("예금액:");
				int i = scanner.nextInt();
				 balance += i;
			}else if(line == 2) {
				System.out.println("출금액:");
				int m = scanner.nextInt();
				 balance -= m;
			}else if(line == 3){
				System.out.println("잔고:" + balance + "원");
			}else {
				run=false;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}
