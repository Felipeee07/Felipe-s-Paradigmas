package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.model.Receta;


public interface OperacionCrud {

    void create(Receta receta);

    Receta read(int id);

    void update(int id, Receta nuevaReceta);

    void delete(int id);

    void listar();  // Mostrar todas las recetas
}
