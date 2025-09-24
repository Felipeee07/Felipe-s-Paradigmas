package co.edu.poli.actividad3.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Receta {


    private String dificultad;
    private Ingrediente[] ingrediente;
    private Autor autor;
    private Instruccion[] instruccion;
    private int tiempoPreparacion;
    private int tiempoCoccion;
    private String utensilio;
    private String tipo;
    private int porcion;
    private String tipoCocina;
    private String descripcion;
    private ValorNutricional valorNutricional;
    private int idReceta;
    private Pais pais;
    private int fechaCreacion;   // año
    private boolean esVegano;
    private Comentario comentario;
    private double calificacion;

    public Receta() {
    }

    
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

    
    public String getCategoria() {
        return categoria;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public Ingrediente[] getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente[] ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Instruccion[] getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(Instruccion[] instruccion) {
        this.instruccion = instruccion;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public String getUtensilio() {
        return utensilio;
    }

    public void setUtensilio(String utensilio) {
        this.utensilio = utensilio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPorcion() {
        return porcion;
    }

    public void setPorcion(int porcion) {
        this.porcion = porcion;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ValorNutricional getValorNutricional() {
        return valorNutricional;
    }

    public void setValorNutricional(ValorNutricional valorNutricional) {
        this.valorNutricional = valorNutricional;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isEsVegano() {
        return esVegano;
    }

    public void setEsVegano(boolean esVegano) {
        this.esVegano = esVegano;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // 🔹 Método para calcular la "edad actual" de la receta
    public int calcularEdadActual() {
        int anioActual = LocalDate.now().getYear();
        return anioActual - fechaCreacion;
    }

    public int calcularTiempo() {
        return tiempoPreparacion + tiempoCoccion;
    }

    // la clase que no se puede heredar es "comentario"
    
    // Atributo que no se puede cambiar
    private final String categoria = "Gastronomía";

    //  Método que no se puede sobrescribir
    public final String imprimirCategoria() {
        return categoria;
    }

    
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
}
