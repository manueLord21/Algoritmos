package com.algoritmos;

import java.util.Scanner;

public class Ciclos {

	public int potencia(int base, int exponente) {
		int res = 1;
		for (int i = 0; i < exponente; i++) {
			res *= base;
		}
		return res;
	}

	public String invertir(int num) {
		int c1 = 0, c2 = 0, c3 = 0, c4 = 0;

		do {
			num -= 1000;
			c1++;
		} while (num >= 1000);
		do {
			num -= 100;
			c2++;
		} while (num >= 100);
		do {
			num -= 10;
			c3++;
		} while (num >= 10);
		do {
			num -= 1;
			c4++;
		} while (num >= 1);
		String inv = Integer.toString(c4) + Integer.toString(c3) + Integer.toString(c2) + Integer.toString(c1);
		return inv;
	}
	
	public String Primos(int primo) {
		int cont = 1, suma = 0, i = 0;
		String resultado = "";
		do {
			if(primo % cont == 0)
				i++;
			cont++;
		}while(cont != primo + 1);
		if (i <= 2)
			resultado = "Es primo";
		else
			resultado = "No se primo";
		return resultado;
	}
	
	public String Matriz (int matriz) {
		String cadena = "";
		for(int i = 0; i < matriz; i++) {
			for(int j = 0; j < matriz; j++) {
				cadena += " * ";
			}
			cadena += "\n";
		}
		return cadena;
	}
}
