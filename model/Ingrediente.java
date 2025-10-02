package co.edu.poli.actividad3.model;

/**
 * Clase que representa un ingrediente dentro de una receta.
 * Extiende de la clase abstracta Receta.
 * Contiene información sobre el nombre, cantidad, sabor, tipo y frescura del ingrediente.
 * 
 * @author Felipe Parra
 */
public class Ingrediente extends Receta {

    private String idIngrediente;
    private String nombre;
    private String cantidad;
    private String sabor;
    private String tipo;
    private boolean esFresco;

    /**
     * Constructor para crear un ingrediente con sus atributos.
     * 
     * @param idIngrediente Identificador único del ingrediente.
     * @param nombre Nombre del ingrediente.
     * @param cantidad Cantidad utilizada del ingrediente.
     * @param sabor Sabor característico del ingrediente.
     * @param tipo Tipo o categoría del ingrediente.
     * @param esFresco Indica si el ingrediente es fresco.
     */
    public Ingrediente(String idIngrediente, String nombre, String cantidad,
                       String sabor, String tipo, boolean esFresco) {
        this.idIngrediente = idIngrediente;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.sabor = sabor;
        this.tipo = tipo;
        this.esFresco = esFresco;
    }

    /**
     * Obtiene el identificador del ingrediente.
     * 
     * @return id del ingrediente.
     */
    public String getIdIngrediente() {
        return idIngrediente;
    }

    /**
     * Establece el identificador del ingrediente.
     * 
     * @param idIngrediente Nuevo id del ingrediente.
     */
    public void setIdIngrediente(String idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    /**
     * Obtiene el nombre del ingrediente.
     * 
     * @return nombre del ingrediente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del ingrediente.
     * 
     * @param nombre Nuevo nombre del ingrediente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cantidad del ingrediente.
     * 
     * @return cantidad del ingrediente.
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del ingrediente.
     * 
     * @param cantidad Nueva cantidad del ingrediente.
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el sabor característico del ingrediente.
     * 
     * @return sabor del ingrediente.
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * Establece el sabor característico del ingrediente.
     * 
     * @param sabor Nuevo sabor del ingrediente.
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * Obtiene el tipo o categoría del ingrediente.
     * 
     * @return tipo del ingrediente.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo o categoría del ingrediente.
     * 
     * @param tipo Nuevo tipo del ingrediente.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Indica si el ingrediente es fresco.
     * 
     * @return true si es fresco, false en caso contrario.
     */
    public boolean isEsFresco() {
        return esFresco;
    }

    /**
     * Establece si el ingrediente es fresco.
     * 
     * @param esFresco Nuevo estado de frescura del ingrediente.
     */
    public void setEsFresco(boolean esFresco) {
        this.esFresco = esFresco;
    }

    /**
     * Representación en String del objeto Ingrediente.
     * 
     * @return Cadena con la información del ingrediente.
     */
    @Override
    public String toString() {
        return "Ingrediente{" +
                "idIngrediente='" + idIngrediente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", sabor='" + sabor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", esFresco=" + esFresco +
                '}';
    }

    /**
     * Calcula el tiempo de preparación del ingrediente.
     * 
     * @return Tiempo de preparación en minutos.
     */
    @Override
    public int calcularTiempo() {
        // El tiempo de un ingrediente es solo la preparación
        return getTiempoPreparacion();
    }

    /**
     * Método abstracto implementado para mostrar información específica.
     */
    @Override
    public void mostrarInformacion() {
        // Implementación vacía
    }
}
