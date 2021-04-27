package oopOdev;

public class CourseManager {
	
	public void Add(Course course) {
		
		System.out.println("Eðitmen: " + course.instructor);
		System.out.println("Kurs: " + course.name + "\nBaþarýyla Eklendi\n---------");		
	}
	public void Delete(Course course) {		
		System.out.println("Eðitmen: " + course.instructor);
		System.out.println("Kurs: " + course.name + "\nBaþarýyla Silindi\n---------");
	}	
}
