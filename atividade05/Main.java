package atividade05;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Agenda> db_agenda = new ArrayList<>();
		
		
		int option;
		
		do {
			
			System.out.print("Bem-Vindo! Sistema de Agenda Online.\n\n"
					+ "1- Cadastrar Agenda\n"
					+ "2- Visualizar Agenda\n"
					+ "3- Sair\n\n"
					+ "-> ");
			option = Integer.parseInt(scan.nextLine());
			
			switch (option) {
			case 1: 
				ArrayList<Contato> db_contato = new ArrayList<>();
				Agenda agenda = new Agenda();
				
				
				System.out.print("Nome da Agenda: ");
				agenda.setNome(scan.nextLine());
				
				for(int i = 0; i < 3; i++) {
					Contato contato = new Contato();
					
					System.out.print("Nome: ");
					contato.setNome(scan.nextLine());
					
					System.out.print("Telefone: ");
					contato.setTelefone(scan.nextLine());
					
					System.out.print("E-mail: ");
					contato.setEmail(scan.nextLine());
					
					db_contato.add(contato);
					
				}
				agenda.setContatos(db_contato);
				
				db_agenda.add(agenda);
			break;
			case 2:
				System.out.println("****** AGENDAS CADASTRADAS ******\n");
				for(int i = 0; i< db_agenda.size(); i++) {
					System.out.printf("(%d) : %s\n", i+1, db_agenda.get(i).getNome());
				}
				
				try {
					System.out.print("Selecione uma opção: ");
					int opt_agenda = Integer.parseInt(scan.nextLine());
					
					System.out.println(db_agenda.get(opt_agenda-1).toString());
				}catch(IndexOutOfBoundsException e) {
					System.out.println("Opção selecionada indisponível!");	
				}
			break;
			case 3:
				System.out.println("Bye :)");
			break;
			default:
				System.out.println("Opção Inválida!\n\n");
				
			}
			
		}while(option != 3);

	}

}
