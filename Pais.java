package co.edu.poli.actividad3.model;

/**
 * Clase que representa un país con su identificador y nombre.
 * 
 * @author Felipe Parra
 */
public class Pais {
    private String idPais;
    private String nombrePais;

    /**
     * Constructor para crear un objeto Pais con su id y nombre.
     * 
     * @param idPais Identificador único del país.
     * @param nombrePais Nombre del país.
     */
    public Pais(String idPais, String nombrePais) {
        this.idPais = idPais;
        this.nombrePais = nombrePais;
    }

    /**
     * Obtiene el identificador del país.
     * 
     * @return El id del país.
     */
    public String getIdPais() {
        return idPais;
    }

    /**
     * Establece el identificador del país.
     * 
     * @param idPais Nuevo id para el país.
     */
    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    /**
     * Obtiene el nombre del país.
     * 
     * @return El nombre del país.
     */
    public String getNombrePais() {
        return nombrePais;
    }

    /**
     * Establece el nombre del país.
     * 
     * @param nombrePais Nuevo nombre para el país.
     */
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    /**
     * Representación en String del objeto Pais.
     * 
     * @return Una cadena con la información del país.
     */
    @Override
    public String toString() {
        return "Pais{" +
                "idPais='" + idPais + '\'' +
                ", nombrePais='" + nombrePais + '\'' +
                '}';
    }
}
