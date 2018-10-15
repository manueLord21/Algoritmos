package com.algoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
// import java.io.*; para impotar todas los librerias de io

public class Archivos {
	public String leer(String ubicacion) {
		String texto = "";
		try {
			File archivo = new File(ubicacion);
			FileReader reader = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(reader);
			String temp;
			
			while((temp = buffer.readLine()) != null) {
				 texto += temp + "\n";
			}
				
		}catch(IOException a) {
			a.printStackTrace();
		}
		return texto;
	}
	
	public void escribir(String ubicacion, String contenido) {
		try {
			FileWriter archivo = new FileWriter(ubicacion);
			PrintWriter writer = new PrintWriter(archivo);
			writer.println(contenido);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String modificar(String texto) {
		char[] temp = texto.toCharArray();
		for (int i = 0; i < temp.length; i++) {
			char letra = temp[i];
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				temp[i] = '-';
			}
		}
		texto = String.valueOf(temp);
		return texto;
	}
}