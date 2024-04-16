package atividade05;

import java.util.ArrayList;

public class Agenda {
	
	private String nome;
	private ArrayList<Contato> contatos;
		
	public Agenda() {
		super();
	}

	public Agenda(String nome, ArrayList<Contato> contatos) {
		super();
		this.nome = nome;
		this.contatos = contatos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	
	@Override
	public String toString() {
		String text = "****** LISTA DE CONTATOS - "+ this.nome +" ******\n";
		
		for(Contato contato : contatos) {
			text += contato.toString();
		}
		
		return text;
	}
	
}
