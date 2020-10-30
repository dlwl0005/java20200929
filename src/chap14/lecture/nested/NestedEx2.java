package chap14.lecture.nested;

public class NestedEx2 {
	private int outterField;
	
	public void method() {
		MyInterface i1 = () ->{
			int outterField = 3;
			System.out.println("익명 클래스의 객체(local class)");
			System.out.println(this);
			System.out.println(outterField); // 메소드안 값
			System.out.println(NestedEx2.this.outterField);// 메소드밖 필드를 가르킴
			
		};
		i1.method();
	}
	
	
	public static void main(String[] args) {
		NestedEx2 ne = new NestedEx2();
		ne.method();
		
	}

}
