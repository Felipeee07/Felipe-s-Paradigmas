package co.edu.poli.actividad3.model;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Clase abstracta que representa una receta culinaria con sus atributos generales.
 * Contiene detalles como dificultad, ingredientes, autor, instrucciones, tiempos,
 * utensilios, tipo, porciones, país de origen, valor nutricional, comentarios, y calificación.
 * Esta clase sirve como base para tipos específicos de recetas que deben implementar 
 * el método abstracto mostrarInformacion().
 */
public abstract class Receta {

    /** Dificultad de la receta (ejemplo: fácil, media, difícil). */
    private String dificultad;

    /** Arreglo de ingredientes que componen la receta. */
    private Ingrediente[] ingrediente;

    /** Autor que creó la receta. */
    private Autor autor;

    /** Arreglo de instrucciones para preparar la receta. */
    private Instruccion[] instruccion;

    /** Tiempo en minutos para la preparación. */
    private int tiempoPreparacion;

    /** Tiempo en minutos para la cocción. */
    private int tiempoCoccion;

    /** Utensilio principal para la preparación. */
    private String utensilio;

    /** Tipo de receta (ejemplo: plato principal, postre). */
    private String tipo;

    /** Cantidad de porciones que rinde la receta. */
    private int porcion;

    /** Tipo de cocina al que pertenece (ejemplo: italiana, mexicana). */
    private String tipoCocina;

    /** Descripción breve de la receta. */
    private String descripcion;

    /** Información nutricional asociada a la receta. */
    private ValorNutricional valorNutricional;

    /** Identificador único de la receta. */
    private int idReceta;

    /** País de origen de la receta. */
    private Pais pais;

    /** Año de creación de la receta. */
    private int fechaCreacion;

    /** Indica si la receta es apta para veganos. */
    private boolean esVegano;

    /** Comentario asociado a la receta. */
    private Comentario comentario;

    /** Calificación promedio otorgada a la receta. */
    private double calificacion;

    /**
     * Constructor vacío por defecto.
     */
    public Receta() {
    }

    /**
     * Constructor con todos los atributos para inicializar la receta.
     * 
     * @param dificultad dificultad de la receta.
     * @param ingrediente arreglo de ingredientes.
     * @param autor autor de la receta.
     * @param instruccion arreglo de instrucciones.
     * @param tiempoPreparacion tiempo en minutos para preparación.
     * @param tiempoCoccion tiempo en minutos para cocción.
     * @param utensilio utensilio principal.
     * @param tipo tipo de receta.
     * @param porcion número de porciones.
     * @param tipoCocina tipo de cocina.
     * @param descripcion descripción de la receta.
     * @param valorNutricional valor nutricional asociado.
     * @param idReceta identificador único.
     * @param pais país de origen.
     * @param fechaCreacion año de creación.
     * @param esVegano indica si es vegana.
     * @param comentario comentario asociado.
     * @param calificacion calificación promedio.
     */
    public Receta(String dificultad, Ingrediente[] ingrediente, Autor autor,
                  Instruccion[] instruccion, int tiempoPreparacion, int tiempoCoccion,
                  String utensilio, String tipo, int porcion, String tipoCocina,
                  String descripcion, ValorNutricional valorNutricional, int idReceta,
                  Pais pais, int fechaCreacion, boolean esVegano, Comentario comentario,
                  double calificacion) {
        this.dificultad = dificultad;
        this.ingrediente = ingrediente;
        this.autor = autor;
        this.instruccion = instruccion;
        this.tiempoPreparacion = tiempoPreparacion;
        this.tiempoCoccion = tiempoCoccion;
        this.utensilio = utensilio;
        this.tipo = tipo;
        this.porcion = porcion;
        this.tipoCocina = tipoCocina;
        this.descripcion = descripcion;
        this.valorNutricional = valorNutricional;
        this.idReceta = idReceta;
        this.pais = pais;
        this.fechaCreacion = fechaCreacion;
        this.esVegano = esVegano;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }

    // GETTERS Y SETTERS

    /**
     * Obtiene la dificultad de la receta.
     * @return dificultad de la receta.
     */
    public String getDificultad() {
        return dificultad;
    }

    /**
     * Establece la dificultad de la receta.
     * @param dificultad dificultad a asignar.
     */
    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    /**
     * Obtiene el arreglo de ingredientes.
     * @return arreglo de ingredientes.
     */
    public Ingrediente[] getIngrediente() {
        return ingrediente;
    }

    /**
     * Asigna un arreglo de ingredientes a la receta.
     * @param ingrediente arreglo de ingredientes.
     */
    public void setIngrediente(Ingrediente[] ingrediente) {
        this.ingrediente = ingrediente;
    }

    /**
     * Obtiene el autor de la receta.
     * @return autor.
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * Asigna el autor de la receta.
     * @param autor autor a asignar.
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el arreglo de instrucciones.
     * @return arreglo de instrucciones.
     */
    public Instruccion[] getInstruccion() {
        return instruccion;
    }

    /**
     * Asigna un arreglo de instrucciones.
     * @param instruccion arreglo de instrucciones.
     */
    public void setInstruccion(Instruccion[] instruccion) {
        this.instruccion = instruccion;
    }

