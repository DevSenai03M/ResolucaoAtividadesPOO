package atvArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o "+(i+1)+"º número: ");
			numeros.add(scan.nextInt());
		}
		
		System.out.println(numeros.contains(10) || numeros.contains(100) || numeros.contains(1000) ? 
				"Parabéns! Você ganhou um bônus de R$50,00" : "Valores não encontrados!");
		
	}

}
