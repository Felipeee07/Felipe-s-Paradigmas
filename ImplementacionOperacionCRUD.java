package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.model.Receta;
import java.util.Arrays;


public class ImplementacionOperacionCRUD implements OperacionCrud {

    private static Receta[] recetas = new Receta[5];  // Tamaño inicial

    @Override
    public void create(Receta receta) {
        boolean insertado = false;

        // Buscar primer null
        for (int i = 0; i < recetas.length; i++) {
            if (recetas[i] == null) {
                recetas[i] = receta;
                insertado = true;
                break;
            }
        }

       
        if (!insertado) {
            recetas = Arrays.copyOf(recetas, recetas.length + 5);  // Expandimos tamaño
            recetas[recetas.length - 5] = receta;  // Insertamos en la nueva posición
        }

        System.out.println(" Receta agregada: ID " + receta.getIdReceta());
    }

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
