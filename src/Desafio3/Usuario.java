package Desafio3;

public class Usuario {
	private int id;
	private String nome;
	private int password;
	private String permissao;
	private String usuario;
	
	public Usuario() {
		
	}
	public Usuario(int id, String nome, int password, String permissao, String usuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.password = password;
		this.permissao = permissao;
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public int getPassword() {
		return password;
	}
	public String getPermissao() {
		return permissao;
	}
	public String getUsuario() {
		return usuario;
	}

}
