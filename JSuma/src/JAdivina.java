/*
 * Antonio Yepez
 * 07102019
 * programa  para adivinar un numero
 */
import java.util.Random;
import java.util.Scanner;

public class JAdivina {

	public static void main(String[] args) {
		
		//variable para introducir por pantalla
		Scanner sc=new Scanner(System.in);
		int	x;
		

		System.out.println("numero");
		x  = sc.nextInt();
	
		while (x !=0) {
			System.out.println("introduce un numero (0 para terminar):");	
			x = sc.nextInt();
			
		}
			System.out.println("fin del programa");
	}
	
	

}
