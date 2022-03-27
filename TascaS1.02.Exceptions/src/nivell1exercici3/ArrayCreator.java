package nivell1exercici3;

public class ArrayCreator {
	
	/*
	 * Creo una clase con su constructor vacío y creo un método que pasará los valores del array.
	 * el array solo permite 3 espacios en el índice, pero es necesario pasarle 4 para generar la exception
	 * que ide el ejercicio
	 */
	
	public ArrayCreator() {
		
	}
	
	public void createList(int num,int num1,int num2,int num3) {
		int[] arr = new int[3];
		
		arr[0] = num;
		arr[1] = num1;
		arr[2] = num2;
		arr[3] = num3;
	}

}
