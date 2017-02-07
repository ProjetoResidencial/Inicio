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

			System.out.println("A Residencia é Própria!");

		} else {
			System.out.println("A Residencia é Alugada!");

		}
		return false;
	}
}