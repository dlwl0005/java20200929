package chap14.lecture.nested;

public class NestedEx1 {
	public static void main(String[] args) {
		final int i =0;
		
		
		MyInterface i1=  () -> System.out.println("실행");
		
		MyInterface i2 = new MyInterface() {
			
			@Override
			public void method() {
			System.out.println("실행2" + i);//지역변수 를 사용시 final이여야한다
				
			}
		};
		i1.method();
		i2.method();
	}

}
