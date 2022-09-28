package sayiBulma;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 3, 4, 5 };
		int aranacak = 5;

		for (int i = 0; i < 5; i++) {
			if (aranacak == sayilar[i]) {
				System.out.println("Bu sayi listede mevcuttur.");
				return;
				// break; ise donguden cikartir.
			}
		}

		System.out.println("Bu sayi listede mevcut degildir.");
	}

}
