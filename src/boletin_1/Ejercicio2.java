package boletin_1;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos un objeto LinkedHashSet llamado "num" para almacenar números enteros.
		LinkedHashSet<Integer> num = new LinkedHashSet<>();

		// Creamos un objeto Random llamado "rnd" para generar números aleatorios.
		Random rnd = new Random();

		// Repetimos hasta que el tamaño de "num" sea 10.
		while (num.size() < 10) {
			// Generamos un número aleatorio entre 1 y 20 (inclusive)
			int aleatorio = rnd.nextInt(20) + 1;
			// Agregamos el número aleatorio al conjunto "num".
			num.add(aleatorio);
		}
		// Imprimimos el conjunto "num", que contendrá 10 números aleatorios sin
		// duplicados.
		System.out.println(num);
	}

}
