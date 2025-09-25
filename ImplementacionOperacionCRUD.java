package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.model.Receta;
import java.util.Arrays;

/**
 * Implementación concreta de la interfaz {@link OperacionCrud} para manejar
 * operaciones CRUD sobre un arreglo dinámico de objetos {@link Receta}.
 * 
 * Esta clase almacena recetas en un arreglo que se expande dinámicamente cuando está lleno.
 * Permite crear, leer, actualizar, eliminar y listar recetas.
 * 
 * @author Felipe Parra
 */
public class ImplementacionOperacionCRUD implements OperacionCrud {

    /** Arreglo dinámico donde se almacenan las recetas */
    private static Receta[] recetas = new Receta[5];  // Tamaño inicial

    /**
     * Agrega una nueva receta al arreglo. Si el arreglo está lleno, se expande su tamaño.
     * 
     * @param receta La receta a agregar.
     */
    @Override
    public void create(Receta receta) {
        boolean insertado = false;

        // Buscar primer posición vacía (null)
        for (int i = 0; i < recetas.length; i++) {
            if (recetas[i] == null) {
                recetas[i] = receta;
                insertado = true;
                break;
            }
        }

        // Si no hay espacio, ampliar arreglo y agregar al final del nuevo espacio
        if (!insertado) {
            recetas = Arrays.copyOf(recetas, recetas.length + 5);  // Expandimos tamaño
            recetas[recetas.length - 5] = receta;  // Insertamos en la nueva posición
        }

        System.out.println(" Receta agregada: ID " + receta.getIdReceta());
    }

    /**
     * Busca y devuelve una receta según su ID.
     * 
     * @param id Identificador de la receta a buscar.
     * @return La receta encontrada o null si no existe.
     */
    @Override
    public Receta read(int id) {
        for (Receta r : recetas) {
            if (r != null && r.getIdReceta() == id) {
                return r;
            }
        }
        System.out.println(" Receta no encontrada con ID: " + id);
        return null;
    }

    /**
     * Actualiza la receta con el ID especificado.
     * 
     * @param id Identificador de la receta a actualizar.
     * @param nuevaReceta Objeto receta con la información actualizada.
     */
    @Override
    public void update(int id, Receta nuevaReceta) {
        for (int i = 0; i < recetas.length; i++) {
            if (recetas[i] != null && recetas[i].getIdReceta() == id) {
                recetas[i] = nuevaReceta;
                System.out.println("Receta actualizada con ID: " + id);
                return;
            }
        }
        System.out.println("No se pudo actualizar. Receta no encontrada con ID: " + id);
    }

    /**
     * Elimina la receta que coincida con el ID dado, estableciendo su posición a null.
     * 
     * @param id Identificador de la receta a eliminar.
     */
    @Override
    public void delete(int id) {
        for (int i = 0; i < recetas.length; i++) {
            if (recetas[i] != null && recetas[i].getIdReceta() == id) {
                recetas[i] = null;
                System.out.println(" Receta eliminada con ID: " + id);
                return;
            }
        }
        System.out.println(" No se pudo eliminar. Receta no encontrada con ID: " + id);
    }

    /**
     * Muestra por consola la lista completa de recetas almacenadas.
     * Si no hay recetas, indica que la lista está vacía.
     */
    @Override
    public void listar() {
        System.out.println("\n Listado de recetas:");
        boolean vacio = true;
        for (Receta r : recetas) {
            if (r != null) {
                System.out.println(r);
                vacio = false;
            }
        }
        if (vacio) {
            System.out.println(" No hay recetas registradas.");
        }
    }
}


