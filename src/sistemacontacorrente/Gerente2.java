package sistemacontacorrente;

public class Gerente2 extends Funcionario2{
	int senha;
	
//	double getBonus() { //15% do salario para o gerente
//		return this.salario * 0.15;
//	}
	
	double getBonus() { //base do salario para o func comum + 5000
		return super.getBonus() + 5000;
	}// aplicamos polimorfismo -> pode ter comportamentos diferentes


	
	public boolean verifica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso autorizado!");
			return true;
		} else {
			System.out.println("Acesso não autorizado!");
			return false;
		}
	}
}
