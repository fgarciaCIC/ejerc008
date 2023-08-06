package es.cic.ejerc008.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.ejerc008.DTO.DetalleFiguraDTO;
import es.cic.ejerc008.DTO.FiguraCompletaDTO;
import es.cic.ejerc008.DTO.FiguraDTO;
import es.cic.ejerc008.DTO.LienzoDTO;
import es.cic.ejerc008.Entity.DetalleFigura;
import es.cic.ejerc008.Entity.Figura;
import es.cic.ejerc008.Entity.Lienzo;
import es.cic.ejerc008.Repository.FiguraRepository;
import es.cic.ejerc008.Repository.LienzoRepository;

@Service
@Transactional
public class LienzoService{

	@Autowired
	FiguraRepository figuraRepo;
	@Autowired
    LienzoRepository lienzoRepository;
	

	 public void agregarFiguraALienzo(Long lienzoId, FiguraCompletaDTO figuraDTO) {
	       Optional<Lienzo> lienzo = lienzoRepository.findById(lienzoId);
	               // .orElseThrow(() -> new EntityNotFoundException("Lienzo no encontrado con ID: " + lienzoId));

	        Figura figura = convertirDTOaFigura(figuraDTO);
	  //      figura.setLienzo(lienzo);

	//        lienzo.getFiguras().add(figura);

	        lienzoRepository.save(lienzo);
	    }

	 public void actualizarFiguraEnLienzo(Long lienzoId, FiguraCompletaDTO figuraDTO) {
		 Optional<Lienzo> lienzo = lienzoRepository.findById(lienzoId);
	//                orElseThrow(() -> new EntityNotFoundException("Lienzo no encontrado con ID: " + lienzoId));

	        Figura figuraExistente = lienzo.getFiguras().stream()
	                .filter(f -> f.getId().equals(figuraDTO.getId()))
	                .findFirst()
	                .orElseThrow(() -> new EntityNotFoundException("Figura no encontrada en el lienzo con ID: " + figuraDTO.getId()));

	        Figura figuraActualizada = convertirDTOaFigura(figuraDTO);
	        figuraActualizada.setLienzo(lienzo);

	        lienzo.getFiguras().remove(figuraExistente);
	        lienzo.getFiguras().add(figuraActualizada);

	        lienzoRepository.save(lienzo);
	    }

	  public void eliminarFiguraDeLienzo(Long lienzoId, Long figuraId) {
		  Optional<Lienzo> lienzo = lienzoRepository.findById(lienzoId);
	 //               .orElseThrow(() -> new EntityNotFoundException("Lienzo no encontrado con ID: " + lienzoId));

	        Figura figuraExistente = lienzo.getFiguras().stream()
	                .filter(f -> f.getId().equals(figuraId))
	                .findFirst()
	                .orElseThrow(() -> new EntityNotFoundException("Figura no encontrada en el lienzo con ID: " + figuraId));

	        lienzo.getFiguras().remove(figuraExistente);

	        lienzoRepository.save(lienzo);
	    }

	    private Figura convertirDTOaFigura(FiguraCompletaDTO figuraDTO) {
	        // realizar la conversión de FiguraCompletaDTO a Figura
	    	Figura figura = new Figura(null, 0, 0, null);

	        figura.setId(figuraDTO.getId());
	        figura.setTipoFigura(figuraDTO.getTipoFigura());
	        figura.setPosicionX(figuraDTO.getPosicionX());
	        figura.setPosicionY(figuraDTO.getPosicionY());
	        figura.setColor(figuraDTO.getColor());

	        if (figuraDTO.getDetalles() != null) {
	            List<DetalleFigura> detalles = new ArrayList<>();
	            for (DetalleFiguraDTO detalleDTO : figuraDTO.getDetalles()) {
	                DetalleFigura detalle = new DetalleFigura();
	                detalle.setId(detalleDTO.getId());
	                detalle.setTipoParametroId(detalleDTO.getTipoParametroId());
	                detalle.setValor(detalleDTO.getValor());
	                detalles.add(detalle);
	            }
	            figura.setDetalles(detalles);
	        }

	        return figura;
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

	
	public void actualizarLienzo(LienzoDTO lienzo) {
		// TODO Auto-generated method stub
		
	}

	 public Lienzo crearLienzo(LienzoDTO lienzoDTO) {
        Lienzo lienzo = new Lienzo();
        
        return lienzoRepository.save(lienzo);
    }

}
