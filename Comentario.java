package co.edu.poli.actividad3.model;

/**
 * Clase final que representa un comentario hecho a una receta.
 * Esta clase no puede ser heredada.
 * Contiene información sobre el autor, fecha y calificación del comentario.
 * 
 * @author Felipe Parra
 */
public final class Comentario {
    private String idComentario;
    private String autor;
    private String fecha;
    private double calificacion;

    /**
     * Constructor para crear un comentario con sus atributos.
     * 
     * @param idComentario Identificador único del comentario.
     * @param autor Nombre del autor del comentario.
     * @param fecha Fecha en la que se hizo el comentario.
     * @param calificacion Calificación numérica asociada al comentario.
     */
    public Comentario(String idComentario, String autor, String fecha, double calificacion) {
        this.idComentario = idComentario;
        this.autor = autor;
        this.fecha = fecha;
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el identificador del comentario.
     * 
     * @return id del comentario.
     */
    public String getIdComentario() {
        return idComentario;
    }

    /**
     * Establece el identificador del comentario.
     * 
     * @param idComentario Nuevo id del comentario.
     */
    public void setIdComentario(String idComentario) {
        this.idComentario = idComentario;
    }

    /**
     * Obtiene el nombre del autor del comentario.
     * 
     * @return autor del comentario.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el nombre del autor del comentario.
     * 
     * @param autor Nuevo nombre del autor.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene la fecha del comentario.
     * 
     * @return fecha del comentario.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del comentario.
     * 
     * @param fecha Nueva fecha del comentario.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la calificación asociada al comentario.
     * 
     * @return calificación numérica.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Establece la calificación del comentario.
     * 
     * @param calificacion Nueva calificación numérica.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Representación en String del objeto Comentario.
     * 
     * @return Cadena con la información del comentario.
     */
    @Override
    public String toString() {
        return "Comentario{" +
                "idComentario='" + idComentario + '\'' +
                ", autor='" + autor + '\'' +
                ", fecha='" + fecha + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}
