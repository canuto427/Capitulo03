package ejemplos;

import java.util.Scanner;

public class Ejemplo09 {

	public static void main(String[] args) {
		// Ejemplo09{
		final float d1 = 0.1f;
		final float d2 = 0.2f;
		final float igv = 0.19f;

		float c, md, migv, p;

		Scanner teclado = new Scanner(System.in);
		System.out.println("numero: ");
		c = teclado.nextInt();

		if (c <= 100) {
			md = c * d1;
		} else {
			md = c * d2;
		}
		migv = (c - md) * igv;
		p = c - md + migv;

		System.out.println("");
		System.out.println("Monto descuento: " + md);
		System.out.println("Impuesto IGV: " + migv);
		System.out.println("Total a pagar : " + p);
	}
}
