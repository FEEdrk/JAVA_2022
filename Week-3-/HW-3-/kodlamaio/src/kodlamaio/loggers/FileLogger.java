package kodlamaio.loggers;

public class FileLogger implements ILogger {

	@Override
	public void logger(String datas) {

		System.out.println("Dosya kaydedildi." + datas);
	}

}
