package nivell1exercici2;

public class Ejecutor_e2 {

	public static void main(String[] args) {
		/*
		 * En un bloque try creamos un objeto y accedemos al método que muestra la información
		 */
		try {
			Class prova = new Class(null);
			prova.mostrarLong();
		}
		/*
		 * Utilizo dos bloques catch uno específico y otro genérico y pongo distintos mensajes para
		 * ver cuál es el que se muestra por consola
		 */
		catch(NullPointerException empty) {
			System.err.println("Ups falta algo " + empty);
		}
		catch(Exception e){
			System.err.println("Ha habido un problema del siguiente tipo: " + e);
			
		}
		

	}

}
