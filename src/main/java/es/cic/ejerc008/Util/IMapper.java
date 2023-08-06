package es.cic.ejerc008.Util;

import java.util.List;

public interface IMapper <E,DTO>{

	DTO Entity2Dto(E entity);
	E Dto2Entity(DTO dto);
	List<DTO> ListEntity2Dto(List<E>entity);
	List<E> ListDto2Entity(List<DTO> dtos);
}
