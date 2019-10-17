/*
 * antonio yepez 17102019
 * adivinar un numero
 */
package iesserpis.ed;

import java.util.Random;

public class jadivinar {

	public static void main(String[] args) {
		
		Random random=new Random();//para generar un numero aleatorio
		int numeroaleatorio= random.nextInt(1000) + 1;
		
		//ramdom.nextInt(1000);// devuelve un numero aleatorio entre 0-999
		//ramdom.nextInt(1000+1);// devuelve un numero aleatorio entre 0-1000
		System.out.println("numeroaleatorio = " + numeroaleatorio);
		
		
	}

}
