[1mdiff --git a/JHolaMundo/src/iesserpis/ed/HolaMundo.java b/JHolaMundo/src/iesserpis/ed/HolaMundo.java[m
[1mindex dddc0ce..61d8805 100644[m
[1m--- a/JHolaMundo/src/iesserpis/ed/HolaMundo.java[m
[1m+++ b/JHolaMundo/src/iesserpis/ed/HolaMundo.java[m
[36m@@ -1,9 +1,22 @@[m
 package iesserpis.ed;[m
 [m
[32m+[m[32mimport java.util.Scanner;[m
[32m+[m
 public class HolaMundo {[m
 [m
 	public static void main(String[] args) {[m
[31m-		System.out.println("hola mundo desde eclipse");[m
[32m+[m[41m		[m
[32m+[m		[32mScanner scanner = new Scanner(System.in); //varible para introducir por taclado[m
[32m+[m[41m		[m
[32m+[m		[32mSystem.out.println("introduce  tu nombre"); // imprimir por pantalla[m
[32m+[m		[32mString nombre = scanner.nextLine();[m
[32m+[m[41m		[m
[32m+[m		[32mSystem.out.println("introduce  tu edad?");[m
[32m+[m		[32mint edad = scanner.nextInt();[m
[32m+[m[41m		[m
[32m+[m		[32m//imprimi y introduce por teclado[m
[32m+[m		[32mSystem.out.println("mi nombre es " + nombre + " y tengo " + edad + " años");[m
 	}[m
 [m
 }[m
[41m+ [m
\ No newline at end of file[m
