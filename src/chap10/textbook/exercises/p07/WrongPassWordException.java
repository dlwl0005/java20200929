package chap10.textbook.exercises.p07;

public class WrongPassWordException extends Exception{
	public WrongPassWordException() {}

	public WrongPassWordException(String message) {
		super(message);
	}
}
