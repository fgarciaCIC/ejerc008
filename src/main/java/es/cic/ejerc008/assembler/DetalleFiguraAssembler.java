package es.cic.ejerc008.assembler;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import es.cic.ejerc008.DTO.DetalleFiguraDTO;
import es.cic.ejerc008.DTO.TipoParametroDTO;
import es.cic.ejerc008.Entity.DetalleFigura;
import es.cic.ejerc008.Entity.Lienzo;
import es.cic.ejerc008.Entity.TipoParametro;
import es.cic.ejerc008.Repository.TipoParametroRepository;

public class DetalleFiguraAssembler {
	
	 @Autowired
	    private TipoParametroRepository tipoParametroRepository;

	    public DetalleFigura toEntity(DetalleFiguraDTO detalleDTO) {
	        DetalleFigura detalle = new DetalleFigura();
	        detalle.setId(detalleDTO.getId());

	        if (detalleDTO.getTipoParametroId() != null) {
	        	Optional<TipoParametro> tipoParametroOptional = tipoParametroRepository.findById(detalleDTO.getTipoParametroId());
	            
	            if (tipoParametroOptional.isPresent()) {
	                TipoParametro tipoParametro = tipoParametroOptional.get();
	                detalle.setTipoParametro(tipoParametro);
	            } else {
	                // Manejar el caso en que no se encuentra el TipoParametro
	            }
	            
	        }
	        detalle.setValor(detalleDTO.getValor());

	        return detalle;
	   }	
	    
	  
}	
	    

