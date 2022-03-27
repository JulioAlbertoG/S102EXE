package nivell1exercici3;

public class Ejecutor_e3 {

	public static void main(String[] args) {
		
		/*
		 * Creamos un objeto y con el método le pasamos los cuatro valores y con el catch nos capturará
		 * la excepción porque el array solo permite 3 valores en el índice y no 4
		 */
		try {
			ArrayCreator array = new ArrayCreator();
			
			array.createList(1, 2, 3, 4);
		}
		catch(ArrayIndexOutOfBoundsException arrayE) {
			System.err.println("Tens un error " + arrayE);
			
		}

	}

}
