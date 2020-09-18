package sistemacontacorrente;

public class Funcionario {
	String nome;
	String cpf;
	String departamento;
	String dataAdmissao;
	double salario;
	String status;
	
	void bonificar(double bonus) {
		this.salario += bonus;
	}

}
