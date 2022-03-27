package nivell1exercici2;

public class Class {
	
	/*
	 * Creamos la clase y en el constructor le pasamos un parámetro de tipo String
	 * cuyo valor será null para generar la exception. Creamos un método para mostrar la excepción
	 */
	private String nom;

	public Class(String n) {
		this.nom = n;
	}
	
	public void mostrarLong() {
		System.out.println("Hola mi nombre tiene " + nom.length() + "letras");
	}
	
	
	
}
