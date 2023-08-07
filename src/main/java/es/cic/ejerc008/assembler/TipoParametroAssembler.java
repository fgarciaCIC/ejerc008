package es.cic.ejerc008.assembler;

import es.cic.ejerc008.DTO.TipoParametroDTO;
import es.cic.ejerc008.Entity.TipoParametro;

public class TipoParametroAssembler {
	
	   public TipoParametroDTO toDto(TipoParametro tipoParametro) {
	        TipoParametroDTO dto = new TipoParametroDTO();
	        dto.setId(tipoParametro.getId());
	        dto.setNombreTipoParametro(tipoParametro.getNombreTipoParametro());
	        // Otros campos del DTO si es necesario
	        
	        return dto;
	    }

}
