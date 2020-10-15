package chap07.lecture.textbook.s070702;

public class Tire {
	
	
	public int maxRotation; //최대 회전수(타이어 수명)
	public int accumulatedRotion; //누적 회전수
	public String location; //타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotion;//누적 회전수 1증가
		if(accumulatedRotion<maxRotation) {
			System.out.println(location + "Tire 수명" + (maxRotation-accumulatedRotion) + "회");
			return true;
		}else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}

}
