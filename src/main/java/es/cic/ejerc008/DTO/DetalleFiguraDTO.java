package es.cic.ejerc008.DTO;

public class DetalleFiguraDTO {
    private Long id;
    private Long tipoParametroId;
    private String valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTipoParametroId() {
        return tipoParametroId;
    }

    public void setTipoParametroId(Long tipoParametroId) {
        this.tipoParametroId = tipoParametroId;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}