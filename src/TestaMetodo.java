
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(150);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(500);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
	}
}
