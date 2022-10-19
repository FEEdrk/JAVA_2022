package kodlamaio.dataAccess;

import kodlamaio.Courses;

public class HibernateCourses implements ICourseDao{

	@Override
	public void add(Courses courses) {
		System.out.println("Hibernate ile kaydedildi");		
		
	}
	

}
