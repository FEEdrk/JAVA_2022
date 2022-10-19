package kodlamaio;

import kodlamaio.dataAccess.HibernateCategory;
import kodlamaio.dataAccess.HibernateInstructor;
import kodlamaio.dataAccess.JdbcCourse;
import kodlamaio.loggers.DatabaseLogger;
import kodlamaio.loggers.FileLogger;
import kodlamaio.loggers.ILogger;
import kodlamaio.loggers.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {

		Categories category1 = new Categories(0, "Programming");
		Categories category2 = new Categories(1, "Language");
		Categories category3 = new Categories(2, "Self-Improvement");
		
		Instructors instructor1 = new Instructors("1001", "Engin Demiroğ");
		Instructors instructor2 = new Instructors("1002", "Furkan Emre");
		
		Courses course1 = new Courses(0, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", 100);
		Courses course2 = new Courses(1, "Senior Yazılım Geliştirici Yetiştirme Kampı", 105);
		Courses course3 = new Courses(2, "Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT)", 150);
		Courses course4 = new Courses(3, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", 122);
		Courses course5 = new Courses(4, "Programlamaya Giriş için Temel Kurs", 130);
		Courses course6 = new Courses(5, "Senior Yazılım Geliştirici Yetiştirme Kampı", 19.90);
		
		ILogger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		Courses[] courses = {course1, course2, course3, course4, course5, course6};
		Categories[] categories = {category1, category2, category3};
		Instructors[] instructors = {instructor1, instructor2};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategory(), loggers, categories);
		CourseManager courseManager = new CourseManager(new JdbcCourse(), loggers, courses);
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructor(), loggers, instructors);
		for(Categories category : categories) {
			categoryManager.addCategory(category);
		}
		for(Instructors instructor : instructors) {
			instructorManager.addInstructor(instructor);
		}
		for(Courses course : courses) {			
			courseManager.addCourse(course);
		}
		
		for(Courses course : courses) {			
			System.out.println("Kurs Adı : " + course.getCourseName());
			System.out.println("Kurs Id : " + course.getCourseId());
			System.out.println("Kurs Ücreti : " + course.getCoursePrice());
			System.out.println("Kurs Kategorisi : " + category1.getCategoryName());
			System.out.println("Kurs Eðitmeni : " + instructor1.getInstructorName());
		}
	}

}
