/**
 * 
 */
package es.indra.aplicaciocarritocompra.main;

import java.util.Scanner;

import es.indra.aplicacioncarritocompra.beans.Categorias;

/**
 * @author P.era-1
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcion1;
		
		Categorias categoria = new Categorias();
		categoria.setNombre("Alimentacion");
		categoria.setNombre("Perfumeria");
		categoria.setNombre("Limpieza");
		
	
		System.out.println("Bienvenido a Amazon");
		
		do {
			
			System.out.println("1) EMPRESA");
			System.out.println("2) CLIENTE");
			System.out.println("Seleccione una opcion: ");
			opcion1 = Integer.parseInt(scanner.next());
			
			switch(opcion1) {
			
				case 1: 

					//EMPRESA
					System.out.println("Apartado de la Empresa");
					
					
					break;
					
					
				case 2:
				{
					//CLIENTE
					System.out.println("Apartado del Cliente");
					
					//MOSTRAR LISTA DE CATEGORIAS
					System.out.println("1)  Alimentacion");
					System.out.println("2)  Perfumeria");
					System.out.println("3)  Limpieza");
					System.out.println("seleccione una opcion");
					opcion1=scanner.next().charAt(0);
				}
					switch (opcion1) {
					case 1:
						
						//PRODUCTOS
						
						
					}
				}
		
		
		}while(opcion1 != 'n');
		

	}

}
