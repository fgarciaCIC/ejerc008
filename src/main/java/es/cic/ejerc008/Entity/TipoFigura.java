package es.cic.ejerc008.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoFigura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreTipoFigura;

    // Constructor, getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreTipoFigura() {
        return nombreTipoFigura;
    }

    public void setNombreTipoFigura(String nombreTipoFigura) {
        this.nombreTipoFigura = nombreTipoFigura;
    }
}
