package day3_homework2;

public class StudentManager extends UserManager{
	public void selectCourse(Student student ,String course) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + ", " + course + " dersini aldı.");
	}
	
	public void leaveCourse(Student student ,String course) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + ", " + course + " dersini bıraktı.");
	}
	
	public void getInformation(Student student) {
		System.out.println("Sınıfı: " + student.getGrade());
		super.getInformation(student);
	}

}