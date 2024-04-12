package atvArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayListString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> lista1 = new ArrayList<>();
		ArrayList<String> lista2 = new ArrayList<>();
		 
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite uma palavra: ");
			lista1.add(scan.next());
		}
		
		for(String texto : lista1) {
			if(texto.length() < 3)
				lista2.add(texto);
		}
		
		lista1.removeAll(lista2);
		
		System.out.println(lista1.size());
		for(String texto : lista1) {
			System.out.println(texto);
		}
		
		System.out.println(lista2.size());
		for(String texto : lista2) {
			System.out.println(texto);
		}
	}

}
