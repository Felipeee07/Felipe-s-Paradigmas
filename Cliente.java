package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.model.*;
import co.edu.poli.actividad3.servicios.*;

/**
 * Clase cliente para probar el funcionamiento del sistema de recetas.
 * Contiene la lógica principal para crear, mostrar y manipular objetos del modelo,
 * incluyendo operaciones CRUD, polimorfismo y uso de arreglos.
 *
 * <p>Demuestra herencia, composición y sobreescritura en el manejo de recetas.</p>
 * 
 * @author Felipe Parra
 */
public class Cliente {

    /**
     * Muestra el tiempo total de preparación y cocción de una receta,
     * utilizando el método polimórfico {@code calcularTiempo()}.
     *
     * @param receta Objeto de tipo {@code Receta} o una de sus subclases.
     */
    public static void mostrarTiempo(Receta receta) {
        System.out.println(
            receta.getClass().getSimpleName() +
            " | Tiempo total: " + receta.calcularTiempo() + " min"
        );
    }

    /**
     * Crea y retorna una receta de postre de demostración con valores simples.
     *
     * @return Una instancia de {@code RecetaPostre} con tiempos y dulzura definidos.
     */
    public static Receta crearRecetaDemo() {
        RecetaPostre demo = new RecetaPostre();
        demo.setTiempoPreparacion(10);
        demo.setTiempoCoccion(15);
        demo.setNivelDulzura(7);
        return demo; 
    }

    /**
     * Método principal para ejecutar el sistema.
     * Crea y manipula recetas, prueba el arreglo de recetas,
     * y ejecuta operaciones CRUD con la implementación proporcionada.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        // Crear objetos básicos
        Pais pais = new Pais("CO", "Colombia");
        Autor autor = new Autor("Juan Pérez", pais, "123456", 30, 10, "juanperez@email.com");
        ValorNutricional valor = new ValorNutricional(200, 10, 5, 25);

        // Crear arreglos de ingredientes e instrucciones
        Ingrediente[] ingredientes = {
            new Ingrediente("I01", "Harina", "500g", "Neutro", "Base", true),
            new Ingrediente("I02", "Azúcar", "200g", "Dulce", "Endulzante", true)
        };

        Instruccion[] instrucciones = {
            new Instruccion("INS01", 1, "Mezclar harina y azúcar", 5, "Fácil"),
            new Instruccion("INS02", 2, "Hornear a 180 grados", 30, "Media")
        };

        Comentario comentario = new Comentario("C01", "Carlos", "2025-08-21", 4.5);

        // Crear recetas
        Receta receta = new RecetaPostre("Fácil", ingredientes, autor, instrucciones,
                                   20, 40, "Horno", "Postre", 6, "Colombiana",
                                   "Un delicioso bizcocho casero", valor, 1, pais, 2015,
                                   false, comentario, 4.7, 50);

        RecetaPostre recetaPostre = new RecetaPostre("Media", ingredientes, autor, instrucciones,
                                   15, 25, "Horno", "Postre", 4, "Vegana",
                                   "Brownie saludable sin ingredientes animales", valor, 2, pais, 2022,
                                   true, comentario, 4.9, 8);

        // Crear arreglo de recetas con IDs para CRUD
        Receta[] recetas = new Receta[5];

        RecetaPlatoPrincipal plato1 = new RecetaPlatoPrincipal();
        plato1.setTiempoPreparacion(30);
        plato1.setTiempoCoccion(40);
        plato1.setIdReceta(3);

        RecetaPostre postre1 = new RecetaPostre();
        postre1.setTiempoPreparacion(20);
        postre1.setTiempoCoccion(25);
        postre1.setIdReceta(4);

        RecetaPlatoPrincipal plato2 = new RecetaPlatoPrincipal();
        plato2.setTiempoPreparacion(15);
        plato2.setTiempoCoccion(35);
        plato2.setIdReceta(5);

        // Asignar recetas en posiciones del arreglo
        recetas[0] = plato1;
        recetas[1] = postre1;
        recetas[2] = plato2;

        // Agregar receta en la primera posición vacía
        for (int i = 0; i < recetas.length; i++) {
            if (recetas[i] == null) {
                recetas[i] = recetaPostre;
                break;
            }
        }

        // Mostrar arreglo de recetas con tiempos
        System.out.println("\nArreglo de recetas:");
        for (int i = 0; i < recetas.length; i++) {
            if (recetas[i] != null) {
                System.out.println("Posición " + i + " - " + recetas[i].getClass().getSimpleName() +
                                   " | Tiempo total: " + recetas[i].calcularTiempo() + " min");
            } else {
                System.out.println("Posición " + i + " vacía");
            }
        }

        // Demostración de polimorfismo
        System.out.println("\nPOLIMORFISMO");
        mostrarTiempo(recetaPostre);
        Receta demo = crearRecetaDemo();
        mostrarTiempo(demo);

        // CRUD
        OperacionCrud crud = new ImplementacionOperacionCRUD();

        System.out.println("\n===== OPERACIONES CRUD =====");

        // CREATE
        System.out.println("\nCREATE");
        crud.create(receta);
        crud.create(recetaPostre);
        crud.create(plato1);
        crud.create(postre1);
        crud.create(plato2);

        // LISTAR
        System.out.println("\nListado de recetas tras creación:");
        crud.listar();

        // READ
        System.out.println("\nREAD");
        int idBuscar = 2;
        System.out.println("\nBuscando receta con ID " + idBuscar + ":");
        Receta encontrada = crud.read(idBuscar);
        if (encontrada != null) {
            System.out.println(encontrada);
        } else {
            System.out.println("Receta no encontrada.");
        }

        // UPDATE
        System.out.println("\nUPDATE");
        System.out.println("\nActualizando receta con ID 4 (tiempoPreparacion a 50)...");
        Receta recetaActualizar = crud.read(4);
        if (recetaActualizar != null) {
            recetaActualizar.setTiempoPreparacion(50);
            crud.update(4, recetaActualizar);
        }

        // DELETE
        System.out.println("\nDELETE");
        int idEliminar = 3;
        System.out.println("\nEliminando receta con ID " + idEliminar + "...");
        crud.delete(idEliminar);
    }
}

