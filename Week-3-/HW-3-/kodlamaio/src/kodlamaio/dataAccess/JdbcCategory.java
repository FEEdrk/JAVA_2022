package kodlamaio.dataAccess;

import kodlamaio.Categories;

public class JdbcCategory implements ICategoryDao{

	@Override
	public void add(Categories categories) {
		System.out.println("JDBC ile kaydedildi");
	}
	

}
