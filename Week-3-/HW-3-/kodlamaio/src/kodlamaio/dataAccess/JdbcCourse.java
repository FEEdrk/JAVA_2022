package kodlamaio.dataAccess;

import kodlamaio.Courses;

public class JdbcCourse implements ICourseDao{

	@Override
	public void add(Courses courses) {
		System.out.println("JDBC ile kaydedildi");		
		
	}
	

}
