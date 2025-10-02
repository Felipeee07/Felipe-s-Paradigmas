package co.edu.poli.actividad3.model;

/**
 * Clase que representa una instrucción dentro de una receta.
 * Extiende de la clase abstracta Receta.
 * Contiene información sobre el paso, duración y dificultad de la instrucción.
 * 
 * @author Felipe Parra
 */
public class Instruccion extends Receta {
    private String idInstruccion;
    private int paso;
    private String descripcion;
    private int duracion;   // en minutos, por ejemplo
    private String dificultad;

    /**
     * Constructor para crear una instrucción con sus atributos.
     * 
     * @param idInstruccion Identificador único de la instrucción.
     * @param paso Número de paso en la receta.
     * @param descripcion Descripción detallada del paso.
     * @param duracion Duración estimada del paso en minutos.
     * @param dificultad Nivel de dificultad del paso.
     */
    public Instruccion(String idInstruccion, int paso, String descripcion, int duracion, String dificultad) {
        this.idInstruccion = idInstruccion;
        this.paso = paso;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.dificultad = dificultad;
    }

    /**
     * Obtiene el identificador de la instrucción.
     * 
     * @return id de la instrucción.
     */
    public String getIdInstruccion() {
        return idInstruccion;
    }

    /**
     * Establece el identificador de la instrucción.
     * 
     * @param idInstruccion Nuevo id de la instrucción.
     */
    public void setIdInstruccion(String idInstruccion) {
        this.idInstruccion = idInstruccion;
    }

    /**
     * Obtiene el número del paso.
     * 
     * @return número del paso.
     */
    public int getPaso() {
        return paso;
    }

    /**
     * Establece el número del paso.
     * 
     * @param paso Nuevo número de paso.
     */
    public void setPaso(int paso) {
        this.paso = paso;
    }

    /**
     * Obtiene la descripción del paso.
     * 
     * @return descripción del paso.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del paso.
     * 
     * @param descripcion Nueva descripción del paso.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la duración estimada del paso en minutos.
     * 
     * @return duración en minutos.
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración estimada del paso.
     * 
     * @param duracion Nueva duración en minutos.
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Obtiene el nivel de dificultad del paso.
     * 
     * @return dificultad del paso.
     */
    public String getDificultad() {
        return dificultad;
    }

    /**
     * Establece el nivel de dificultad del paso.
     * 
     * @param dificultad Nueva dificultad del paso.
     */
    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * Representación en String del objeto Instruccion.
     * 
     * @return Cadena con la información de la instrucción.
     */
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

    /**
     * Calcula el tiempo total para la instrucción sumando
     * tiempo preparación, cocción y 5 minutos extras.
     * 
     * @return Tiempo total en minutos.
     */
    @Override
    public int calcularTiempo() {
        // Tiempo de instrucciones = preparación + cocción + 5 min extra
        return super.calcularTiempo() + 5;
    }

    /**
     * Método abstracto implementado para mostrar información específica.
     */
    @Override
    public void mostrarInformacion() {
        // Implementación vacía
    }
}
