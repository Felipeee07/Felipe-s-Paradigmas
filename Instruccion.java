package co.edu.poli.actividad3.model;

public class Instruccion extends Receta {
    private String idInstruccion;
    private int paso;
    private String descripcion;
    private int duracion;   // en minutos, por ejemplo
    private String dificultad;

    // 🔹 Constructor
    public Instruccion(String idInstruccion, int paso, String descripcion, int duracion, String dificultad) {
        this.idInstruccion = idInstruccion;
        this.paso = paso;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.dificultad = dificultad;
    }

    // 🔹 Getters y Setters
    public String getIdInstruccion() {
        return idInstruccion;
    }

    public void setIdInstruccion(String idInstruccion) {
        this.idInstruccion = idInstruccion;
    }

    public int getPaso() {
        return paso;
    }

    public void setPaso(int paso) {
        this.paso = paso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    // 🔹 toString
    @Override
    public String toString() {
        return "Instruccion{" +
                "idInstruccion='" + idInstruccion + '\'' +
                ", paso=" + paso +
                ", descripcion='" + descripcion + '\'' +
                ", duracion=" + duracion +
                ", dificultad='" + dificultad + '\'' +
                '}';
    }

      @Override
    public int calcularTiempo() {
        // Tiempo de instrucciones = preparación + cocción + 5 min extra
        return super.calcularTiempo() + 5;
    }
}
