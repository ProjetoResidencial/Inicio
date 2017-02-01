package base;

public class TestaDespesasFixas {

	public static void main(String[] args) {
		
		DespesasFixas test = new DespesasFixas("Janeiro");
		
		test.Agua = 23.5;
		test.Aluguel = 343.3;
		test.Condominio = 244.22;
		test.Energia = 345.33;
		test.Internet = 234.4;
		
		
		test.RetornaTotalFixas();
		
	}

}
