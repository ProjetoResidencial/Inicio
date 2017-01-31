package base;


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

	void imprimirDespFix() {
		System.out.println("Em " + Mes + ", essas foram as suas despesas fixas: " + "\n\n>Total de Energia é: "
				+ Energia + "\n>Total de Agua é: " + Agua + "\n>Total de Telefone é: " + Telefone
				+ "\n>Total de Condominio é: " + Condominio + "\n>Total de Aluguel é: " + Aluguel
				+ "\n>Total de Internet é: " + Internet);
	}

}
