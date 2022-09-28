package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'ü';

		char[] sesliler = { 'a', 'e', 'ı', 'i', 'o','ö', 'u','ü' };

		for (int i = 0; i < 8; i++) {
			if (harf == sesliler[i]) {
				System.out.println("Bu harf seslidir.");
				return;
			}

		}
		System.out.println("Bu harf sessizdir.");

	}

}
