package desafio_dio_banco;

public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da conta poupança ===");
		System.out.println(String.format("Agencia: %d", super.agencia));
		System.out.println(String.format("Numero da Conta: %d", super.numeroConta));
		System.out.println(String.format("Saldo: R$ %.2f",super.saldo));
	}

}
