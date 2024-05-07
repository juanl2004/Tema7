package boletin_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos una lista para alamacenar los nombre en el orden en el que los
		// ingresamos.
		List<String> nombresL = new ArrayList<>();

		// Variable donde almacenaremos el nombre que vayamos leyendo.
		String nombre = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese 5 nombres --> ");

		// Con este for leemos los nombre y lo agregamos al conjunto y a la lista.
		for (int i = 0; i < 5; i++) {
			System.out.println("Nombre Nº" + (i + 1) + " --> ");
			nombre = sc.nextLine();

			// Agregamos el nombre si no esta duplicado.
			if (nombresL.contains(nombre)) {
				System.out.println("Este nombre ya ha sido ingresado. INGRESELO DE NUEVO");
				// Decrementamos el contador para volver a solicitar el nombre.
				i--;
			} else {
			nombresL.add(nombre);
			}
		}

		// Utilizamos el método reverse para invertir los nombres en orden inverso.
		Collections.reverse(nombresL);

		// Mostramos los nombres ya invertidos.
		System.out.println("Nombres en orden inverso --> ");

		for (String nombres : nombresL) {
			System.out.println(nombres);
		}

		// Cierre de Scanner
		sc.close();
	}

}
