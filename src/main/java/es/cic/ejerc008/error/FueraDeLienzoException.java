package es.cic.ejerc008.error;

public class FueraDeLienzoException extends RuntimeException {

	public FueraDeLienzoException() {
		super();
	}
	
    public FueraDeLienzoException(String message) {
        super(message);
    }
	
    public FueraDeLienzoException(String message, Throwable cause) {
        super(message, cause);
    }

}
