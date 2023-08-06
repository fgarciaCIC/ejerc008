package es.cic.ejerc008.Entity;

import javax.persistence.Entity;
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

	    @ManyToOne
	    @JoinColumn(name = "figura_id")
	    private Figura figura;

	    @ManyToOne
	    @JoinColumn(name = "tipo_parametro_id")
	    private TipoParametro tipoParametro;

	    private Long valor;

		public void setId(Long id) {
		this.id = id;
		}
	    public Long getId() {
	        return id;
	    }
		
		public void setValor(String valor2) {
			// TODO Auto-generated method stub
			
		}
		public void setTipoParametroId(Long tipoParametroId) {
			// TODO Auto-generated method stub
			
		}

}
