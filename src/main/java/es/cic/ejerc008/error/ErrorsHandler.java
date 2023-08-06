package es.cic.ejerc008.error;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorsHandler {
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> runtimeException(RuntimeException ex, HttpServletRequest request, HttpServletResponse response){
		return ResponseEntity
				.badRequest()
				.body(ex.getMessage());
	}
	
	@ExceptionHandler(FueraDeLienzoException.class)
	public ResponseEntity<String> fueraDeLienzoError(FueraDeLienzoException ex, HttpServletRequest request, HttpServletResponse response){
		return ResponseEntity
				.badRequest()
				.body("La figura debe estar dentro del lienzo");
	}
	
	@ExceptionHandler(ErrorAlActualizarException.class)
	public ResponseEntity<String> errorAlActualizar(ErrorAlActualizarException ex, HttpServletRequest request, HttpServletResponse response){
		return ResponseEntity
				.badRequest()
				.body("No se ha podido actualizar la figura");
	}

}
