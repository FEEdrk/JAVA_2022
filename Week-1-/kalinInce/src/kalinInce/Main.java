package kalinInce;

public class Main {

	public static void main(String[] args) {

		char harf = 'O';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalin sesli.");
			break;
		default:
			System.out.println("Ince sesli.");
		}
	}

}
