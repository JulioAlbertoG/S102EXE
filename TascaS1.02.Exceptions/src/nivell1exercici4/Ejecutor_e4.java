package nivell1exercici4;

public class Ejecutor_e4 {

	public static void main(String[] args) {
		
		/*
		 * En el try enviamos el mensaje a la clase de excepción y en el catch imprimimos el mensaje
		 * y también se muestra la clase de la excepción que hemos creado. Con el throw dejo que la exception
		 * se maneje en otro momento del programa, y no aquí mismo
		 */
		
		try {
			throw new MyExceptions("Missatge personalitzat d'excepció");
		}
		catch(MyExceptions e) {
			System.err.println(e);
			
		}

	}

}
