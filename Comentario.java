package co.edu.poli.actividad3.model;

// 🔹 Clase que no se puede heredar
public final class Comentario {
    private String idComentario;
    private String autor;
    private String fecha;       
    private double calificacion;

    
    public Comentario(String idComentario, String autor, String fecha, double calificacion) {
        this.idComentario = idComentario;
        this.autor = autor;
        this.fecha = fecha;
        this.calificacion = calificacion;
    }

    public String getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(String idComentario) {
        this.idComentario = idComentario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // 🔹 toString
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
