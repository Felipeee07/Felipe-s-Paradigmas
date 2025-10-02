package co.edu.poli.actividad3.model;

/**
 * Clase que representa una receta de plato principal.
 * Hereda de Receta y agrega la recomendación de bebida.
 * 
 * @author Felipe Parra
 */
public class RecetaPlatoPrincipal extends Receta {
    
    private String recomendacionBebida;

    // Constructor vacío
    public RecetaPlatoPrincipal() {
        super(); // opcional, Java lo añade si existe el constructor vacío en la clase padre
    }

    // Constructor completo
    public RecetaPlatoPrincipal(String dificultad, Ingrediente[] ingrediente, Autor autor, Instruccion[] instruccion,
            int tiempoPreparacion, int tiempoCoccion, String utensilio, String tipo, int porcion, String tipoCocina,
            String descripcion, ValorNutricional valorNutricional, int idReceta, Pais pais, int fechaCreacion,
            boolean esVegano, Comentario comentario, double calificacion, String recomendacionBebida) {
        super(dificultad, ingrediente, autor, instruccion, tiempoPreparacion, tiempoCoccion, utensilio, tipo, porcion,
                tipoCocina, descripcion, valorNutricional, idReceta, pais, fechaCreacion, esVegano, comentario,
                calificacion);
        this.recomendacionBebida = recomendacionBebida;
    }

    // Constructor con solo recomendación de bebida
    public RecetaPlatoPrincipal(String recomendacionBebida) {
        super(); // inicializa con valores por defecto
        this.recomendacionBebida = recomendacionBebida;
    }

    // Sobrescritura de calcularTiempo (reduce 5 minutos del total)
    @Override
    public int calcularTiempo() {
        return super.calcularTiempo() - 5;
    }

    // Getters y setters
    public String getRecomendacionBebida() {
        return recomendacionBebida;
    }

    public void setRecomendacionBebida(String recomendacionBebida) {
        this.recomendacionBebida = recomendacionBebida;
    }

    // Mostrar información extendida de la receta
    @Override
    public void mostrarInformacion() {
        System.out.println("Receta Plato Principal:");
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Recomendación de bebida: " + recomendacionBebida);
        System.out.println("Tiempo total: " + calcularTiempo() + " minutos");
    }
}
