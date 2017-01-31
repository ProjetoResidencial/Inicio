package base;


public class TestaFimDeMes {

	public static void main(String[] args) {

		DespesasFixas despesasFixas = new DespesasFixas("Janeiro");

		despesasFixas.Agua = 32.12;
		despesasFixas.Aluguel = 345.33;
		despesasFixas.Condominio = 199.00;
		despesasFixas.Energia = 129.00;
		despesasFixas.Mes = "Janeiro";
		despesasFixas.Telefone = 89.44;
		despesasFixas.Internet = 29.99;

		despesasFixas.imprimirDespFix();

		DespesasVariaveis despesasVariaveis = new DespesasVariaveis("Janeiro");

		despesasVariaveis.Alimentacao = 180.00;
		despesasVariaveis.Manutencao = 40.00;
		despesasVariaveis.Mes = "Janeiro";
		
		despesasVariaveis.imprimirDespVar();
		

	}

}
