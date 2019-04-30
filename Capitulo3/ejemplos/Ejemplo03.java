package ejemplos;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {
		// Ejemplo03

		char c;
		String r = "";

		Scanner teclado = new Scanner(System.in);
		System.out.println("Caracter: ");
		c = teclado.next().charAt(0);

		r = "No es vocal";

		if (c == 'a' || c == 'A'){
		r = "Es vocal";
		}
		if (c == 'e' || c == 'E'){
		r = "Es vocal";
		}
		if (c == 'i' || c == 'I'){			
		r = "Es vocal";
		}
		if (c == 'o' || c == 'U'){
		r = "Es vocal";
		}
		if (c == 'u' || c == 'U'){
		r = "Es vocal";
		}
		System.out.println(" ");
		System.out.println("Resultado: "+r);
	}

}
