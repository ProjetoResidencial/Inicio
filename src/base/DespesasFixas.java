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
		System.out.println("Em " + Mes + ", essas foram as suas despesas fixas: " + "\n\n>Total de Energia �: "
				+ Energia + "\n>Total de Agua �: " + Agua + "\n>Total de Telefone �: " + Telefone
				+ "\n>Total de Condominio �: " + Condominio + "\n>Total de Aluguel �: " + Aluguel
				+ "\n>Total de Internet �: " + Internet);
	}

}
