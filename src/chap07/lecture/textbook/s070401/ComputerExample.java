package chap07.lecture.textbook.s070401;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		Calcutor calcutor = new Calcutor();
		System.out.println("원면적: " +  calcutor.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적: " + computer.areaCircle(r));
	}

}
