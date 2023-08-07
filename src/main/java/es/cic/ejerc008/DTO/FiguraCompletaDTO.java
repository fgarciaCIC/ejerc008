package es.cic.ejerc008.DTO;

import java.util.ArrayList;
import java.util.List;

import es.cic.ejerc008.Entity.DetalleFigura;
import es.cic.ejerc008.Entity.Figura;
import es.cic.ejerc008.Entity.TipoParametro;

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
  
    // Convertir un DTO de figura completa a Figura y su Detalle
    private Figura convertirDTOaFigura(FiguraCompletaDTO figuraDTO) {
        Figura figura = new Figura(null, 0, 0, null);

        figura.setId(figuraDTO.getId());
        figura.setTipoFigura(figuraDTO.getTipoFigura());
        figura.setPosicionX(figuraDTO.getPosicionX());
        figura.setPosicionY(figuraDTO.getPosicionY());
        figura.setColor(figuraDTO.getColor());

        if (figuraDTO.getDetalles() != null) {
            List<DetalleFigura> detalles = new ArrayList<>();
            for (DetalleFiguraDTO detalleDTO : figuraDTO.getDetalles()) {
                DetalleFigura detalle = new DetalleFigura();
                detalle.setId(detalleDTO.getId());

                TipoParametro tipoParametro = new TipoParametro();
                tipoParametro.setId(detalleDTO.getTipoParametroId());
                detalle.setTipoParametro(tipoParametro);

                detalle.setValor(detalleDTO.getValor());
                detalles.add(detalle);
            }
            figura.setDetalles(detalles);
        }

        return figura;
    }
      
}