package co.edu.poli.actividad3.model;

/**
 * Clase que representa un autor de recetas.
 * Contiene información personal y profesional del autor.
 * 
 * @author Felipe Parra
 */
public class Autor {
    private String nombre;
    private Pais pais;
    private String cedula;
    private int edad;
    private int numeroRecetas;
    private String email;

    /**
     * Constructor para crear un objeto Autor con sus atributos completos.
     * 
     * @param nombre Nombre completo del autor.
     * @param pais País de origen del autor.
     * @param cedula Documento de identidad del autor.
     * @param edad Edad del autor.
     * @param numeroRecetas Número de recetas creadas por el autor.
     * @param email Correo electrónico del autor.
     */
    public Autor(String nombre, Pais pais, String cedula, int edad, int numeroRecetas, String email) {
        this.nombre = nombre;
        this.pais = pais;
        this.cedula = cedula;
        this.edad = edad;
        this.numeroRecetas = numeroRecetas;
        this.email = email;
    }

    /**
     * Obtiene el nombre del autor.
     * 
     * @return nombre del autor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del autor.
     * 
     * @param nombre Nuevo nombre del autor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el país de origen del autor.
     * 
     * @return objeto Pais asociado al autor.
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Establece el país de origen del autor.
     * 
     * @param pais Nuevo objeto Pais.
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * Obtiene la cédula (documento de identidad) del autor.
     * 
     * @return cédula del autor.
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Establece la cédula del autor.
     * 
     * @param cedula Nueva cédula del autor.
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Obtiene la edad del autor.
     * 
     * @return edad en años.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del autor.
     * 
     * @param edad Nueva edad del autor.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el número de recetas creadas por el autor.
     * 
     * @return cantidad de recetas.
     */
    public int getNumeroRecetas() {
        return numeroRecetas;
    }

    /**
     * Establece el número de recetas creadas por el autor.
     * 
     * @param numeroRecetas Nuevo número de recetas.
     */
    public void setNumeroRecetas(int numeroRecetas) {
        this.numeroRecetas = numeroRecetas;
    }

    /**
     * Obtiene el correo electrónico del autor.
     * 
     * @return email del autor.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del autor.
     * 
     * @param email Nuevo correo electrónico.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Representación en String del objeto Autor.
     * 
     * @return Cadena con la información del autor.
     */
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

