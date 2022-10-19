package kodlamaio.dataAccess;

import kodlamaio.Instructors;

public class HibernateInstructor implements IInstructerDao{

	@Override
	public void add(Instructors instructers) {
		System.out.println("Hibernate ile kaydedildi");		
		
	}
	

}
