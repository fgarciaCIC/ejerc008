package es.cic.ejerc008.assembler;

import org.springframework.beans.factory.annotation.Autowired;

import es.cic.ejerc008.DTO.LienzoDTO;
import es.cic.ejerc008.Entity.Lienzo;

public class LienzoAssembler {
	   @Autowired
	    private FiguraAssembler figuraAssembler;

	    public LienzoDTO toDTO(Lienzo lienzo) {
	        LienzoDTO lienzoDTO = new LienzoDTO();
	        lienzoDTO.setId(lienzo.getId());	      
	    //    lienzoDTO.setFiguras(figuraAssembler.toDTOList(lienzo.getFiguras()));
	       
	        return lienzoDTO;
	    }

	    public Lienzo toEntity(LienzoDTO lienzoDTO) {
	        Lienzo lienzo = new Lienzo();
	        lienzo.setId(lienzoDTO.getId());
	   //     lienzo.setMaxX(lienzoDTO.getMaxX());
	    //    lienzo.setMaxY(lienzoDTO.getMaxY());
	   //     lienzo.setFiguras(figuraAssembler.toEntityList(lienzoDTO.getFiguras()));
	      
	        return lienzo;
	    }
	
}
