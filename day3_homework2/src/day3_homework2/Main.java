package day3_homework2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setFirstName("Ahmet");
		student1.setLastName("Yýldýz");
		student1.setId(1);
		student1.setEmail("ahmet@gmail.com");
		student1.setUsername("ahmet1234");
		student1.setPassword("1234");
		student1.setGrade("3");
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Osman");
		instructor1.setLastName("Kula");
		instructor1.setId(2);
		instructor1.setEmail("osman@gmail.com");
		instructor1.setUsername("osman5678");
		instructor1.setPassword("5678");
		instructor1.setTitle("Prof. Dr.");
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		instructorManager.getInformation(instructor1);
		
		studentManager.getInformation(student1);
		
		instructorManager.openCourse(instructor1, "BIL211");
		
		studentManager.selectCourse(student1, "BIL211");
		
		studentManager.leaveCourse(student1, "BIL211");
		
		instructorManager.closeCourse(instructor1, "BIL211");
		
	}

}