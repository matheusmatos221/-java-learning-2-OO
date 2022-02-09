
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(150);
		System.out.println("Saldo Paulo: "+ contaDoPaulo.saldo);
		
		contaDoPaulo.saca(20);
		System.out.println("Saldo Paulo: "+ contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = 
				contaDaMarcela.transfere(3000, contaDoPaulo); 
		
		if(sucessoTransferencia) {
			System.out.println("Transferencia feita com sucesso!!");
		} else {
			System.out.println("Faltou dinheiro!");
		}
		System.out.println("Saldo Marcela: " + contaDaMarcela.saldo);
		System.out.println("Saldo Paulo: "+ contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
		
	}
}
