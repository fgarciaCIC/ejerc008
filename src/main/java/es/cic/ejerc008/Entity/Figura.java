package es.cic.ejerc008.Entity;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Figura {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private final int maxX = 1000000;
	private final int maxY = 1000000;
	
	private String tipoFigura;
	private int posicionX;
    private int posicionY;
    private String color;
    private int longitud; // propiedad de solo lectura informativa

    // constructor
    public Figura(String tipo, int posicionX, int posicionY, String color) {
    	this.setTipoFigura(tipo);
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.color = color;
    }
    // set y get coordenadas
    public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}	
	public int getPosicionX(){
        return posicionX;
    }
    public int getPosicionY() {
        return posicionY;
    }

 // set y get de id
    public void setId(Long id) {
		this.id = id;
	}
    public Long getId() {
        return id;
    }
    // set y get de propiedad color
    public void setColor(String color) {
		this.color = color;
	}
    public String getColor() {
        return color;
    }
    
    // set y get del tipo de figura 
    public String getTipoFigura() {
		return tipoFigura;
	}
	public void setTipoFigura(String tipo) {
		this.tipoFigura = tipo;
	}
	// get de longitud de solo lectura al ser calculado en la clase que lo implementa
	public int getLongitud() {
		return longitud;
	}
	
	 public int getMaxX() {
	        return maxX;
	    }

	    public int getMaxY() {
	        return maxY;
	    }
		public void setDetalles(List<DetalleFigura> detalles) {
			// TODO Auto-generated method stub
			
		}
		public void setLienzo(Optional<Lienzo> lienzo) {
			// TODO Auto-generated method stub
			
		}
		
	
    
  
}
