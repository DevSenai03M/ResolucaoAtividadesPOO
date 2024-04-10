package atividade01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Livro[] livros = new Livro[3];
		
		for(int i = 0; i < livros.length; i++) {
			livros[i] = new Livro();
			
			System.out.print("Titulo do Livro: ");
			livros[i].setTitulo(scan.nextLine());
			
			System.out.print("Autor do Livro: ");
			livros[i].setAutor(scan.nextLine());
			
			System.out.print("Editora do Livro: ");
			livros[i].setEditora(scan.nextLine());
			
			System.out.print("Ano de Publicação: ");
			livros[i].setAnoPublicacao(Integer.parseInt(scan.nextLine()));
			
			System.out.print("Quantidade Estoque: ");
			livros[i].setQuantidadeEstoque(Integer.parseInt(scan.nextLine()));
			
		}
		
		for(int i = 0; i < livros.length; i++) {
			System.out.printf("%s \n%s \n%s \n%d \n %d \n",
					livros[i].getTitulo(), livros[i].getAutor(),
					livros[i].getEditora(), livros[i].getAnoPublicacao(),
					livros[i].getQuantidadeEstoque());
		}		
		
		
		
	}

}
