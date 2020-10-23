package chap13.lecture;

import chap13.textbook.s130601.*;

public class GenericEx4Wildcard {
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<>("일반인", 5);
		Course<Student> courseStudent = new Course<>("학생", 5);
		
		Person p  = new Person("일반");
		Student s = new Student("학생");
		
		p = s;
		
		courseStudent.add(new Student("hong"));
		coursePerson.add(new Person("kim"));
		
		//coursePerson = courseStudent;
		coursePerson.add(new Person("lee"));
		System.out.println(p);
		
		System.out.println("wildcard");
		Course<? super Student> courserW0 = new Course<Object>("a", 1);		
		Course<? super Student> courserW1 = new Course<Person>("a", 1);		
		Course<? super Student> courserW2 = new Course<Student>("a", 1);		
//		Course<? super Student> courserW3 = new Course<HighStudent>("a", 1);		
		
		courserW0.add(new Student("a"));
//		courserW0.add(new Object());
		Course<Object> co =(Course<Object>) courserW0;
		co.add(new Object());
		courserW1.add(new Student("a"));
		courserW2.add(new Student("a"));
		
		Course<? extends Student> courseE1 = new Course<Student>("a" , 5);
		Course<? extends Student> courseE2 = new Course<HighStudent>("a" , 5);
		
		Course<?> courseA1 = new Course<Person>("a", 5);
		Course<?> courseA2 = new Course<Worker>("a", 5);
		Course<?> courseA3 = new Course<Student>("a", 5);
		Course<?> courseA4 = new Course<HighStudent>("a", 5);
	}
}
