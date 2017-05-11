/**
 * 
 */
package utiles;

import utiles.Teclado;

/**
 * 
 * 
 * 
 * @author Guillermo Boquizo S�nchez
 * @version 1.0
 *
 * */
public class DeseaContinuar {

	/**
    *
    * Verifica si el usuario quiere o no continuar con el proceso dado
    * @return true, en el caso de que introduzca car�cter v�lido, false para el resto de casos
    */
    public static boolean deseaContinuar(){
        char caracter;
        do{
            caracter = Teclado.leerCaracter("\n �Desea continuar? S/N\n");
            if (caracter != 'S' && caracter != 's' && caracter != 'N' && caracter != 'n')
                System.out.println("\n Error, no ha introducido un caracter v�lido");
        }while(caracter != 'S' && caracter != 's' && caracter != 'N' && caracter != 'n');  
            if (caracter == 'S' || caracter == 's'){
            return true;
            }else {
            System.out.println("\n Saliendo del programa...");
            return false;
        }

	}
}
