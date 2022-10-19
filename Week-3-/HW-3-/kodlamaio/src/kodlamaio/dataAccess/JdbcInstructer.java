package kodlamaio.dataAccess;

import kodlamaio.Instructors;

public class JdbcInstructer implements IInstructerDao {

	@Override
	public void add(Instructors instructers) {
		System.out.println("JDBC ile kaydedildi");

	}

}
