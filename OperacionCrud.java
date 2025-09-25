package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.model.Receta;

/**
 * Interfaz que define las operaciones básicas de un CRUD para la gestión
 * de objetos {@link Receta}.
 * 
 * Permite crear, leer, actualizar, eliminar y listar recetas.
 * 
 * @author Felipe Parra
 */
public interface OperacionCrud {

    /**
     * Agrega una nueva receta.
     * 
     * @param receta La receta a agregar.
     */
    void create(Receta receta);

    /**
     * Busca y devuelve una receta por su ID.
     * 
     * @param id Identificador único de la receta.
     * @return La receta encontrada, o null si no existe.
     */
    Receta read(int id);

    /**
     * Actualiza una receta existente con la información proporcionada.
     * 
     * @param id Identificador de la receta a actualizar.
     * @param nuevaReceta Objeto con la nueva información de la receta.
     */
    void update(int id, Receta nuevaReceta);

    /**
     * Elimina una receta según su ID.
     * 
     * @param id Identificador de la receta a eliminar.
     */
    void delete(int id);

    /**
     * Muestra todas las recetas almacenadas.
     */
    void listar();
}
