
public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor){
		this.saldo += valor;
		System.out.println("Deposita: " + valor);
	}
	
	public boolean saca(double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		}else {
			System.out.println("Saldo insuficiênte para sacar");
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo>=valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
}
