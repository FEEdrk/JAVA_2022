package kodlamaio;

import kodlamaio.dataAccess.ICourseDao;
import kodlamaio.loggers.ILogger;

public class CourseManager {

	private ICourseDao courseDao;
	private ILogger[] loggers;
	private Courses[] courses;

	public CourseManager(ICourseDao courseDao, ILogger[] loggers, Courses[] courses) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void addCourse(Courses course) throws Exception {
		if (course.getCoursePrice() <= 99.9) {
			throw new Exception("Ürün fiyatı 99.9'dan küçük olamaz!");
		}

	}

}
