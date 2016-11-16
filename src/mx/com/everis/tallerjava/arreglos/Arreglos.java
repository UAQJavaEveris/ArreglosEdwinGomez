package mx.com.everis.tallerjava.arreglos;

public class Arreglos {
	
	public static void main(String [] args){
		int [] arreglo1 = {1,2,3,4,5,6};
		int [] arreglo2 = {6,5,4,3,2,1};
		
		/*
		 * Recorrer (sumar) arreglo de manera ascendente
		 */
		System.out.println("Recorrer (sumar) arreglo de manera ascendente");
		int sumaAsc = 0;
		for(int i = 0; i < arreglo1.length; i++){
			sumaAsc += arreglo1[i];
			System.out.println("\nValor del arreglo: " + arreglo1[i]);
			System.out.println("Suma acumulada: " + sumaAsc);
		}
		
		/*
		 * Recorrer (sumar) arreglo de manera descendente
		 */
		
		System.out.println("\nRecorrer (sumar) arreglo de manera descendente");
		int sumaDesc = 0;
		for(int i = arreglo1.length -1; i >= 0; i--){
			sumaDesc += arreglo2[i];
			System.out.println("\nValor del arreglo: " + arreglo2[i]);
			System.out.println("Suma acumulada: " + sumaDesc);
		}
		
	}
}
