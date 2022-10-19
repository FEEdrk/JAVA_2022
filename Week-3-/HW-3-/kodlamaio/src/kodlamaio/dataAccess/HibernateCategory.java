package kodlamaio.dataAccess;

import kodlamaio.Categories;

public class HibernateCategory implements ICategoryDao {

	@Override
	public void add(Categories categories) {
		System.out.println("Hibernate ile kaydedildi");		
		
	}
	

}
