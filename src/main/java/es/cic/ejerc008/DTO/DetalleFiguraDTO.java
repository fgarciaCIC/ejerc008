package es.cic.ejerc008.DTO;

import es.cic.ejerc008.Entity.DetalleFigura;
import es.cic.ejerc008.Entity.TipoParametro;

public class DetalleFiguraDTO {
    private Long id;
    private Long tipoParametroId;
    private Long valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTipoParametroId() {
        return tipoParametroId;
    }

    public void setTipoParametroId(Long tipoParametroId) {
        this.tipoParametroId = tipoParametroId;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }
    
      
    
  
}