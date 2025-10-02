package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.model.Receta;
import java.util.Arrays;

/**
 * Implementación concreta de la interfaz {@link OperacionCrud} para manejar
 * operaciones CRUD sobre un arreglo estático de objetos {@link Receta}.
 * 
 * Esta clase almacena recetas en un arreglo que se expande cuando está lleno.
 * Permite crear, leer, actualizar, eliminar y listar recetas.
 * 
 * @author Felipe
 */
public class ImplementacionOperacionCRUD implements OperacionCrud {

    /** Arreglo de recetas (simulación de almacenamiento estático) */
    private static Receta[] recetas = new Receta[5];  // Tamaño inicial

    /**
     * Agrega una nueva receta al arreglo. Si el arreglo está lleno, se expande su tamaño.
     *
     * @param receta La receta a agregar.
     * @return La receta agregada.
     */
    @Override
    public Receta create(Receta receta) {
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

        System.out.println("Receta agregada: ID " + receta.getIdReceta());
        return receta;
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
        System.out.println("Receta no encontrada con ID: " + id);
        return null;
    }

    /**
     * Actualiza la receta con el ID especificado.
     *
     * @param id Identificador de la receta a actualizar.
     * @param nuevaReceta Objeto receta con la información actualizada.
     * @return La receta actualizada o null si no se encontró.
     */
    @Override
    public Receta update(int id, Receta nuevaReceta) {
        for (int i = 0; i < recetas.length; i++) {
            if (recetas[i] != null && recetas[i].getIdReceta() == id) {
                recetas[i] = nuevaReceta;
                System.out.println("Receta actualizada con ID: " + id);
                return nuevaReceta;
            }
        }
        System.out.println("No se pudo actualizar. Receta no encontrada con ID: " + id);
        return null;
    }

    /**
     * Elimina la receta que coincida con el ID dado, estableciendo su posición a null.
     *
     * @param id Identificador de la receta a eliminar.
     * @return true si se eliminó, false si no se encontró.
     */
    @Override
    public boolean delete(int id) {
        for (int i = 0; i < recetas.length; i++) {
            if (recetas[i] != null && recetas[i].getIdReceta() == id) {
                recetas[i] = null;
                System.out.println("Receta eliminada con ID: " + id);
                return true;
            }
        }
        System.out.println("No se pudo eliminar. Receta no encontrada con ID: " + id);
        return false;
    }

    /**
     * Devuelve un arreglo con todas las recetas almacenadas (ignorando posiciones nulas).
     *
     * @return Arreglo de recetas no nulas.
     */
    @Override
    public Receta[] listar() {
        int count = 0;

        // Contar cuántas recetas no nulas hay
        for (Receta r : recetas) {
            if (r != null) {
                count++;
            }
        }

        // Crear arreglo exacto para las recetas no nulas
        Receta[] resultado = new Receta[count];
        int index = 0;

        for (Receta r : recetas) {
            if (r != null) {
                resultado[index++] = r;
            }
        }

        return resultado;
    }
}
