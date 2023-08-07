package es.cic.ejerc008.Service;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.ejerc008.DTO.DetalleFiguraDTO;
import es.cic.ejerc008.DTO.FiguraCompletaDTO;
import es.cic.ejerc008.DTO.FiguraDTO;
import es.cic.ejerc008.DTO.LienzoDTO;
import es.cic.ejerc008.DTO.TipoParametroDTO;
import es.cic.ejerc008.Entity.DetalleFigura;
import es.cic.ejerc008.Entity.Figura;
import es.cic.ejerc008.Entity.Lienzo;
import es.cic.ejerc008.Entity.TipoParametro;
import es.cic.ejerc008.Repository.FiguraRepository;
import es.cic.ejerc008.Repository.LienzoRepository;
import es.cic.ejerc008.assembler.FiguraAssembler;

@Service
@Transactional
public class LienzoService{

	@Autowired
	    private FiguraRepository figuraRepository;

	@Autowired
    LienzoRepository lienzoRepository;
	
	 @Autowired
	 private FiguraAssembler figuraAssembler;
	

	 public void agregarFiguraALienzo(Long lienzoId, FiguraCompletaDTO figuraDTO) {
		    Lienzo lienzo = lienzoRepository.findById(lienzoId)
		            .orElseThrow(() -> new EntityNotFoundException("Lienzo no encontrado con ID: " + lienzoId));

	        Figura figura = convertirDTOaFigura(figuraDTO);
	        figura.setLienzo(lienzo);

	        lienzo.getFiguras().add(figura);

	        lienzoRepository.save(lienzo);
	    }

	 public void actualizarFiguraEnLienzo(Long lienzoId, FiguraCompletaDTO figuraDTO) {
		    Lienzo lienzo = lienzoRepository.findById(lienzoId)
		            .orElseThrow(() -> new EntityNotFoundException("Lienzo no encontrado con ID: " + lienzoId));

		    Figura figuraExistente = lienzo.getFiguras().stream()
		            .filter(f -> f.getId().equals(figuraDTO.getId()))
		            .findFirst()
		            .orElseThrow(() -> new EntityNotFoundException("Figura no encontrada en el lienzo con ID: " + figuraDTO.getId()));

		    Figura figuraActualizada = convertirDTOaFigura(figuraDTO);
		    figuraActualizada.setLienzo(lienzo); // Establece la relación con el lienzo

		    lienzo.getFiguras().remove(figuraExistente);
		    lienzo.getFiguras().add(figuraActualizada);

		    lienzoRepository.save(lienzo);
		}
	 
	  public void eliminarFiguraDeLienzo(Long lienzoId, Long figuraId) {
		    Lienzo lienzo = lienzoRepository.findById(lienzoId)
		            .orElseThrow(() -> new EntityNotFoundException("Lienzo no encontrado con ID: " + lienzoId));

	        Figura figuraExistente = lienzo.getFiguras().stream()
	                .filter(f -> f.getId().equals(figuraId))
	                .findFirst()
	                .orElseThrow(() -> new EntityNotFoundException("Figura no encontrada en el lienzo con ID: " + figuraId));

	        lienzo.getFiguras().remove(figuraExistente);

	        lienzoRepository.save(lienzo);
	    }

		    
	    private List<Figura> convertirDTOSaFiguras(List<Long> listaIds) {
	        List<Figura> figuras = new ArrayList<>();
	        for (Long figuraId : listaIds) {
	            Figura figura = figuraRepository.findById(figuraId)
	                    .orElseThrow(() -> new EntityNotFoundException("Figura no encontrada con ID: " + figuraId));
	            figuras.add(figura);
	        }
	        return figuras;
	    }

	 


	public void cambiarColor(FiguraDTO figura, String color) {
		// TODO Auto-generated method stub
		
	}

	public LienzoDTO getLienzo(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<LienzoDTO> getLienzos() {
		// TODO Auto-generated method stub
		return null;
	}

	public FiguraDTO getFigura(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FiguraDTO> getFiguras() {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminarLienzo(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	 public void actualizarLienzo(LienzoDTO lienzoDTO) {
	        // Obtener el lienzo de la base de datos por su ID
	        Long lienzoId = lienzoDTO.getId();
	        Lienzo lienzo = lienzoRepository.findById(lienzoId)
	                .orElseThrow(() -> new EntityNotFoundException("Lienzo no encontrado con ID: " + lienzoId));

	        // Actualizar las propiedades del lienzo con los valores del DTO
	        // Por ejemplo:
	 //       lienzo.setMaxX(lienzoDTO.getMaxX());
	 //       lienzo.setMaxY(lienzoDTO.getMaxY());

	        // Actualizar las figuras del lienzo si es necesario
	        // Por ejemplo:
	        List<Figura> figuras = convertirDTOSaFiguras(lienzoDTO.getFiguras());
	        lienzo.setFiguras(figuras);

	        // Guardar los cambios en la base de datos
	        lienzoRepository.save(lienzo);
	    }
	 

	 public Lienzo crearLienzo(LienzoDTO lienzoDTO) {
        Lienzo lienzo = new Lienzo();
        
        return lienzoRepository.save(lienzo);
    }

	public FiguraAssembler getFiguraAssembler() {
		return figuraAssembler;
	}

	public void setFiguraAssembler(FiguraAssembler figuraAssembler) {
		this.figuraAssembler = figuraAssembler;
	}

}
