package co.edu.poli.actividad3.model;

/**
 * Clase que representa los valores nutricionales de una receta.
 * Contiene calorías, proteínas, grasas y carbohidratos.
 * 
 * @author Felipe Parra
 */
public class ValorNutricional {
    private int calorias;
    private double proteinas;
    private double grasas;
    private double carbohidratos;

    /**
     * Constructor para crear un objeto ValorNutricional con todos sus atributos.
     * 
     * @param calorias Cantidad de calorías.
     * @param proteinas Cantidad de proteínas (en gramos).
     * @param grasas Cantidad de grasas (en gramos).
     * @param carbohidratos Cantidad de carbohidratos (en gramos).
     */
    public ValorNutricional(int calorias, double proteinas, double grasas, double carbohidratos) {
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.carbohidratos = carbohidratos;
    }

    /**
     * Obtiene la cantidad de calorías.
     * @return calorías.
     */
    public int getCalorias() {
        return calorias;
    }

    /**
     * Establece la cantidad de calorías.
     * @param calorias Cantidad de calorías a establecer.
     */
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    /**
     * Obtiene la cantidad de proteínas.
     * @return proteínas en gramos.
     */
    public double getProteinas() {
        return proteinas;
    }

    /**
     * Establece la cantidad de proteínas.
     * @param proteinas Cantidad de proteínas en gramos a establecer.
     */
    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    /**
     * Obtiene la cantidad de grasas.
     * @return grasas en gramos.
     */
    public double getGrasas() {
        return grasas;
    }

    /**
     * Establece la cantidad de grasas.
     * @param grasas Cantidad de grasas en gramos a establecer.
     */
    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    /**
     * Obtiene la cantidad de carbohidratos.
     * @return carbohidratos en gramos.
     */
    public double getCarbohidratos() {
        return carbohidratos;
    }

    /**
     * Establece la cantidad de carbohidratos.
     * @param carbohidratos Cantidad de carbohidratos en gramos a establecer.
     */
    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    /**
     * Representa la información nutricional en formato String.
     * @return String con los valores nutricionales.
     */
    @Override
    public String toString() {
        return "ValorNutricional{" +
                "calorias=" + calorias +
                ", proteinas=" + proteinas +
                ", grasas=" + grasas +
                ", carbohidratos=" + carbohidratos +
                '}';
    }
}
