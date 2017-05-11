package utiles;

/**
 * 
 * Distintas utilidades para usarlas en nuestros programas
 * 
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 *
 */
public class Utilidades {

	/**
	 * Genera un entero aleatorio entre un minimo y un maximo
	 * 
	 * @param min
	 *            Número mínimo para generar números aleatorios
	 * @param max
	 *            Número máximo para generar números aleatorios
	 * @return Número aleatorio generado
	 */
	public static int generarEnteroAleatorio(int min, int max) {
		return (int) (Math.round(Math.random() * (max - min) + min));
	}

	/**
	 * Genera un decimal aleatorio entre un minimo y un maximo
	 * 
	 * @param min
	 *            Número mínimo para generar números aleatorios
	 * @param max
	 *            Número máximo para generar números aleatorios
	 * @return Número aleatorio generado
	 */
	public static double generarDecimalAleatorio(int min, int max) {
		return (Math.random() * (max - min) + min);
	}

	/**
	 * Muestra un vector pasado por argumentos
	 * 
	 * @param vector
	 *            Vector que se va a mostrar
	 */
	public static void mostrarVectorEnteros(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
			if (i < vector.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	/**
	 * Metodo que devuelve true si se desea continuar o false si no se quiere
	 * continuar
	 * 
	 * @return true o false
	 */

	/**
	 *
	 * Verifica si el usuario quiere o no continuar con el proceso dado
	 * 
	 * @return true, en el caso de que introduzca carácter válido, false para
	 *         el resto de casos
	 */
	public static boolean deseaContinuar(String mensaje) {
		char caracter;
		do {
			caracter = Teclado.leerCaracter("\n �Desea continuar? S/N\n");
			if (caracter != 'S' && caracter != 's' && caracter != 'N' && caracter != 'n')
				System.out.println("\n Error, no ha introducido un caracter v�lido");
		} while (caracter != 'S' && caracter != 's' && caracter != 'N' && caracter != 'n');
		if (caracter == 'S' || caracter == 's') {
			return true;
		} else {
			System.out.println("\n Saliendo del programa...");
			return false;
		}

	}

}
