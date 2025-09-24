package co.edu.poli.actividad3.model;


public class RecetaPostre extends Receta {
    public RecetaPostre() {
        super(); // opcional, Java lo inserta de todas formas si existe el constructor vacío en Receta
    }


    private int nivelDulzura;

    // Constructor con todos los atributos heredados + nivelDulzura
    public RecetaPostre(String dificultad, Ingrediente[] ingrediente, Autor autor,
                        Instruccion[] instruccion, int tiempoPreparacion, int tiempoCoccion,
                        String utensilio, String tipo, int porcion, String tipoCocina,
                        String descripcion, ValorNutricional valorNutricional, int idReceta,
                        Pais pais, int fechaCreacion, boolean esVegano, Comentario comentario,
                        double calificacion, int nivelDulzuraa) {
        super(dificultad, ingrediente, autor, instruccion, tiempoPreparacion, tiempoCoccion,
              utensilio, tipo, porcion, tipoCocina, descripcion, valorNutricional, idReceta,
              pais, fechaCreacion, esVegano, comentario, calificacion);

        this.nivelDulzura = nivelDulzuraa;
    }

    // 🔹 Sobrecarga: constructor más simple
    public RecetaPostre(int nivelDulzura, String descripcion) {
        super(); // se inicializan los demás con valores por defecto
        this.nivelDulzura = nivelDulzura;
    }

    // Getter y Setter
    public int getNivelDulzura() {
        return nivelDulzura;
    }

    public void setNivelDulzura(int nivelDulzura) {
        this.nivelDulzura = nivelDulzura;
    }

    // 🔹 Sobrescritura de calcularTiempo()
    @Override
    public int calcularTiempo() {
        return super.calcularTiempo() - 5; 
    }

    // 🔹 Sobrescritura de toString()
    @Override
public String toString() {
    return super.toString() +
           "\nNivel de dulzura: " + nivelDulzura +
           "\nTiempo (postre): " + calcularTiempo() + " min"; // 👈 sobrescritura
    }
}
