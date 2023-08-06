package es.cic.ejerc008.Controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic.ejerc008.DTO.FiguraCompletaDTO;
import es.cic.ejerc008.DTO.LienzoDTO;
import es.cic.ejerc008.Entity.Lienzo;
import es.cic.ejerc008.Service.LienzoService;

@RestController
@RequestMapping("/lienzo")
public class LienzoController {

	private static Logger logger = LogManager.getLogger();
	
	@Autowired
	LienzoService lienzoService;

	// create
	@PostMapping
	public Lienzo crearLienzo(@RequestBody LienzoDTO lienzo) {
		logger.info("-Creando lienzo...");
		return lienzoService.crearLienzo(lienzo);
	}

	// select
	@GetMapping("/{id}")
	public LienzoDTO getLienzo(@PathVariable(name="id") Long id) {
		logger.info(String.format("Buscando el lienzo con el id %d", id));
		return lienzoService.getLienzo(id);
	}

	@GetMapping()
	public List<LienzoDTO> getLienzos() {
		return lienzoService.getLienzos();
	}
	
	// update
	@PutMapping
	public void actualizarLienzo(@RequestBody LienzoDTO lienzo) {
		lienzoService.actualizarLienzo(lienzo);
		logger.info("El lienzo se ha actualizado.");
	}
	// delete
	@DeleteMapping("/{id}")
	public void eliminarLienzo(@PathVariable(name = "id") Long id) {
		lienzoService.eliminarLienzo(id);
		logger.info("El lienzo se ha eliminado.");
	}
	
	//FIGURAS
	
	 // Añadir una figura a un lienzo existente
    @PostMapping("/{lienzoId}/add-figura")
    public ResponseEntity<String> agregarFiguraALienzo(@PathVariable(name = "lienzoId") Long lienzoId,
                                                       @RequestBody FiguraCompletaDTO figuraDTO) {
        lienzoService.agregarFiguraALienzo(lienzoId, figuraDTO);
        return ResponseEntity.ok("Figura añadida al lienzo con éxito.");
    }

    // Actualizar una figura en un lienzo existente
    @PutMapping("/{lienzoId}/update-figura")
    public ResponseEntity<String> actualizarFiguraEnLienzo(@PathVariable(name = "lienzoId") Long lienzoId,
                                                           @RequestBody FiguraCompletaDTO figuraDTO) {
        lienzoService.actualizarFiguraEnLienzo(lienzoId, figuraDTO);
        return ResponseEntity.ok("Figura actualizada en el lienzo con éxito.");
    }

    // Eliminar una figura de un lienzo existente
    @DeleteMapping("/{lienzoId}/remove-figura/{figuraId}")
    public ResponseEntity<String> eliminarFiguraDeLienzo(@PathVariable(name = "lienzoId") Long lienzoId,
                                                         @PathVariable(name = "figuraId") Long figuraId) {
        lienzoService.eliminarFiguraDeLienzo(lienzoId, figuraId);
        return ResponseEntity.ok("Figura eliminada del lienzo con éxito.");
    }
}
