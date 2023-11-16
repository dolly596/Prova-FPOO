package Desafio3;

public class UsuarioPrincipal {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario();
		Usuario user2 = new Usuario (1, "Otavio", 020507, "Admin", "dolly19");

		System.out.println(user2.getId());
		System.out.println(user2.getNome());
		System.out.println(user2.getPassword());
		System.out.println(user2.getPermissao());
		System.out.println(user2.getUsuario());
	}

}
