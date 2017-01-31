package base;

public class ValidaSenha {

	String Login;
	String Senha;

	public void ValidaSenha() {

		if (this.Senha.length() <= 8) {
			System.out.println("Senha possui menos que 8 caracteres!");
		}

		else if (this.Senha.equals("")) {
			System.out.println("Campo SENHA em branco, necessita de caracter!");
		}

		else if ((this.Login.substring(0, 3).equals(this.Senha.substring(0, 3)))) {
			System.out.println("Senha não pode começar com os 03 primeiros digitos do Login!");
		}

		else {
			System.out.println("Senha gravada com Sucesso!!");

		}
		
		public void ValidaLogin(){
			
			
			
			
		}

	}
}
