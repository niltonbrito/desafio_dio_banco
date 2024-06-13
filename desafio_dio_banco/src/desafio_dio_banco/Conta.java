package desafio_dio_banco;

public abstract class Conta extends Banco implements IConta {

	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: "+this.cliente.getNomeCliente()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero da Conta: %d", this.numeroConta));
		System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
		System.out.println();
	}
}
