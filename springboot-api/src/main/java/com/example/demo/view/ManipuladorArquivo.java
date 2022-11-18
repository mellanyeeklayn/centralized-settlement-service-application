package com.example.demo.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorArquivo {

	public static String leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		StringBuffer texto = new StringBuffer();
		linha = buffRead.readLine();
		while (linha != null) {
			texto.append(linha + "\n");
			linha = buffRead.readLine();
		}
		buffRead.close();
		return texto.toString();
	}

	public static void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Escreva algo: ");
			linha = in.nextLine();
		}
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

}
