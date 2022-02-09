
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(150);
		System.out.println("Saldo Paulo: "+ contaDoPaulo.saldo);
		
		contaDoPaulo.saca(50);
		System.out.println("Saldo Paulo: "+ contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		contaDaMarcela.transfere(300, contaDoPaulo);
		System.out.println("Saldo Marcela: " + contaDaMarcela.saldo);
		System.out.println("Saldo Paulo: "+ contaDoPaulo.saldo);
		
		
	}
}
