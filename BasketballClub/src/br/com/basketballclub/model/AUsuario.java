package br.com.basketballclub.model;

import java.util.UUID;

public abstract class AUsuario {
	private String nome;
	private String senha;
	private String id;
	private int idade;
	
	public AUsuario() {}
	
	public AUsuario(String nome, String senha, int idade) {
		this.nome = nome;
		this.senha = senha;
		this.idade = idade;
		this.id = UUID.randomUUID().toString();
	}
	
	public abstract void convidar();
	
	public abstract void aceitarConvite();
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade >= 10) {
			this.idade = idade;			
		}
	}
	
	public String getId() {
		return id;
	}
}
