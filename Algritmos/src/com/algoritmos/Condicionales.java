package com.algoritmos;

public class Condicionales {
	public boolean acrditar(int asistencia, int calificacion) {
		final int totalAsist = 70;
		boolean paso = false;
		if (asistencia >= (totalAsist*.8 ) && calificacion >= 60)
				paso = true;
		return paso;
	}
	
	public double salario(double sueldo, double horas) {
		double totalPago = 0;
		if (horas >= 41) {
			totalPago = 40 * sueldo +(((horas - 40) * 1.5) * sueldo); 
		}else {
			totalPago = horas * sueldo;
		}
		
		return totalPago;
	}
	
	public int medio(int n1, int n2, int n3) {
		int res = 0;
		if ((n1 > n2 && n3 > n1) || (n3 < n1 && n1 < n2))
			res = n1;
		if ((n1 < n2 && n3 > n2) || (n3 < n2 && n1 > n2))
			res = n2;
		if ((n1 < n3 && n3 < n2) || (n3 > n2 && n1 > n3))
			res = n3;
		return res;
	}
	
	public int suCar(int num1, int num2) {
		int total = 0, res1, res2;
		if(num1 <= 10000 && num2 <= 10000) {
			res1 = Integer.toString(num1).length();
			res2 = Integer.toString(num2).length();
			total = res1 + res2;
		}
		return total;
	}
	
	public String hora(int h, int m, int s, int sx) {
		int r1 = 0, r2 = 0, r3 = 0;
		String hor = "";
		s += sx;
		if (s >= 60) {
			r1 = s / 60;
			s = (s % 60);
		}
		m += r1;
		if (m >= 60) {
			r2 = m / 60;
			m = (m % 60);
		}
		h += r2;
		if (h >= 24) {
			h = 0;
		}
		hor = Integer.toString(h) + " : " + Integer.toString(m) + " : " + Integer.toString(s);
		return hor;
	}
	
	public boolean adivina(int num, int n) {
		if (num == n)
			return true;
		else
			return false;
	}
}
