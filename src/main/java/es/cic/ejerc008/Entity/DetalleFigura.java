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

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "figura_id")
    private Figura figura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_parametro_id")
    private TipoParametro tipoParametro;

	    private Long valor;
	    

		public void setId(Long id) {
		this.id = id;
		}
	    public Long getId() {
	        return id;
	    }
	    
	  
	    
	    // Getter y Setter para figura
	    public Figura getFigura() {
	        return figura;
	    }

	    public void setFigura(Figura figura) {
	        this.figura = figura;
	    }
	    
	    // Getter y Setter para valor
	    public Long getValor() {
	        return valor;
	    }

	    public void setValor(Long valor) {
	        this.valor = valor;
	    }
	    
	    // Getter y Setter para tipoParametro
	    public TipoParametro getTipoParametro() {
	        return tipoParametro;
	    }

	    public void setTipoParametro(TipoParametro tipoParametro) {
	        this.tipoParametro = tipoParametro;
	    }
	    public void setTipoParametroId(Long tipoParametroId) {
	        if (tipoParametroId == null) {
	            this.tipoParametro = null;
	        } else {
	            this.tipoParametro = new TipoParametro();
	            this.tipoParametro.setId(tipoParametroId);
	        }
	    }
	    public void setValor(String valor2) {
	        if (valor2 == null) {
	            this.valor = null;
	        } else {
	            try {
	                this.valor = Long.parseLong(valor2);
	            } catch (NumberFormatException e) {
	                // Manejo de la excepción si no se puede convertir a Long
	               
	            }
	        }
	    }
	
}
