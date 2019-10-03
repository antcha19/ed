package iesserpis.ed;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //varible para introducir por taclado
		
		System.out.println("introduce  tu nombre"); // imprimir por pantalla
		String nombre = scanner.nextLine();
		
		System.out.println("introduce  tu edad?");
		int edad = scanner.nextInt();
		
		//imprimi y introduce por teclado
		System.out.println("mi nombre es " + nombre + " y tengo " + edad + " años");
	}

}
 