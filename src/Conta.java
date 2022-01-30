
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
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
		
	protected void imprimirInfosConta() {
		System.out.println(String.format("TITULAR: %s", this.cliente.getNome()));
		System.out.println(String.format("AGENCIA: %d", this.agencia));
		System.out.println(String.format("CONTA: %d", this.numero));
		System.out.println(String.format("SALDO: %.2f", this.saldo));
	}
	
	@Override
	public void depositar(Double valor) {
		this.saldo += valor;
		System.out.println("Depósito concluído.");
		System.out.println(String.format("SALDO ATUAL: %.2f\n", this.saldo));
	}
	
	@Override
	public void sacar(Double valor) {
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque concluído!\n");
		}
		else {
			System.out.println("Saldo insuficiente!\n");
		}
	}
	
	@Override
	public void transferir(Conta contaDestino, Double valor) {

		if (this.saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			System.out.println("Transferência realizada com sucesso.\n");
		}
		else {
			System.out.println("Saldo insuficiente!\n");
		}
	}	

}
