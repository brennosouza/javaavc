package sistemacontacorrente;

public class ControleSistemaInterno {
	String senha;
	
	void validaSenha(FuncionarioEspecial funcEsp) {
		funcEsp.verifica(senha);
	}

}
