package sistemacontacorrente;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	boolean sacar(double valor) {
		//double saldoAlterado = saldo - valor;
		//saldo = saldoAlterado;
		//this.saldo -= valor;
		if (valor <= this.saldo + this.limite) {
			this.saldo -= valor;
			return true;
			
		} else {
			return false;

		}
	}

	void depositar(double valor) {
		this.saldo += valor;
	}
}
