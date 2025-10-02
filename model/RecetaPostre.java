package co.edu.poli.actividad3.model;

/**
 * Clase que representa una receta de postre.
 * Hereda de Receta y agrega el nivel de dulzura.
 * 
 * @author Felipe Parra
 */
public class RecetaPostre extends Receta {
    
    private int nivelDulzura;

    // Constructor vacío
    public RecetaPostre() {
        super(); // opcional, Java lo inserta automáticamente si existe el constructor vacío en Receta
    }

    // Constructor completo con todos los atributos heredados + nivelDulzura
    public RecetaPostre(String dificultad, Ingrediente[] ingrediente, Autor autor,
                        Instruccion[] instruccion, int tiempoPreparacion, int tiempoCoccion,
                        String utensilio, String tipo, int porcion, String tipoCocina,
                        String descripcion, ValorNutricional valorNutricional, int idReceta,
                        Pais pais, int fechaCreacion, boolean esVegano, Comentario comentario,
                        double calificacion, int nivelDulzura) {
        super(dificultad, ingrediente, autor, instruccion, tiempoPreparacion, tiempoCoccion,
              utensilio, tipo, porcion, tipoCocina, descripcion, valorNutricional, idReceta,
              pais, fechaCreacion, esVegano, comentario, calificacion);

        this.nivelDulzura = nivelDulzura;
    }

    // Sobrecarga: constructor simple con nivelDulzura y descripción
    public RecetaPostre(int nivelDulzura, String descripcion) {
        super(); // se inicializan los demás atributos con valores por defecto
        this.nivelDulzura = nivelDulzura;
        setDescripcion(descripcion);
    }

    // Getters y Setters
    public int getNivelDulzura() {
        return nivelDulzura;
    }

    public void setNivelDulzura(int nivelDulzura) {
        this.nivelDulzura = nivelDulzura;
    }

    // Sobrescritura de calcularTiempo()
    @Override
    public int calcularTiempo() {
        return super.calcularTiempo() - 5;
    }

    // Sobrescritura de toString()
    @Override
    public String toString() {
        return super.toString() +
               "\nNivel de dulzura: " + nivelDulzura +
               "\nTiempo (postre): " + calcularTiempo() + " min";
    }

    // Método para mostrar información más detallada
    @Override
    public void mostrarInformacion() {
        System.out.println("Receta Postre:");
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Nivel de dulzura: " + nivelDulzura);
        System.out.println("Tiempo total: " + calcularTiempo() + " minutos");
    }
}
