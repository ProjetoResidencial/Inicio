package classes;

public class DespesasFixas {

	String Mes;
	double Energia;
	double Agua;
	double Telefone;
	double Condominio;
	double Aluguel;
	double Internet;

	public DespesasFixas(String mes) {
		this.Mes = Mes;
	}

	void RetornaMesReferencia(String Mes) {
		this.Mes = Mes;
	}

	void RetornaValorEnergia(double Energia) {
		this.Energia = Energia;
	}

	void RetornaValorAgua(double Agua) {
		this.Agua = Agua;
	}

	void RetornaValorTelefone(double Telefone) {
		this.Telefone = Telefone;
	}

	void RetornaValorCondominio(double Condominio) {
		this.Condominio = Condominio;
	}

	void RetornaValorAlguel(double Aluguel) {
		this.Aluguel = Aluguel;
	}

	void RetornaValorInternet(double Internet) {
		this.Internet = Internet;
	}

	void RetornaTotalFixas() {
		System.out.println("O Valor Total de Suas Despeas Fixas No Mês De " + this.Mes + " é: "
				+ (this.Energia + this.Agua + this.Telefone + this.Condominio + this.Aluguel + this.Internet));
	}

	void ImprimiDetalhado() {
		System.out.println("\nEm " + Mes + ", essas foram as suas despesas fixas: " + "\n\n>Total de Energia é: "
				+ Energia + "\n>Total de Agua é: " + Agua + "\n>Total de Telefone é: " + Telefone
				+ "\n>Total de Condominio é: " + Condominio + "\n>Total de Aluguel é: " + Aluguel
				+ "\n>Total de Internet é: " + Internet);
	}

}