    /**
     * Obtiene el tiempo de preparación en minutos.
     * @return tiempo de preparación.
     */
    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    /**
     * Establece el tiempo de preparación.
     * @param tiempoPreparacion tiempo en minutos.
     */
    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    /**
     * Obtiene el tiempo de cocción en minutos.
     * @return tiempo de cocción.
     */
    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    /**
     * Establece el tiempo de cocción.
     * @param tiempoCoccion tiempo en minutos.
     */
    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    /**
     * Obtiene el utensilio principal.
     * @return utensilio.
     */
    public String getUtensilio() {
        return utensilio;
    }

    /**
     * Establece el utensilio principal.
     * @param utensilio utensilio a asignar.
     */
    public void setUtensilio(String utensilio) {
        this.utensilio = utensilio;
    }

    /**
     * Obtiene el tipo de receta.
     * @return tipo de receta.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de receta.
     * @param tipo tipo a asignar.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene la cantidad de porciones.
     * @return número de porciones.
     */
    public int getPorcion() {
        return porcion;
    }

    /**
     * Establece la cantidad de porciones.
     * @param porcion número de porciones.
     */
    public void setPorcion(int porcion) {
        this.porcion = porcion;
    }

    /**
     * Obtiene el tipo de cocina.
     * @return tipo de cocina.
     */
    public String getTipoCocina() {
        return tipoCocina;
    }

    /**
     * Establece el tipo de cocina.
     * @param tipoCocina tipo de cocina.
     */
    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    /**
     * Obtiene la descripción de la receta.
     * @return descripción.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción de la receta.
     * @param descripcion descripción.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el valor nutricional.
     * @return valor nutricional.
     */
    public ValorNutricional getValorNutricional() {
        return valorNutricional;
    }

    /**
     * Establece el valor nutricional.
     * @param valorNutricional valor nutricional a asignar.
     */
    public void setValorNutricional(ValorNutricional valorNutricional) {
        this.valorNutricional = valorNutricional;
    }

    /**
     * Obtiene el ID de la receta.
     * @return identificador único.
     */
    public int getIdReceta() {
        return idReceta;
    }

    /**
     * Establece el ID de la receta.
     * @param idReceta identificador único.
     */
    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    /**
     * Obtiene el país de origen.
     * @return país.
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Establece el país de origen.
     * @param pais país a asignar.
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * Obtiene el año de creación de la receta.
     * @return año de creación.
     */
    public int getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Establece el año de creación.
     * @param fechaCreacion año de creación.
     */
    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Indica si la receta es vegana.
     * @return true si es vegana, false en caso contrario.
     */
    public boolean isEsVegano() {
        return esVegano;
    }

    /**
     * Establece si la receta es vegana.
     * @param esVegano true si es vegana.
     */
    public void setEsVegano(boolean esVegano) {
        this.esVegano = esVegano;
    }

    /**
     * Obtiene el comentario asociado.
     * @return comentario.
     */
    public Comentario getComentario() {
        return comentario;
    }

    /**
     * Establece el comentario asociado.
     * @param comentario comentario a asignar.
     */
    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    /**
     * Obtiene la calificación promedio.
     * @return calificación.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Establece la calificación promedio.
     * @param calificacion calificación.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Calcula la edad actual de la receta en años, basado en el año actual menos el año de creación.
     * @return años desde la creación.
     */
    public int calcularEdadActual() {
        int anioActual = LocalDate.now().getYear();
        return anioActual - fechaCreacion;
    }

    /**
     * Calcula el tiempo total de la receta sumando el tiempo de preparación y el tiempo de cocción.
     * @return tiempo total en minutos.
     */
    public int calcularTiempo() {
        return tiempoPreparacion + tiempoCoccion;
    }

    /** Categoría fija de la receta. */
    private final String categoria = "Gastronomía";

    /**
     * Obtiene la categoría de la receta.
     * Método final que no puede ser sobrescrito.
     * @return categoría fija "Gastronomía".
     */
    public final String imprimirCategoria() {
        return categoria;
    }

    /**
     * Representación en cadena de texto con los detalles de la receta.
     * @return cadena con atributos principales.
     */
    @Override
    public String toString() {
        return "Receta{" +
                "idReceta=" + idReceta +
                ", dificultad='" + dificultad + '\'' +
                ", tiempoPreparacion=" + tiempoPreparacion +
                ", tiempoCoccion=" + tiempoCoccion +
                ", utensilio='" + utensilio + '\'' +
                ", tipo='" + tipo + '\'' +
                ", porcion=" + porcion +
                ", tipoCocina='" + tipoCocina + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", edadReceta=" + calcularEdadActual() + " años" +
                ", esVegano=" + esVegano +
                ", calificacion=" + calificacion +
                ", autor=" + (autor != null ? autor.getNombre() : "N/A") +
                ", pais=" + (pais != null ? pais.getNombrePais() : "N/A") +
                ", valorNutricional=" + (valorNutricional != null ? valorNutricional : "N/A") +
                ", ingredientes=" + (ingrediente != null ? Arrays.toString(ingrediente) : "N/A") +
                ", instrucciones=" + (instruccion != null ? Arrays.toString(instruccion) : "N/A") +
                ", comentario=" + (comentario != null ? comentario : "N/A") +
                '}';
    }

    /**
     * Método abstracto que deben implementar las subclases para mostrar información detallada de la receta.
     */
    public abstract void mostrarInformacion();
}
   