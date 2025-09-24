package co.edu.poli.actividad3.model;

public class RecetaPlatoPrincipal extends Receta {
    
     private String recomendacionBebida;
    
    public RecetaPlatoPrincipal() {
        super(); // opcional, Java lo inserta de todas formas si existe el constructor vacío en Receta
    }




    public RecetaPlatoPrincipal(String dificultad, Ingrediente[] ingrediente, Autor autor, Instruccion[] instruccion,
            int tiempoPreparacion, int tiempoCoccion, String utensilio, String tipo, int porcion, String tipoCocina,
            String descripcion, ValorNutricional valorNutricional, int idReceta, Pais pais, int fechaCreacion,
            boolean esVegano, Comentario comentario, double calificacion, String recomendacionBebida) {
        super(dificultad, ingrediente, autor, instruccion, tiempoPreparacion, tiempoCoccion, utensilio, tipo, porcion,
                tipoCocina, descripcion, valorNutricional, idReceta, pais, fechaCreacion, esVegano, comentario,
                calificacion);
                   this.recomendacionBebida=recomendacionBebida;

    }

    // 🔹 Sobrecarga: constructor más simple
    public RecetaPlatoPrincipal(String recomendacionBebida ) {
        super(); // se inicializan los demás con valores por defecto
        this.recomendacionBebida=recomendacionBebida;
    }

    
    // 🔹 Sobrescritura de calcularTiempo()
    @Override
    public int calcularTiempo() {
        return super.calcularTiempo() - 5; 
    }

    public String getRecomendacionBebida() {
        return recomendacionBebida;
    }

    public void setRecomendacionBebida(String recomendacionBebida) {
        this.recomendacionBebida = recomendacionBebida;
    }

}
