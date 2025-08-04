package br.com.basketballclub.model;

public class Organizador extends AUsuario {
	
	public Organizador() {}

	public Organizador(String nome, String senha, int idade) {
		super(nome, senha, idade);
	}
	
	public void criarPartida() {}

	@Override
	public void convidar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aceitarConvite() {
		// TODO Auto-generated method stub
		
	}
}
