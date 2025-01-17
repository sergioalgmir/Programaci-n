package claseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
//		//Ejercicio 1
//		int [] numeros = {5,8,7,4,2,5,6,7,0,3,6,76,572,7,2,0,0,0,0,0,0,0,0};
//		int [] funcion = Ejercicio1.buscarTodos(numeros, 0);
//		
//		for (int i=0; i<funcion.length; i++){
//			System.out.print(funcion[i] + " ");
//			
//			
//		}System.out.println();
//		System.out.println();
//		
		//Ejercicio 2
//		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//		
//	    System.out.println();
//        System.out.println();
//        System.out.println("Array original");
//		for(int i: array) {
//			System.out.print(i + " ");
//		}
//        System.out.println();
//        System.out.println();
//     
//      
//        Ejercicio2.desordenar(array);
//        
//        System.out.println("Array desordenado:");
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//    
//        
//        //Ejercicio 3
//        
//        int [] desordenados = Ejercicio3.desordenar2(array);
//        
//        System.out.println("Array desordenado");
//        for (int i:desordenados) {
//        	System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println("Array original");
//    		for(int i: array) {
//    			System.out.print(i + " ");
//    		}
		
		
		
		//Ejercicio 4
		double [] listaSueldos = Ejercicio4.leeSueldos();
		for (int i = 0; i<listaSueldos.length; i++) {
			System.out.print(listaSueldos[i] + ", ");
			
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Sueldo máximo: " + Ejercicio4.sueldoMaximo(listaSueldos));
		System.out.println("Sueldo mínimo: " +Ejercicio4.sueldoMinimo(listaSueldos));
		System.out.println("Salario medio: " + Ejercicio4.mediaSueldos(listaSueldos));
		System.out.println();
		System.out.println();
		
		
	//Ejercicio 5	
//		Ejercicio5.leeNotas();
//		System.out.println();
		
	
		
//		Ejercicio 7
		
//		int [] t = {10,1,5,8,9,2};
//		System.out.println(Arrays.toString(Ejercicio7.suma(t, 3)));
//		System.out.println();
//	    
		
//		Ejercicio 8
		
//		System.out.println(Ejercicio8.matrizMagica(Ejercicio8.pideMatriz()));
//	        
	}

}
