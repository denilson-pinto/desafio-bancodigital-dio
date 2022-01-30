
public interface IConta {
	
	void depositar(Double valor);
	void sacar(Double valor);
	void transferir(Conta contaDestino, Double valor);
	void imprimirExtrato();

}
