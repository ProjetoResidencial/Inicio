package com.classes.model;

public class CadastroResidencia {

	String Cidade;
	String Endereco;
	int Numero;
	String Cep;
	String TipoDeResidencia;
	boolean ResProprio;
	String NomePredio;
	String NomeCondominio;

	public boolean AlugadoOuProprio() {

		if (this.ResProprio == true) {

			System.out.println("A Residencia � Pr�pria!");

		} else {
			System.out.println("A Residencia � Alugada!");

		}
		return false;
	}
}