package chap06.textbook.exercises.p20;

import java.util.Scanner;


public class BankApplication {

	
		private static Account[] accountArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("--------------------------------------");
				System.out.println("1.계좌생성| 2.계좌목록| 3.예금| 4.출금 | 5종료");
				System.out.println("--------------------------------------");
				System.out.println("선택>");
				
				int selectNo = scanner.nextInt();
				
				if(selectNo == 1) {
					createAccount();
				}else if(selectNo == 2) {
					accountList();
				}else if(selectNo == 3) {
					deposit();
				}else if(selectNo == 4) {
					withdraw();
				}else if(selectNo == 5) {
					run = false;
				}
			}
			System.out.println("프로그램 종료");
	}

		private static void createAccount() {
			System.out.println("계좌생성");
			System.out.println("--------");
			System.out.println("계좌번호");
			String ano = scanner.next();
			System.out.println("계좌주");
			String owner = scanner.next();
			System.out.println("초기입금액");
			int balance = scanner.nextInt();
			
			Account ac = new Account(ano,owner,balance);
			for(int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = ac;
					System.out.println("게좌가 생성되었습니다.");
					break;
				}
			}
			
		}
		private static void accountList() {
			for(int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] == null) {
					return;
				}
				System.out.print(accountArray[i].getAno());
				System.out.print(" ");
				System.out.print(accountArray[i].getOwner());
				System.out.print(" ");
				System.out.print(accountArray[i].getBalance());
				System.out.println("");
			}
		}

		private static void deposit() {
			System.out.println("예금");
			System.out.println("-----------------");
			System.out.println("계좌번호:");
			String ano = scanner.next();
			System.out.println("예금액:");
			int money =scanner.nextInt();
			System.out.println("결과:예금이 성공되었습니다.");
			
			Account account = findAccount(ano);
			if(account == null) {
				System.out.println("조회한 계좌가 없습니다.");
				return;
			}
			account.setBalance(account.getBalance() + money);
		}

		private static void withdraw() {
			System.out.println("출금");
			System.out.println("-----------------");
			System.out.println("계좌번호:");
			String ano = scanner.next();
			System.out.println("출금액:");
			int money =scanner.nextInt();
			System.out.println("결과:출금이 성공되었습니다.");
			Account account = findAccount(ano);
			if(account == null) {
				System.out.println("조회한 계좌가 없습니다.");
				return;
			}
			account.setBalance(account.getBalance() - money);
		}
		
		private static Account findAccount(String ano) {
			Account account = null;
			for(int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] != null) {
				String find = accountArray[i].getAno();
				if(find.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
			return account;

}
}
