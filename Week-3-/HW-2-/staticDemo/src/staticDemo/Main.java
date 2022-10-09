package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productmanager = new ProductManager();
		Product product = new Product();

		product.price = 10;
		product.name = "Mouse";
		product.id = 123;

		productmanager.add(product);
		
		
		
		DatabaseHelper.Crud.delete();
		
		
		
		
		
		
	}

}
