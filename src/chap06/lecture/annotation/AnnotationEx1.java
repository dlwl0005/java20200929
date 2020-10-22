package chap06.lecture.annotation;


@MyAnnotation(value = "")
public class AnnotationEx1 {
	@MyAnnotation(value = "")
	private int i;
	
	
	// 주석들
	
	// annotation
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@MyAnnotation(value="abc", number=5, names= {"c", "d"})
	public static void mymethod() {
		
	}
}