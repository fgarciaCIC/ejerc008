package es.cic.ejerc008.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TipoParametro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Relación ManyToOne con la clase TipoFigura
    @ManyToOne
    @JoinColumn(name = "tipo_figura_id")
    private TipoFigura tipoFigura;

    // Relación OneToMany con la clase DetalleFigura
    @OneToMany(mappedBy = "tipoParametro", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleFigura> detalles = new ArrayList<>();
    
    private String nombreTipoParametro;

	
    // Constructor, getters y setters
    
 // Getter y Setter para id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
 // Getter y Setter para tipoFigura
    public TipoFigura getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(TipoFigura tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    // Getter y Setter para nombreTipoParametro
	public String getNombreTipoParametro() {
		return nombreTipoParametro;
	}


	public void setNombreTipoParametro(String nombreTipoParametro) {
		this.nombreTipoParametro = nombreTipoParametro;
	}
	
	  // Getter y Setter para detalles
    public List<DetalleFigura> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleFigura> detalles) {
        this.detalles = detalles;
    }
    
}