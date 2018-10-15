package com.algoritmos;

import java.util.ArrayList;
import java.util.Iterator;

public class Arreglos {

	public String ArregloMes(int num) {
		String mese = "";
		String meses [] = new String [] {"Nones","Enero", "Febrero", "Marzo", "April", "Mayo", "Junio", "Julio", "Agosto", "Septiempbre", "Octubre", "Noviembre", "Diciembre"}; 
		for (int n = 0; n < 12; n++) {
			if (num == n)
				mese = meses[n];
		}
		return mese; 
	}
//	For-each: for anidado
//	String[] arreglo = {"hola", "como estas", "mimon", "ouwa", "que rollo", "mirale"};
//	for (String item : arreglo) {
//		System.out.println(item);
//	}
//	int[] arreglo2= {1,23,43,76, 1234};
//	for (int nums : arreglo2) {
//		nums = nums + nums;
//		System.out.println(nums);
//	}
	
	public int[] SumaArreglos(int[] num1, int[] num2) {
		int[] suma = new int[num1.length];
		for (int i = 0; i < suma.length; i++)
			suma[i] = num1[i] + num2[i];
		return suma;
	}

	public int Media(ArrayList num) {
		int media = 0;
		Iterator it = num.iterator();
		while(it.hasNext()) {
			media += (int)it.next();
		}
		media = media / num.size();
		return media;
	}
	
	public int[] fibonacci(int cant) {
		int[] fibo = new int [cant];
		if(cant != 0){
			for (int i = 0; i < fibo.length; i++) {
				if (i <= 1 ){
					fibo[i] = i;
				}
				else
					fibo[i] = fibo[i-1] + fibo[i-2];
			}
		}

		return fibo;
	}
	public int[] recorrido(int[] arre) {
		int[] numer = new int[arre.length];
		for (int i = 1; i < numer.length; i++) 
			numer[i] = arre[i-1];
		numer[0] = arre[arre.length-1];
		return numer;
	}
}


