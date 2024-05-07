package boletin_1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos un objeto ArrayList llamado "num" para almacenar números enteros.
		ArrayList<Integer> num = new ArrayList<>();

		// Llenamos el ArrayList con números del 0 al 10.
		for (int i = 0; i <= 10; i++) {
			// Agregamos cada número al ArrayList.
			num.add(i); 
		}

		// Imprimimos el ArrayList, que contendrá números del 0 al 10 en orden
		// ascendente.
		System.out.println("Lista ordenada --> ");
		System.out.println(num);

		// Línea en blanco.
		System.out.println();

		// Mezclamos los elementos del ArrayList utilizando el método shuffle de la
		// clase Collections.
		Collections.shuffle(num);

		// Imprimimos el ArrayList, que contendrá los mismos números pero en un orden
		// aleatorio.
		System.out.println("Lista desordenada --> ");
		System.out.println(num);
	}

}
