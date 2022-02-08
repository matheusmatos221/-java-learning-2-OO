
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor){
		this.saldo += valor;
		System.out.println("Deposita: '" + valor + 
				"' na conta numero: '" + numero + "'");
	}
	/*
	public void saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor sacado: " + valor);			
		}else {
			System.out.println("Saldo da conta insuficiente para valor da operação");
		}
	}
	*/
	
	public boolean saca(double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
}
