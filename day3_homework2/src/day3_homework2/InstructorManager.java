package day3_homework2;

public class InstructorManager extends UserManager{
	public void openCourse(Instructor instructor ,String course) {
		System.out.println(instructor.getTitle() + " " + instructor.getFirstName() + " " + instructor.getLastName() + ", " + course + " dersini a�t�.");
	}
	
	public void closeCourse(Instructor instructor ,String course) {
		System.out.println(instructor.getTitle() + " " + instructor.getFirstName() + " " + instructor.getLastName() + ", " + course + " dersini kapatt�.");
	}
	
	public void getInformation(Instructor instructor) {
		System.out.println("�nvan�: " + instructor.getTitle());
		super.getInformation(instructor);
	}
}