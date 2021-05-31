package arrays;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		
		int nElementos;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digita la cantidad de elementos");
		nElementos = entrada.nextInt();
		
		int [] numeros = new int[nElementos];
		
		for(int i=0; i<nElementos; i++) {
			System.out.println("Digita el arreglo No. "+ (i+1) +".-");
			numeros[i]=entrada.nextInt();
		}
		
		for(int i:numeros) {
			
			System.out.println(i);
		}
		

	}

}
