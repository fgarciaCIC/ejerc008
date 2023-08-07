package es.cic.ejerc008.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetalleFigura {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	  // Relación ManyToOne con la clase Figura
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "figura_id")
    private Figura figura;

	 // Relación ManyToOne con la clase TipoParametro
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_parametro_id")
    private TipoParametro tipoParametro;

	private Long valor;
	    
	   // Constructor vacío
	
	
// setter y getter
		public void setId(Long id) {
		this.id = id;
		}
	    public Long getId() {
	        return id;
	    }
	    
	    // Getter y Setter para valor
	    public Long getValor() {
	        return valor;
	    }
	    public void setValor(Long valor) {
	        this.valor = valor;
	    }
	 	    
	    // Getter y Setter para figura
	    public Figura getFigura() {
	        return figura;
	    }
	    public void setFigura(Figura figura) {
	        this.figura = figura;
	    }
	    	   
	    
	    // Getter y Setter para tipoParametro
	    public TipoParametro getTipoParametro() {
	        return tipoParametro;
	    }

	    public void setTipoParametro(TipoParametro tp) {
	        this.tipoParametro = tp;
	    }
	  
	
	
}
