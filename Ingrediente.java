package co.edu.poli.actividad3.model;

public class Ingrediente extends Receta {


    private String idIngrediente;
    private String nombre;
    private String cantidad;
    private String sabor;
    private String tipo;
    private boolean esFresco;

    // 🔹 Constructor
    public Ingrediente(String idIngrediente, String nombre, String cantidad,
                       String sabor, String tipo, boolean esFresco) {
        this.idIngrediente = idIngrediente;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.sabor = sabor;
        this.tipo = tipo;
        this.esFresco = esFresco;
    }

    // 🔹 Getters y Setters
    public String getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(String idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEsFresco() {
        return esFresco;
    }

    public void setEsFresco(boolean esFresco) {
        this.esFresco = esFresco;
    }

    // 🔹 toString
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
@Override
    public int calcularTiempo() {
        // El tiempo de un ingrediente es solo la preparación
        return getTiempoPreparacion();
    }
}






