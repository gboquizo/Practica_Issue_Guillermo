package guillermoBoquizoSanchezAcumulaSumas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;



public class Test {

	private static Scanner sc;

	public static void main(String[] args) {

		do {
			sc = new Scanner(System.in);
			try {
				int suma = 0;
				int sumando = 1;
				File file = new File("suma.txt");
				if (file.exists()) {
					suma = leer();
				}

				PrintWriter escribir = new PrintWriter("suma.txt");
				FileReader leer = new FileReader("suma.txt");
				BufferedReader bf = new BufferedReader(leer);

				try {
					suma = Integer.valueOf(bf.readLine());
				} catch (NumberFormatException e1) {

				}
				System.out.println("Partimos de " + suma + ". \nPara salir, introduce 0.");
				do {
					System.out.println("Introduce la cantidad que deseas sumar:");
					try {
						sumando = sc.nextInt();
						suma += sumando;

					} catch (InputMismatchException e) {
						System.out.println("Error de entrada de datos, por favor, introduce un entero");
						sc.next();
					}

				} while (sumando != 0);
				System.out.println("Total acumulado en la suma : " + suma);
				escribir();
				escribir.write(String.valueOf(suma));
				escribir.flush();
				escribir.close();
				leer.close();
				bf.close();
			} catch (IOException e) {
			} 
		} while (utiles.DeseaContinuar.deseaContinuar());
	}
	
	
	private static int leer() {
		Scanner leer = null;
		int recuento = 0;
		try {
			leer = new Scanner(new BufferedReader(new FileReader("suma.txt")));
			recuento = Integer.parseInt(leer.nextLine());
		} catch (NoSuchElementException | FileNotFoundException e) {
			System.err.println("No se han encontrado registros de datos en el archivo, comenzamos de cero.");
		} finally {
			if (leer != null) {
				leer.close();
			}
		}
		return recuento;

	}


	private static void escribir() throws IOException {
		PrintWriter escribir = null;
		try {
			escribir = new PrintWriter(new BufferedWriter(new FileWriter("suma.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (escribir != null) {
				escribir.close();
			}
		}
	}

}