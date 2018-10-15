package com.algoritmos;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
//import java.util.*; para impotar todas los librerias de util

public class AlgoritmosApp {
	// TODO Auto-generated method stub

	public static void main(String[] args) {
		int swa = 0;
		Random rm = new Random(System.nanoTime());
		Scanner sc = new Scanner(System.in);
		int base = 0, exp = 0;
		int cal = 0, asis = 0;
		double ho = 0, sa = 0;
		int n1 = 0, n2 = 0, n3 = 0;
		int num1 = 0, num2 = 0;
		int h = 0, m = 0, s = 0, sx = 0;
		int inv = 0;
		int adi = 0, nu = 0;
		int primo = 0;
		int matriz = 0;
		int[] ma = new int[13];
		int numarr = 0;
		int ald = 0, re = 0;
		Ciclos c = new Ciclos();
		Condicionales con = new Condicionales();
		Arreglos a = new Arreglos();
		Archivos archi = new Archivos();
		String loren = "";
		do {
			System.out.println("1.- Base y exponente");
			System.out.println("2.- Aprobatoro de un alumno");
			System.out.println("3.- Calcular Salario");
			System.out.println("4.- Cual es el numero medio");
			System.out.println("5.- Suma de caracteres");
			System.out.println("6.- Pedir hora y extra");
			System.out.println("7.- Numero al espejo");
			System.out.println("8.- Adivina el numero");
			System.out.println("9.- Numero primo");
			System.out.println("10.- Crea matriz");
			System.out.println("11.- Meses en matriz");
			System.out.println("12.- Suma de 2 arreglos");
			System.out.println("13.- Utiliza el arraylist para calcular la mediana");
			System.out.println("14.- Fibonacci");
			System.out.println("15.- Cambiar pocision del 1 numero der arreglo al ultimo");
			System.out.println("16.- >Leer un texto");
			System.out.println("17.- Escribir en un texto");
			System.out.println("18.- Cambiar vocales a - de un texto");
			System.out.println("0.- Salir");
			System.out.print("Que escoges?   ");
			swa = sc.nextInt();
			switch (swa) {
			case 1:
				// Pedir base y exponente, calcular resultado
				System.out.println("Dame la base: ");
				base = sc.nextInt();
				System.out.println("Dame el exponente: ");
				exp = sc.nextInt();
				System.out.println("El resultado es: " + c.potencia(base, exp));
				break;
			case 2:
//				Decir si un alumno paso o no, de acuerdo a la calificacion y asistencia
				System.out.println("Cual es tu calificacion?");
				cal = sc.nextInt();
				System.out.println("Cuanto aststencias tenes?");
				asis = sc.nextInt();
				System.out.println("Pasaste: " + con.acrditar(asis, cal));
				break;
			case 3:
//				Pedir el suela y las horas de un trabajador, calcualar salario
				System.out.println("Cuantas horas has trabajado?");
				ho = sc.nextDouble();
				System.out.println("Cual es tu salario?");
				sa = sc.nextDouble();
				System.out.println("Sueldo es: " + con.salario(sa, ho));
				break;
			case 4:
//				cual es el numero medio 
				System.out.println("Cual es el numero 1?"); n1 =
				sc.nextInt();
				System.out.println("Cual es el numero 2?");
				n2 = sc.nextInt();
				System.out.println("Cual es el numero 3?");
				n3 = sc.nextInt();
				System.out.println("El  numero medio es de :  " + con.medio(n1, n2, n3));
				break;
			case 5:
//				suma los carateres de 2 numeros y muestre cuntos cracteres son
				System.out.println("Cual es el numero 1?");
				num1 = sc.nextInt();
				System.out.println("Cual es el numero 2?");
				num2 = sc.nextInt();
				System.out.println("El  numero medio es de :  " + con.suCar(num1, num2));
				break;
			case 6:
//				poner horas, minutos, segundos y agregar los segundos extras y mostrar el resutado on los segundos extras 
				System.out.println("Cual son las horas?");
				h = sc.nextInt();
				System.out.println("Cual son los minutos?");
				m = sc.nextInt();
				System.out.println("Cual son los segundos?");
				s = sc.nextInt();
				System.out.println("Cual son los segundos que se van a agregar?");
				sx = sc.nextInt();
				System.out.println("la hora original es de :  " + h + " : " + m + " : " + s);
				System.out.println("la hora modificada es de :  " + con.hora(h, m, s, sx));
				break;
			case 7:
//				Coloca un numero y que lo mprima como un espqjo
				System.out.println("Dame un numero para invertir:");
				inv = sc.nextInt();
				System.out.println("numero para invertir:" + c.invertir(inv));
				break;
			case 8:
//				Es para adibinar un numro random 
				Random ran = new Random(System.nanoTime());
				adi = ran.nextInt(20);
				con.adivina(adi, nu);
				do {
					System.out.println("Dame el numero para adivinar:");
					nu = sc.nextInt();
					System.out.println(con.adivina(adi, nu));
				} while (!con.adivina(adi, nu));
				break;
			case 9:
//				Programa que determine un numero su es primo o no
				System.out.println("Dame un numero");
				primo = sc.nextInt();
				System.out.println(c.Primos(primo));
				break;
			case 10:
//				Crear una matiz de señalando el tamaño e imprimendo el resultado
				System.out.println("De caunto va a ser el tamaño de la matriz");
				matriz = sc.nextInt();
				System.out.println(c.Matriz(matriz));
				break;
			case 11:
//				Programa que pueda que utlilizes 2 matrizes para mostrar los meses del año
				Random rnm = new Random(System.nanoTime());
				for (int i = 0; i < ma.length; i++) {
					ma[i] = rnm.nextInt(12);
					System.out.println("[ " + ma[i] + " ] -->  " + a.ArregloMes(ma[i]));
				}
				break;
			case 12:
//				Suma de 2 arreglos y que te imprima en un 3° arreglo
				System.out.println("Dame el tamaño del los arreglos:");
				numarr = sc.nextInt();
				int[] arr1 = new int[numarr];
				int[] arr2 = new int[numarr];
				int[] resarre = new int[numarr];
				for (int i = 0; i < numarr; i++) {
					arr1[i] = rm.nextInt(100);
					arr2[i] = rm.nextInt(100);
				}
				resarre = a.SumaArreglos(arr1, arr2);
				for (int j = 0; j < numarr; j++)
					System.out.println("[ " + arr1[j] + " ] + [ " + arr2[j] + "] --> " + resarre[j]);
				break;
			case 13:
//				Utiliza el arraylist para calcular la mediana
				ArrayList list1 = new ArrayList();
				System.out.println("Dame datos hasta una negativo");
				int sum = 0, res = 0;
				do {
					ald = sc.nextInt();
					list1.add(ald);
				} while (ald >= 0);
				list1.remove(list1.size() - 1);
//				System.out.println("Tamaño de arraylist:  " + list.size());
				System.out.println("La Mediana es:  " + a.Media(list1));
				break;
			case 14:
//				fibonacci con arreglos
				int tamafibo = 0;
				System.out.println("Dime cunatos numeros fibonacci quieres:  ");
				tamafibo = sc.nextInt();
				int[] resfibo = new int[tamafibo];
				resfibo = a.fibonacci(tamafibo);
				for (int i = 0; i < resfibo.length; i++) {
					System.out.println(i + 1 + ".-   " + resfibo[i]);
				}
				break;
			case 15:
//				recorrido y combio del numero primero del arreglo al ultimo
				int col1 = 0, col2 = 0;
				System.out.print("Dime la cantidad de datos a ingresar:  ");
				col1 = sc.nextInt();
				int[] arreglo = new int[col1];
				for (int i = 0; i < arreglo.length; i++) {
					arreglo[i] = rm.nextInt(100);
					System.out.print(arreglo[i] + "  ");
				}
				System.out.println("");
				arreglo = a.recorrido(arreglo);
				for (int i : arreglo)
					System.out.print(i + "  ");
				break;
			case 16:
//				en este es para lere el contenido de un archivo
				loren = archi.leer("C:\\Users\\Luis Manuel Chavez V\\Documents\\eclipse-workspace\\texto.txt");
				System.out.println(loren);
				break;
			case 17:
//				escribir en un texto
				archi.escribir("C:\\Users\\Luis Manuel Chavez V\\Documents\\eclipse-workspace\\texto2.txt", "pruba nueva con otro texto");
				break;
			case 18:
//				para vambiar volales del texto en "-"
				loren = archi.leer("C:\\Users\\Luis Manuel Chavez V\\Documents\\eclipse-workspace\\texto2.txt");
				System.out.println(archi.modificar(loren));
				break;
			}
		} while (swa != 0);
		
/*		
//		Ejemplo apara usar el arraylist
		ArrayList list = new ArrayList();
		list.add("Manuel"); // Datos que va a temer el arraylist
		list.add(123);
		list.add(true);
		list.add('d');
		list.add(c);

		list.remove(4); // remover un dato de array list en el inice
		System.out.println("La lista contiene Manuel ?" + list.contains("Manuel"));
		System.out.println("La lista contiene Jorge ?" + list.contains("Jorge"));
		// en los anteriores lineas de codigo es para ver si el arraylist tine un dato
		// agragado
		Iterator it = list.iterator(); // este es para ver los datos que tiene el arraylist
		while (it.hasNext()) { // ciclo que sigue mientras haya elemantos en el arraylist
			System.out.println(it.next());
		}
		System.out.println("Tamaño de arraylist:  " + list.size());// este es el del tamaño del arraylist


//		ejemplo para usar una pila
		Stack<String> pila = new Stack<String>();
		pila.push("Jose");
		pila.push("Manuel");
		pila.push("Natalia");
		pila.push("Juan");
		pila.push("Miguel");
		pila.push("Marco");
		System.out.println("El tamaño de la pila:  " + pila.size());
		System.out.println("El uttilo elemento de la pila:  " + pila.peek());
		System.out.println("elimina el utlimo elemento:  " + pila.pop());
		System.out.println("El tamaño de la pila:  " + pila.size());
		while (pila.size() != 0) {
			System.out.println(pila.pop());
		}

		PriorityQueue<String> cola = new PriorityQueue<String>();
		cola.add("Jose");
		cola.add("Manuel");
		cola.add("Natalia");
		cola.add("Juan");
		cola.add("Miguel");
		cola.add("Marco");

		Iterator ite = cola.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println("El primero:   " + cola.peek());
		System.out.println("Elimima el primer elemento:   " + cola.poll());
		System.out.println("Contiene Jose?  " + cola.contains("Jose"));
		System.out.println("Contiene Manuel?  " + cola.contains("Manuel"));
		System.out.println("Contiene Manu?  " + cola.contains("Manu")); // si contiene un elemento
		cola.remove("Manuel"); // remueve elemneto con

//		TreeSet
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Jose");
		tree.add("Manuel");
		tree.add("Natalia");
		tree.add("Juan");
		tree.add("Miguel");
		tree.add("Marco");
		tree.add("Miguel");
		tree.add("Marco");
		System.out.println("La cantidad es de:  " + tree.size());
		Iterator itr = tree.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Se agrea elemento:  " + tree.add("Cesar"));
		System.out.println("Se agrea elemento:  " + tree.add("Marco"));
		System.out.println("Se agrea elemento:  " + tree.add("m	arco"));
		tree.remove("marco");
		tree.clear();

//		Hashtable
		Hashtable<Integer, String> hash = new Hashtable<Integer, String>();
		hash.put(1, "Jose");
		hash.put(2, "Manuel");
		hash.put(3, "Natalia");
		hash.put(4, "Juan");
		hash.put(5, "Miguel");
		hash.put(6, "Marco");
		Enumeration en = hash.keys();
		while (en.hasMoreElements()) {
			int clave = (int) en.nextElement();
			System.out.println(clave + " - " + hash.get(clave));
		}
		System.out.println("La existencia de la clave 3:  " + hash.containsKey(3));
		System.out.println("La existencia de la clave 7:  " + hash.containsKey(7));

		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Jose", 1);
		map.put("Manuel", 2);
		map.put("Natalia", 3);
		map.put("Juan", 4);
		map.put("Miguel", 5);
		map.put("Marco", 6);
		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String clave = (String) iter.next();
			System.out.println(clave + "  - " + map.get(clave));
		}
		*/
	}

}
