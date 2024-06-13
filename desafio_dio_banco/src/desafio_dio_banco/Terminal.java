package desafio_dio_banco;

public class Terminal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNomeCliente("Nilton Brito");
		IConta cc = new ContaCorrente(cliente);
		IConta cp = new ContaPoupanca(cliente);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.depositar(100);
		cc.imprimirExtrato();
		
		cc.transferir(50, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		
	}
}
