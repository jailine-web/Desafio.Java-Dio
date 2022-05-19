
public class Principal {

	public static void main(String[] args) {
		
		Cliente Sarah =  new Cliente();
		Sarah.setNome("Sarah");
		
		Cliente Julia =  new Cliente();
		Sarah.setNome("Julia");

		Conta conta1 = new ContaCorrente(Sarah);
		Conta conta2 = new ContaCorrente(Julia);
		conta1.depositar(200);
		Conta cp = new ContaPoupanca(Sarah);
		
		conta1.transferir(150, cp);
		conta1.imprimirExtrato();
		System.out.println("");
		conta2.imprimirExtrato();
	}
}
