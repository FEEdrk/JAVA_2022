package asalSayi;

public class Main {

	public static void main(String[] args) {

		int number = 1;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;

		if (number < 1) {
			System.out.println("Gecersiz sayi");
		}

		if (number == 1) {
			System.out.println("Sayi asal degildir.");
			return;
		}

		for (int i = number - 1; i > 1; i--) {

			if (number % i == 0) {
				isPrime = false;
			}

		}

		if (isPrime) {
			System.out.println("Sayi asaldir.");
		}

		else {
			System.out.println("Sayi asal degildir.");

		}
	}

}
