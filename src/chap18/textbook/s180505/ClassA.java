package chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable{
	static final long serialVersionUID = 1L;
	
	int field1;//직렬화 포함
	ClassB field2 = new ClassB();// 직렬화 포함
	static int field3; // 직렬화에서 제외
	transient int field4;// 직렬화에서 제외

}
