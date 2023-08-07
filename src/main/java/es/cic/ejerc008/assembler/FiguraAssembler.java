package es.cic.ejerc008.assembler;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import es.cic.ejerc008.DTO.FiguraCompletaDTO;
import es.cic.ejerc008.DTO.FiguraDTO;
import es.cic.ejerc008.Entity.Figura;

@Component
public class FiguraAssembler {
	
	
	public FiguraDTO toDTO(Figura figura) {
        FiguraDTO figuraDTO = new FiguraDTO();
        figuraDTO.setId(figura.getId());
        figuraDTO.setPosicionX(figura.getPosicionX());
        figuraDTO.setPosicionY(figura.getPosicionY());
        figuraDTO.setColor(figura.getColor());       
        figuraDTO.setTipoFigura(figura.getTipoFigura());

        return figuraDTO;
    }

    public List<FiguraDTO> toDTOList(List<Figura> figuras) {
        return figuras.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public Figura toEntity(FiguraCompletaDTO figuraDTO) {
        Figura figura = new Figura(null, 0, 0, null);
        figura.setId(figuraDTO.getId());
        figura.setPosicionX(figuraDTO.getPosicionX());
        figura.setPosicionY(figuraDTO.getPosicionY());
        figura.setColor(figuraDTO.getColor());       
        figura.setTipoFigura(figuraDTO.getTipoFigura());
       
        return figura;
    }

 
}
