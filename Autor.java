package co.edu.poli.actividad3.model;

public class Autor {
    private String nombre;
    private Pais pais;
    private String cedula;
    private int edad;
    private int numeroRecetas;
    private String email;

    // 🔹 Constructor
    public Autor(String nombre, Pais pais, String cedula, int edad, int numeroRecetas, String email) {
        this.nombre = nombre;
        this.pais = pais;
        this.cedula = cedula;
        this.edad = edad;
        this.numeroRecetas = numeroRecetas;
        this.email = email;
    }

    // 🔹 Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroRecetas() {
        return numeroRecetas;
    }

    public void setNumeroRecetas(int numeroRecetas) {
        this.numeroRecetas = numeroRecetas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 🔹 toString
    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", pais=" + pais +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", numeroRecetas=" + numeroRecetas +
                ", email='" + email + '\'' +
                '}';
    }
}
