import java.util.Scanner;
 
public class ParNon {
 
    public static void main(String[] args) {
       
        Scanner ParesNones = new Scanner(System.in);
       
        int n;
       
        System.out.print("Hola :D, Ingresa  un n�mero: ");
        n = ParesNones.nextInt();
       
        if(n % 2 == 0  ) {
        	
        	if(n<100) {
        		 System.out.println(n+" Es un n�mero par, menor que 100 y su cuadrado es " + Math.pow(n, 2));
        	}else {
        		 System.out.println(n+" Es un n�mero par, mayor que 100 y su cuadrado es " + Math.pow(n, 2));
        	}
        }else {
        	if(n<100) {
        		System.out.println(n+" Es un n�mero non, menor que 100 y su cuadrado es " + Math.pow(n, 2));
        	}else {
       		 System.out.println(n+" Es un n�mero non, mayor que 100 y su cuadrado es " + Math.pow(n, 2));
       	}
        }
    }
}
      
        	
        
       