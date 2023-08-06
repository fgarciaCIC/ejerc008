package es.cic.ejerc008.DTO;

import java.util.ArrayList;
import java.util.List;

public class LienzoDTO {

	private Long id;
	private final int maxX = 1000000;
	private final int maxY = 1000000;
	
	private List<Long>figuras;

	public LienzoDTO () {
		figuras = new ArrayList<Long>();
	}
	
	public Long getId() {
		return id;
	}
		
	public void setId(Long id) {
		this.id = id;
	}

	public List<Long> getFiguras() {
		return figuras;
	}

	public void setFiguras(List<Long> figuras) {
		this.figuras = figuras;
	}

	public int getMaxX() {
		return maxX;
	}

	public int getMaxY() {
		return maxY;
	} 
	
	
}
