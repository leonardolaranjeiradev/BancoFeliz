package exceptions;

public class BusinessException extends RuntimeException {	
	
	// Criada uma excecao personalizada para capturar excecoes especificas

	private static final long serialVersionUID = 1L;

	public BusinessException(String msg) {
		super(msg);
	}

}
