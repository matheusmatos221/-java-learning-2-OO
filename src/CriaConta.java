
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
	}
}
