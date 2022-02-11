
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		conta.setAgencia(-55);
		conta.setNumero(-105);
		
		Conta conta2 = new Conta(1337, 24227);
		Conta conta3 = new Conta(1337, 24228);
		
		System.out.println(Conta.getTotal());
	}
}
