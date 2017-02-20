package com.classes.model;

public class Login {

	String login;
	String senha;

	public void Validacao() {
		
		if(this.login.equals("")){
			System.out.println("Login não pode ser em branco!");
		}
		
		else if(this.login.length() <= 8){
			System.out.println("Login não pode ter menos que 8 caracter!");
		}

		else if (this.senha.length() <= 8) {
			System.out.println("Senha possui menos que 8 caracteres!");
		}

		else if (this.senha.equals("")) {
			System.out.println("Campo SENHA em branco, necessita de caracter!");
		}

		else if ((this.login.substring(0, 3).equals(this.senha.substring(0, 3)))) {
			System.out.println("Senha ou Login não pode começar com os 03 primeiros digitos iguais!");
		}

		else {
			System.out.println("Senha gravada com Sucesso!!");

		}

	}


}
