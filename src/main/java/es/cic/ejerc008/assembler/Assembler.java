package es.cic.ejerc008.assembler;

import java.util.List;

public interface Assembler<E,DTO> {
	
	DTO entity2Dto(E entity);
	
	E dto2Entity(DTO dto);
	
	List<DTO> entity2Dto(List<E> entities);
	
	List<E> dto2Entity(List<DTO> dtos);

}
