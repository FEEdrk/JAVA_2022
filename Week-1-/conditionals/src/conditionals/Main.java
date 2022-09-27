package conditionals;

public class Main {

	public static void main(String[] args) {


        int sayi1 = 20;
        
        if(sayi1 < 20) {
            System.out.println("Sayiniz 20'den kucuktur.");
        }
        if(sayi1 < 15) {
            System.out.println("Sayiniz 15'den kucuktur.");
        }
        else if (sayi1==20){
            System.out.println("Sayiniz 20ye esittir.");
        }
        else {
            System.out.println("Sayiniz 20den buyuktur.");
        }

	}
}