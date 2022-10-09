package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IREpositoryDal{

	@Override
	public void Add() {
		System.out.println("My Sql eklendi");
	}
	

}
