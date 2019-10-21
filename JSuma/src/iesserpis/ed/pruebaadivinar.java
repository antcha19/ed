/*
 * antonio yepez 17102019
 * adivinar un numero
 */
package iesserpis.ed;

import java.util.Scanner;
import java.util.Random;

public class pruebaadivinar {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		Random random=new Random();//para generar un numero aleatorio
		int numeroaleatorio = random.nextInt(1000) + 1;
		int numerointroducido;
		
		
		
		//ramdom.nextInt(1000);// devuelve un numero aleatorio entre 0-999
		//ramdom.nextInt(1000+1);// devuelve un numero aleatorio entre 0-1000
		System.out.println("numeroaleatorio = " + numeroaleatorio);
		System.out.println("introduce x:"); 
		numerointroducido  = teclado.nextInt();
		
		
		if (numerointroducido >= numeroaleatorio) {
			System.out.println("sigue buscando");
		}
		else if  (numerointroducido == numeroaleatorio ) {
			System.out.println("numero encontrado " + numeroaleatorio);
		}
		
	}

}