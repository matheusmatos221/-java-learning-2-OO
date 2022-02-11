
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24227);
		
		Cliente paulo = new Cliente();
		paulo.setNome("paulo silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
	}
}
