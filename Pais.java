package co.edu.poli.actividad3.model;

public class Pais {
    private String idPais;
    private String nombrePais;

    // 🔹 Constructor
    public Pais(String idPais, String nombrePais) {
        this.idPais = idPais;
        this.nombrePais = nombrePais;
    }

    // 🔹 Getters y Setters
    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    // 🔹 toString
    @Override
    public String toString() {
        return "Pais{" +
                "idPais='" + idPais + '\'' +
                ", nombrePais='" + nombrePais + '\'' +
                '}';
    }
}
