

public class ContadorLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "Hola este mundo es genial 1234"; //Aquí puedes ingresar cualquier frase y correrlo.
		Resultado resultado = contarLetrasNumerosEspacios(texto);
		
		
		 
		System.out.print( "La frase:   " + texto   + " \t tiene" + resultado.contadorLetras + " letras  ");
		
		System.out.print( resultado.contadorNumeros + " numeros y ");
		
		System.out.print( resultado.contadorEspacios + " espacios.");
	}
		 
		 public static Resultado contarLetrasNumerosEspacios(String texto) {
		 		int contadorLetras = 0;
		 		int contadorNumeros = 0;
		 		int contadorEspacios = 0;
		 		
		 		char [] caracteres = texto.toCharArray();
		 		for (int i = 0; i < caracteres.length; i++) {
		 			if(Character.isLetter(caracteres[i])) {
		 				++ contadorLetras;
		 			}else if (Character.isDigit(caracteres[i])) {
		 				++ contadorNumeros;	 				
		 			}else if  (Character.isSpaceChar(caracteres[i])) {
		 				++ contadorEspacios;	 		 			
		 			}
		 		}
		 		
		 		Resultado resultados = new Resultado();
		 		resultados.contadorLetras = contadorLetras;
		 		resultados.contadorNumeros = contadorNumeros;
		 		resultados.contadorEspacios = contadorEspacios;
		 		
		 		return resultados;
		 		
		 		}
		 } 
		 
		  class Resultado {
			  public int contadorLetras;
			  public int contadorNumeros;
			  public int contadorEspacios;
			  
		  }
	

	       
	        
	       