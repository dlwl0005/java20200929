package chap04.exercies;

public class Exercise04 {

	public static void main(String[] args) {
		int sum = 0;
		
		while(sum != 5) {
			int r = (int)(Math.random()*6)+1;
			int r2 = (int)(Math.random()*6)+1;
			sum = r+r2;
			System.out.println(r + "," + r2);
		}
	}

}
