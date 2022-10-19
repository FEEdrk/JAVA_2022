package kodlamaio.loggers;

public class MailLogger implements ILogger {

	@Override
	public void logger(String datas) {
		System.out.println("Mail kaydedildi: " + datas);

	}

}
