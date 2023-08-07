package es.cic.ejerc008.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.Transient;

@Entity
public class Lienzo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private static final int maxX = 1000000;
	private static final int  maxY = 1000000;

	@OneToMany(mappedBy = "lienzo")
	private List<Figura> figuras;
	
	
	
	//constructor	
	public Lienzo() {
		figuras= new ArrayList<Figura>();
	}

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public List<Figura> getFiguras() {
		return figuras;
	}
	
	public void setFiguras(List<Figura> figuras) {
		this.figuras = figuras;
	}

	

   
	
	
	
}
