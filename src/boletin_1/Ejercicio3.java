package boletin_1;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos un mapa para almacenar la frecuencia de cada letra
		HashMap<Character, Integer> contarLetras = new HashMap<>();

		// Definimos un cadena, que sera una frase muy larga.
		String texto = "En un agujero en el suelo, vivía un hobbit. "
				+ "No un agujero húmedo, sucio, repugnante, con restos "
				+ "de gusanos y olor a fango, ni tampoco un agujero, seco, "
				+ "desnudo y arenoso, sin nada en que sentarse o que comer: "
				+ "era un agujero-hobbit, y eso significa comodidad";

		// Recorrer el texto y contar la frecuencia de cada letra. Iterando sobre cada
		// carácter del texto.
		for (char letra : texto.toCharArray()) {
			// Verificamos si el carácter es una letra.
			if (Character.isLetter(letra)) {
				// Convertimos la letra a minúscula.
				letra = Character.toLowerCase(letra);
				// Obtenemos la frecuencia actual de la letra en el mapa.
				Integer frecuencia = contarLetras.get(letra);
				// Si la letra no está en el mapa.
				if (frecuencia == null) {
					// La agregamos al mapa con frecuencia 1.
					contarLetras.put(letra, 1);
					// Si la letra ya está en el mapa.
				} else {
					// Incrementamos su frecuencia en 1.
					contarLetras.put(letra, frecuencia + 1);
				}
			}
		}

		// Mostrar la frecuencia de cada letra
		System.out.println("Frecuencia de cada letra: ");
		for (Map.Entry<Character, Integer> entry : contarLetras.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
