package es.cic.ejerc008.assembler;

import java.util.List;
import java.util.stream.Collectors;

import es.cic.ejerc008.DTO.FiguraDTO;
import es.cic.ejerc008.Entity.Figura;

public class FiguraAssembler {
	public FiguraDTO toDTO(Figura figura) {
        FiguraDTO figuraDTO = new FiguraDTO();
        figuraDTO.setId(figura.getId());
        figuraDTO.setPosicionX(figura.getPosicionX());
        figuraDTO.setPosicionY(figura.getPosicionY());
        figuraDTO.setColor(figura.getColor());       
        figuraDTO.setTipoFigura(figura.getTipoFigura());
        // ... otros mapeos ...
        return figuraDTO;
    }

    public List<FiguraDTO> toDTOList(List<Figura> figuras) {
        return figuras.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public Figura toEntity(FiguraDTO figuraDTO) {
        Figura figura = new Figura(null, 0, 0, null);
        figura.setId(figuraDTO.getId());
        figura.setPosicionX(figuraDTO.getPosicionX());
        figura.setPosicionY(figuraDTO.getPosicionY());
        figura.setColor(figuraDTO.getColor());       
        figura.setTipoFigura(figuraDTO.getTipoFigura(null));
       
        return figura;
    }

    public List<Figura> toEntityList(List<FiguraDTO> figuraDTOs) {
        return figuraDTOs.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
