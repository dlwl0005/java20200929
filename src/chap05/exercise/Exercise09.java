package chap05.exercise;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studnetNum = 0;
		int[] scores = null;
		Scanner scanner= new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("----------------------------------");
			System.out.println("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수");
				studnetNum += scanner.nextInt();
				System.out.println(studnetNum);
			}else if(selectNo == 2) {
				scores = new int[studnetNum];
				for(int i = 0;i < studnetNum; i++) {
					System.out.println("scores["+ i +"]" );
					scores[i] += scanner.nextInt();
				}
			}else if(selectNo == 3 ) {
				for(int i = 0;i < studnetNum; i++) {
					System.out.println("scores["+ i +"]" + scores[i]);
				}
			}else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				for(int i = 0; i <studnetNum; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				for(int i =0 ; i<scores.length; i++) {
					sum += scores[i];
				}
				double avg = (double) sum / scores.length;;
				System.out.println("최고점수: " + max);
				System.out.printf("평균: %.2f %n",avg);
				
			}else if(selectNo == 5 ) {
				run = false;
			}

		}
		System.out.println("프로그램종료");
	}

}
