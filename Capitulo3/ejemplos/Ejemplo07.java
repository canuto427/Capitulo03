package ejemplos;

import java.util.Scanner;

public class Ejemplo07 {

	public static void main(String[] args) {
		// Ejemplo07{
		int n,r;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("numero: ");
		n=teclado.nextInt();
		
		if (!(n%2==0)){
			r=n*2;
		}else{
			r=n*3;
		}
		System.out.println("");
		System.out.println("Resultado: "+r);
	}
}
