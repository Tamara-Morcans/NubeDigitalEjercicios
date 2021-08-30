import java.util.Scanner;
 
public class ParNon {
 
    public static void main(String[] args) {
       
        Scanner ParesNones = new Scanner(System.in);
       
        int n;
       
        System.out.print("Hola :D, Ingresa  un número: ");
        n = ParesNones.nextInt();
       
        if(n % 2 == 0  ) {
        	
        	if(n<100) {
        		 System.out.println(n+" Es un número par, menor que 100 y su cuadrado es " + Math.pow(n, 2));
        	}else {
        		 System.out.println(n+" Es un número par, mayor que 100 y su cuadrado es " + Math.pow(n, 2));
        	}
        }else {
        	if(n<100) {
        		System.out.println(n+" Es un número non, menor que 100 y su cuadrado es " + Math.pow(n, 2));
        	}else {
       		 System.out.println(n+" Es un número non, mayor que 100 y su cuadrado es " + Math.pow(n, 2));
       	}
        }
    }
}
      
        	
        
       