package oopOdev;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C# + AngulAr ", "Engin Demiro�");
		Course course2 = new Course(2, "Java + REACT", "Engin Demiro�");
		
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println("Kurs Ad�: " + course.name +"\n----------------");
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.Add(course1);
		courseManager.Add(course2);
		courseManager.Delete(course2);
		
		
		Category category = new Category(1, "Programama");
		
		
		
	}
}
