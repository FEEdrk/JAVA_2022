package recapDemo1;

public class Main {

	public static void main(String[] args) {

		int sayi1 = 30;
		int sayi2 = 25;
		int sayi3 = 2;

		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}

		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}

		int enKucuk = sayi2;

		if (enKucuk > sayi2) {
			enKucuk = sayi1;
		}

		if (enKucuk > sayi3) {
			enKucuk = sayi3;
		}

		System.out.println("En buyuk sayi : " + enBuyuk);
		System.out.println("En kucuk sayi : " + enKucuk);

	}

}
