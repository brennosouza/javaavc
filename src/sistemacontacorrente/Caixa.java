package sistemacontacorrente;

public class Caixa extends FuncionarioEspecial{
	int senha;
	
	double getBonus() {
		return 0;
	}
	
	boolean verifica(String senha) {
		return false;
	}
	
}
