package kodlamaio.loggers;

public class DatabaseLogger implements ILogger {

	@Override
	public void logger(String datas) {
		System.out.println("Veri tabanı kaydedildi: " + datas);
		
	}
	

}
