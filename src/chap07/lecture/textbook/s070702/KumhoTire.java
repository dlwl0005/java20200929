package chap07.lecture.textbook.s070702;


public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	//메소드
	public boolean roll() {
		++accumulatedRotion;
		if(accumulatedRotion<maxRotation) {
			System.out.println(location + "KumhoTire 수명:" + (maxRotation-accumulatedRotion)  + "회");
			return true;
		}else {
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}
