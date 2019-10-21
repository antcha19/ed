/*
 * antonio yepez 17102019
 * adivinar un numero
 */
package iesserpis.ed;

import java.util.Scanner;
import java.util.Random;

public class jadivinar {

	public static void main(String[] args) {
		
		Random random=new Random();//para generar un numero aleatorio
		int numeroaleatorio = random.nextInt(1000) + 1;
		System.out.println("numero aleatorio = " + numeroaleatorio); 
	
		
		//ramdom.nextInt(1000);// devuelve un numero aleatorio entre 0-999
		//ramdom.nextInt(1000+1);// devuelve un numero aleatorio entre 0-1000
		Scanner teclado = new Scanner(System.in);
		int numerointroducido;
		int extremoizquierdo =1;
		int extremoderecho =1000;
		int contadorintentos=0;
		do {
			contadorintentos++;
			System.out.printf("adivina el numero [intentos %s] (entre %s y %s) ",
					  contadorintentos, extremoizquierdo,extremoderecho); 
			numerointroducido= teclado.nextInt();
			if(numerointroducido < numeroaleatorio);
				 extremoizquierdo = numerointroducido + 1;
				
				 if (numerointroducido > numeroaleatorio)
					extremoderecho = numerointroducido -1;
			
		} while (numerointroducido != numeroaleatorio);
		
		System.out.println(" has acertado");
		//contadorintentos;
	}
	

}
