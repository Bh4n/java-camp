package oopOdev;

public class CourseManager {
	
	public void Add(Course course) {
		
		System.out.println("E�itmen: " + course.instructor);
		System.out.println("Kurs: " + course.name + "\nBa�ar�yla Eklendi\n---------");		
	}
	public void Delete(Course course) {		
		System.out.println("E�itmen: " + course.instructor);
		System.out.println("Kurs: " + course.name + "\nBa�ar�yla Silindi\n---------");
	}	
}
