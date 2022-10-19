package kodlamaio;

import kodlamaio.dataAccess.ICategoryDao;
import kodlamaio.loggers.ILogger;

public class CategoryManager {
	private ICategoryDao iCategoryDao;
	private ILogger[] iLogger;
	private Categories[] categories;

	public CategoryManager(ICategoryDao iCategoryDao, ILogger[] iLogger, Categories[] categories) {
		super();
		this.categories = categories;
		this.iCategoryDao = iCategoryDao;
		this.iLogger = iLogger;
	}

	public void addCategory(Categories categories) throws Exception {
		for (Categories currentCategories : categories) {
			if (currentCategories != categories) {
				if (currentCategories.getCategoryName() == categories.getCategoryName()) {
					throw new Exception("Kategori adı aynı olamaz!!!");
				}

			}
		}

	}

}
