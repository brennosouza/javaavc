package sistemacontacorrente;

public class testaConta4 {

	public static void main(String[] args) {
		Conta4 c1 = new Conta4("Railton", "1234");
		System.out.println("Nome do cliente: " + c1.cliente.nome);
		System.out.println("CPF do cliente: "+c1.cliente.cpf);
		int contador = Conta4.getContadorContas();
		System.out.println("Nosso banco possui " + contador + " contas");
		
		Conta4 c2 = new Conta4("Lucas", "5678");
		System.out.println("Nome do cliente: " + c1.cliente.nome);
		System.out.println("CPF do cliente: "+c1.cliente.cpf);
		//contador = c2.getContadorContas();
		contador = Conta4.getContadorContas();
		System.out.println("Nosso banco possui " + contador + " contas");

	}

}
