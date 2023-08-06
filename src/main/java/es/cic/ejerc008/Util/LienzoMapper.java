package es.cic.ejerc008.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import es.cic.ejerc008.DTO.LienzoDTO;
import es.cic.ejerc008.Entity.Lienzo;
import es.cic.ejerc008.Repository.FiguraRepository;

public class LienzoMapper implements IMapper<Lienzo, LienzoDTO>{
	
	@Autowired
	FiguraRepository figuraRepo;

	@Override
	public LienzoDTO Entity2Dto(Lienzo entity) {
		LienzoDTO dto = new LienzoDTO();
		dto.setId(entity.getId());
		dto.setFiguras(entity.getFiguras().stream().map(x -> x.getId()).collect(Collectors.toList()));
		return dto;
	}

	@Override
	public Lienzo Dto2Entity(LienzoDTO dto) {
		Lienzo lienzo = new Lienzo();
		lienzo.setId(dto.getId());
		lienzo.setFiguras(
				dto.getFiguras()
				.stream()
				.map(x -> figuraRepo.findById(x).get())
				.collect(Collectors.toList()));
		return lienzo;
		
	}

	@Override
	public List<LienzoDTO> ListEntity2Dto(List<Lienzo> entity) {
		List<LienzoDTO> lienzosdto = new ArrayList<LienzoDTO>();
		for(Lienzo l : entity) {
			LienzoDTO dto = Entity2Dto(l);
			lienzosdto.add(dto);
		}
		return lienzosdto;
	}
 
	@Override
	public List<Lienzo> ListDto2Entity(List<LienzoDTO> dtos) {
		List<Lienzo> lienzos = new ArrayList<Lienzo>();
		for(LienzoDTO l : dtos) {
			Lienzo lienzo = Dto2Entity(l);
			lienzos.add(lienzo);
		}
		return lienzos;
	}

}
