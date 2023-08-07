package es.cic.ejerc008.DTO;

public class TipoParametroDTO {
	 private Long id;
	    private String nombreTipoParametro;

	    // Constructor vacío
	    public TipoParametroDTO() {
	    }

	    // Constructor con parámetros
	    public TipoParametroDTO(Long id, String nombreTipoParametro) {
	        this.id = id;
	        this.nombreTipoParametro = nombreTipoParametro;
	    }

	    // Getters y setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNombreTipoParametro() {
	        return nombreTipoParametro;
	    }

	    public void setNombreTipoParametro(String nombreTipoParametro) {
	        this.nombreTipoParametro = nombreTipoParametro;
	    }

}
