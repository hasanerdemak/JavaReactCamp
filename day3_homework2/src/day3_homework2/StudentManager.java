package day3_homework2;

public class StudentManager extends UserManager{
	public void selectCourse(Student student ,String course) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + ", " + course + " dersini ald�.");
	}
	
	public void leaveCourse(Student student ,String course) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + ", " + course + " dersini b�rakt�.");
	}
	
	public void getInformation(Student student) {
		System.out.println("S�n�f�: " + student.getGrade());
		super.getInformation(student);
	}

}