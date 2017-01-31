package base;

public class TestaValidacao {

	public static void main(String[] args) {

		ValidaSenha validador = new ValidaSenha();

		validador.Login = "Carlos";
		validador.Senha  = "Henrique9090" ;

		validador.ValidaSenha();

	}

}
