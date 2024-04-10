package atividade02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Produto prod01 = new Produto();
		Produto prod02 = new Produto();
		
		System.out.println("**** Produto 01 ****");
		
		System.out.print("Preço de Custo: ");
		prod01.setPrecoCusto(scan.nextDouble());
		
		System.out.print("Preço de Venda: ");
		prod01.setPrecoVenda(scan.nextDouble());
		
		System.out.println();
		System.out.println();
		
		System.out.println("**** Produto 02 ****");
		
		System.out.print("Preço de Custo: ");
		prod02.setPrecoCusto(scan.nextDouble());
		
		System.out.print("Preço de Venda: ");
		prod02.setPrecoVenda(scan.nextDouble());
		
		prod01.calcularMargemLucro();
		prod02.calcularMargemLucro();
		
		System.out.printf("**** Produto 01 ****\n"
				+ "Margem de Lucro: R$ %.2f\n"
				+ "%% Margem de Lucro: %d %%\n", 
				prod01.getMargemLucro(), 
				prod01.getMargemLucroPorcentagem());
		
		System.out.printf("**** Produto 02 ****\n"
				+ "Margem de Lucro: R$ %.2f\n"
				+ "%% Margem de Lucro: %d %%\n", 
				prod02.getMargemLucro(), 
				prod02.getMargemLucroPorcentagem());
		
	}
}
