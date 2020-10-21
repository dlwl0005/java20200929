package chap10.textbook.exercises.p07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white" , "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//printStackTrace();
		}
		
		
			try {
				login("blue" , "51234");
			} catch (Exception e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
			}
		
	}

	public static void login(String id, String password) throws Exception{
		//id가 "blue"가 아니라면 NotExistIDException 발생시킴
		if(!id.equals("blue")) {			
				//System.out.println("아이디가 존재하지 않습니다.");
				throw new NotExistIdException("아이디가 존재하지 않습니다.");
		}
		//password가 "12345"가 아니라며 WrongPasswordException 발생시킴
		if(!password.equals("12345")) {
			//System.out.println("패스워드가 틀립니다.");
			throw new WrongPassWordException("패스워드가 틀립니다.");
		}
	}
}
