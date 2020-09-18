package sistemacontacorrente;

public class ControleSalarial {
	private double totalSalarios = 0;
	
	//Polimorfismo "na veia"!!!
	//aplicamos polimorfismo -> pode ter comportamentos diferentes
	//resolvido em tempo de execucao
	
	public void setTotalSalario(Funcionario2 funcionario) {
		this.totalSalarios += funcionario.getSalario();
	}
	
	public double getTotalSalario() {
		return this.totalSalarios;
	}

}
