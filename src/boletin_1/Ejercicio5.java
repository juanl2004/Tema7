package boletin_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio5 {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/// Utilizamos Hashmap para poder listar claves valor.
		Map<String, Integer> seriesTV = new HashMap<>();

		// Variable donde guardamos el valor de la opción seleccionada.
		int opcion = 0;

		// Comprobamos si la opción introducida es correcta.
		while (opcion != 4) {

			// Mostramos el menú
			System.out.println("MENÚ: ");
			System.out.println("1. Agregar serie --> ");
			System.out.println("2. Buscar serie --> ");
			System.out.println("3. Eliminar serie --> ");
			System.out.println("4. Salir --> ");
			System.out.println();

			// Pedimos al usuario que introduzca una opción por teclado y limpiamos
			System.out.println("Elige la opción deseada --> ");
			opcion = sc.nextInt();
			sc.nextLine();

			// Utilizamos un switch para realizar una función distinta segun la opción
			// seleccionada
			switch (opcion) {
			case 1:
				agregarSerie(seriesTV);
				break;
			case 2:
				buscarSerie(seriesTV);
				break;
			case 3:
				eliminarSerie(seriesTV);
				break;
			case 4:
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no valida. Ingrese una opción de nuevo");
			}
		}

		// Cierre de Scanner
		sc.close();

	}

	/**
	 * Este metodo le pide al usuario el nombre y la valoración y los introduce en
	 * la lista usando el put.
	 * 
	 * @param seriesTV El mapa donde almacenaremos nuestras series con valoraciones.
	 */
	public static void agregarSerie(Map<String, Integer> seriesTV) {
		System.out.println("Introduce el nombre de la serie --> ");
		String nombre = sc.nextLine();

		System.out.println("Introduce la valoración de la serie --> ");
		int valoracion = sc.nextInt();

		seriesTV.put(nombre, valoracion);
		System.out.println(
				"La serie \"" + nombre + "\" con una valoración de " + valoracion + " se ha agregado correctamente.");
	}

	/**
	 * Método que nos pide por teclado el nombre de la serie y nos busca si la
	 * clave, ese nombre se encuentra en la clave si es asi, nos devuelve el nombre
	 * y la valoración.
	 * 
	 * @param seriesTV El mapa donde almacenaremos nuestras series con valoraciones.
	 */
	public static void buscarSerie(Map<String, Integer> seriesTV) {
		System.out.println("Introduce el nombre de la serie que quieres buscar --> ");
		String nombre = sc.nextLine();

		if (seriesTV.containsKey(nombre)) {
			int valoracion = seriesTV.get(nombre);
			System.out.println("La valoración de la serie \"" + nombre + "\" es: " + valoracion);
		} else {
			System.out.println("La serie \"" + nombre + "\" no se encuentra en el sistema.");
		}
	}

	/**
	 * Este método nos pide el nombre por teclado. Verifica que le nombre se
	 * encuentra en el mapa, si es así, lo elimina. Si no, nos dice que ese nombre
	 * no se encuentra en el sistema.
	 * 
	 * @param seriesTV El mapa donde almacenaremos nuestras series con valoraciones.
	 */
	public static void eliminarSerie(Map<String, Integer> seriesTV) {
		System.out.println("Introduce el nombre de la serie que quieres eliminar --> ");
		String nombre = sc.nextLine();

		// Verificamos si la serie existe en el mapa
		if (seriesTV.containsKey(nombre)) {
			seriesTV.remove(nombre);
			System.out.println("La serie \"" + nombre + "\" se ha eliminado del sistema.");
		} else {
			System.out.println("La serie \"" + nombre + "\" no se encuentra en el sistema.");
		}
	}
}
