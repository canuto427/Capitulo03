package ejemplos;

import java.util.Scanner;

public class ejemplo01 {

	public static void main(String[] args) {
		// Ejemplo01
		int n1, n2, m=0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Numero 1:");
		n1 = teclado.nextInt();

		System.out.println("Numero 2:");
		n2 = teclado.nextInt();

		if (n1 > n2)
			m = n1;
		if (n2 > n1)
			m = n2;

		System.out.println(" ");
		System.out.println("Mayor: " + m);

	}

}