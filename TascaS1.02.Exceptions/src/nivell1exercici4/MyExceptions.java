package nivell1exercici4;

public class MyExceptions extends Exception {
	
	/*
	 * Creamos la clase de exception y como atributo ponemos el mensaje personalizado
	 */
	
	private String message;
	
	/*
	 * Le apsamos como parámetro al constructor el mensaje que se mostrará personalizado
	 * Como no necesitamos el constructor de la clase superior dejamos el super de lado 
	 * y lo dejo comentado
	 */
	
	public MyExceptions(String message) {
		//super();
		this.message = message;
	}
	
	/*
	 * Con un método getter podré obtener el mensaje personalizado así como la clase a la que pertenece
	 * Y con el setter paso el mensaje por parámetro
	 */

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	



}
