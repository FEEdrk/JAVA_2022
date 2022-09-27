package switchDemo;

public class Main {

	public static void main(String[] args) {

        char grade = 'D';
        
        switch (grade){
            case 'A':
                System.out.println("Tebrikler. A notuyla gectiniz.");
                break;
            case 'B':
                System.out.println("B notuyla gectiniz.");
                break;
                
            case 'C' : case 'D':
                System.out.println("Dersi gectiniz. Ama bir sonrakilere iyi calisin");
                break;
                
            case 'F':
                System.out.println("Maalesef kaldiniz.");
                break;
                
            default:
                System.out.println("Gecersiz not girdiniz.");
        }

	}
}