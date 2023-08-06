package es.cic.ejerc008.DTO;

import java.util.List;

public class FiguraCompletaDTO {
    private Long id;
    private String tipoFigura;
    private int posicionX;
    private int posicionY;
    private String color;
    private int longitud;
    
    private List<DetalleFiguraDTO> detalles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public List<DetalleFiguraDTO> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleFiguraDTO> detalles) {
        this.detalles = detalles;
    }
}