package loopDemo;

public class Main {

	public static void main(String[] args) {

        //For loop
        for(int i=36; i>10; i-=3){
            System.out.println(i);
        }
        System.out.println("For dongusu bitti!");
    
        //While loop
        int i = 5;
        while(i < 17){
            System.out.println(i);
            i++;
        }
        System.out.println("While loop bitti."); 

        
        //Do-While loop
        int j = 50;
        do{
            System.out.println("loglandi");
            System.out.println(j);
            j+=3;}
        while(j < 33);
        System.out.println("Do-While loop bitti."); 
        
    
    }
}

