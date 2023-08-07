package es.cic.ejerc008.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TipoFigura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreTipoFigura;
    
    @OneToMany(mappedBy = "tipoFigura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TipoParametro> parametros = new ArrayList<>();


    // Constructor, getters y setters
    
    // Constructor por defecto
    public TipoFigura() {
        // Constructor por defecto necesario para JPA
    }
    
    // Constructor con parámetros
    public TipoFigura(String nombreTipoFigura) {
        this.nombreTipoFigura = nombreTipoFigura;
    }
    
    
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
    
    // Getter y Setter para parametros
    public List<TipoParametro> getParametros() {
        return parametros;
    }

    public void setParametros(List<TipoParametro> parametros) {
        this.parametros = parametros;
    }
}
