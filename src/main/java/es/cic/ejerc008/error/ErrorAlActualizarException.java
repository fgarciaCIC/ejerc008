package es.cic.ejerc008.error;

public class ErrorAlActualizarException extends RuntimeException {
	
	public ErrorAlActualizarException() {
		super();
	}
	
    public ErrorAlActualizarException(String message) {
        super(message);
    }
	
    public ErrorAlActualizarException(String message, Throwable cause) {
        super(message, cause);
    }

}
