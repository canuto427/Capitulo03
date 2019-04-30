package ejemplos;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {
		// Ejemplo05
		int n;
		String r;
		Scanner teclado = new Scanner (System.in);
		System.out.println("numero: ");
		n=teclado.nextInt();
		
		if (n%2==0){
		r="Par";
		}else {
			r="Impar";
		}
		System.out.println("");
		System.out.println("resultao: "+r);
		
	}

}
