package nivell1exercici5;

public class ComportamentErroni {

	public static void main(String[] args) {
	
		/*
		 * Es posible que no haya entendido bien el enunciado, pero lo que he hecho es crear un programa
		 * que mantiene una exception mientras el número entero sea negativo, con el bucle while se va
		 * mostrando hasta llegar a 0 y cuando sucede cambia el valor boolean de la exception a falso.
		 * Con el throw lanzo una nueva excepción que será capturada en el catch mostrando un mensaje
		 * que indica que el comportamiento erróneo ha acabado y ya se podrá llenar con enteros positivos.
		 */

		boolean exception=true;
		int contador = -10;
		while(exception) {
			try {
				contador++;
				if(contador<0) {
				System.err.println("Existeix una excepció perquè és un nombre negatiu");
				}
				else {
					exception=false;
					throw new Exception();
				}	
				
			}
			catch(Exception e) {
				System.out.println("Ja hem arribat a 0 i ja aquest bucle no donará nombres negatius");
				
			}
			
		}
		

	}

}
