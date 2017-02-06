package base;

import org.omg.Messaging.SyncScopeHelper;

public class DespesasVariaveis {

	String Mes;
	double Manutencao;
	double Alimentacao;

	public DespesasVariaveis(String Mes) {
		this.Mes = Mes;
	}

	void RetornaToralVariaveis() {
		System.out.println(
				"\nO Total de Despesas Variaveis No Mês de " + this.Mes + " é: " + (this.Manutencao + this.Alimentacao));

	}

	void ImprimiDetalhado() {
		System.out.println("\nEm " + Mes + ", essas foram as suas despesas Variaveis:" + "\n\n>Total em Manutenção: "
				+ Manutencao + "\n>Total em Alimentação: " + Alimentacao);
	}

}
