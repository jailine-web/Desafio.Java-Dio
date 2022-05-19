import java.util.List;

public abstract class Conta implements Iconta{

	protected static int AGENCIA_PADRAO;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	protected Cliente cliente;
	
		
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;
	}
	@Override
	public void depositar(double valor) {
		this.saldo += valor; 
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino ) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInfoComum() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	
	
}
