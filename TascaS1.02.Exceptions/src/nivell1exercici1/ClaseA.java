package nivell1exercici1;

public class ClaseA {

	public static void main(String[] args) {
		
		try {
			/*
			 * Cremos el objeto exception con un mensaje y lo lanzamos con throw para que lo imprima
			 * Podemos poner diferentes tipos de excepciones separadas con |
			 */
			Exception e = new Exception("Hola sóc una exception");
			throw e;
		
			
		}
		/*
		 * Capturamos aquí la excepción e imprimimos el mensaje
		 */
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		/*
		 * El finally es el lugar perfecto para limpiar valores de código. Se ejecutará siempre
		 * sin importar lo que pase en el block try
		*/

		finally {
			System.out.println("Anem a començar de 0");
		}
	}

}
