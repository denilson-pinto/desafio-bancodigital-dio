
public class AppBanco {

	public static void main(String[] args) {
		
		Cliente novoCliente1 = new Cliente();
		novoCliente1.setNome("Denilson");
		Conta cc1 = new ContaCorrente(novoCliente1);
		Conta cp1 = new ContaPoupanca(novoCliente1);
		
		Cliente novoCliente2 = new Cliente();
		novoCliente2.setNome("Leylah");
		Conta cc2 = new ContaCorrente(novoCliente2);
		Conta cp2 = new ContaPoupanca(novoCliente2);
		
		Cliente novoCliente3 = new Cliente();
		novoCliente3.setNome("Emma");
		Conta cc3 = new ContaCorrente(novoCliente3);
		Conta cp3 = new ContaPoupanca(novoCliente3);
		
		//Depósito nas contas correntes
		cc1.depositar(10000.0);	
		cc2.depositar(15000.0);
		cc3.depositar(13000.0);
		
		//Imprimir extratos
		cc1.imprimirExtrato();
		cc2.imprimirExtrato();
		cc3.imprimirExtrato();

		//Transferência para poupança
		cc2.transferir(cp2, 2000.0);
		
		//Tranferência entre contas correntes
		cc3.transferir(cc1, 1500.0);
		
		//Saque de conta corrente
		cc2.sacar(500.00);
		
		cc1.imprimirInfosConta();
		cc2.imprimirInfosConta();
		cp2.imprimirExtrato();
		cc3.imprimirInfosConta();
	}

}
