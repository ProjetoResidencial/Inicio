package base;


public class DespesasVariaveis {

	String Mes;
	double Manutencao;
	double Alimentacao;

	public DespesasVariaveis(String Mes) {
		this.Mes = Mes;
	}

	void imprimirDespVar() {
		System.out.println("\nEm " + Mes + ", essas foram as suas despesas Variaveis:" + "\n\n>Total em Manutenção: "
				+ Manutencao + "\n>Total em Alimentação: " + Alimentacao);
	}

}
