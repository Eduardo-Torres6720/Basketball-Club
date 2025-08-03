package br.com.basketballclub.model;

public class Usuario implements IUsuario {
	private String nome;
	private String senha;
	private int idade;	//Sei que não é assim que salva a senha do usuário, mas tamo sem tempo
	private boolean organizador;
	
	public Usuario() {}
	
	public Usuario(String nome, String senha, int idade, boolean organizador) {
		this.nome = nome;
		this.senha = senha;
		this.idade = idade;
		this.organizador = organizador;
	}
	
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
	
	public boolean getOrganizador() {
		return organizador;
	}
	public void setOrganizador(boolean organizador) {
		this.organizador = organizador;
	}
	
	public String getId() {
		return id;
	}
}
