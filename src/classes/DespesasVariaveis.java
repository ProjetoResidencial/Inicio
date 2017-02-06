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
				"\nO Total de Despesas Variaveis No M�s de " + this.Mes + " �: " + (this.Manutencao + this.Alimentacao));

	}

	void ImprimiDetalhado() {
		System.out.println("\nEm " + Mes + ", essas foram as suas despesas Variaveis:" + "\n\n>Total em Manuten��o: "
				+ Manutencao + "\n>Total em Alimenta��o: " + Alimentacao);
	}

}
