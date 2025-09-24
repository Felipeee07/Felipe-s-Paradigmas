package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.model.*;

public class Cliente {

    public static void mostrarTiempo(Receta receta) {
        System.out.println(
            receta.getClass().getSimpleName() +
            " | Tiempo total: " + receta.calcularTiempo() + " min"
        );
    }

   
    public static Receta crearRecetaDemo() {
        RecetaPostre demo = new RecetaPostre();
        demo.setTiempoPreparacion(10);
        demo.setTiempoCoccion(15);
        return demo; 
    }

    public static void main(String[] args) {
        
        Pais pais = new Pais("CO", "Colombia");

        Autor autor = new Autor("Juan Pérez", pais, "123456", 30, 10, "juanperez@email.com");

        ValorNutricional valor = new ValorNutricional(200, 10, 5, 25);

        Ingrediente[] ingredientes = {
            new Ingrediente("I01", "Harina", "500g", "Neutro", "Base", true),
            new Ingrediente("I02", "Azúcar", "200g", "Dulce", "Endulzante", true)
        };

        Instruccion[] instrucciones = {
            new Instruccion("INS01", 1, "Mezclar harina y azúcar", 5, "Fácil"),
            new Instruccion("INS02", 2, "Hornear a 180 grados", 30, "Media")
        };

        Comentario comentario = new Comentario("C01", "Carlos", "2025-08-21", 4.5);

        Receta receta = new Receta("Fácil", ingredientes, autor, instrucciones,
                                   20, 40, "Horno", "Postre", 6, "Colombiana",
                                   "Un delicioso bizcocho casero", valor, 1, pais, 2015,
                                   false, comentario, 4.7);

    
        RecetaPostre recetaPostre = new RecetaPostre("Media", ingredientes, autor, instrucciones,
                                   15, 25, "Horno", "Postre", 4, "Vegana",
                                   "Brownie saludable sin ingredientes animales", valor, 2, pais, 2022,
                                   true, comentario, 4.9, 8);

     
        System.out.println("\nRECETA NORMAL");
        System.out.println(receta);  
       
        System.out.println("Edad de la receta: " + receta.calcularEdadActual() + " años");

        System.out.println("\nRECETA POSTRE COMPLETA");
        System.out.println(recetaPostre);  
        
        System.out.println("Edad de la receta postre: " + recetaPostre.calcularEdadActual() + " años");
  

        Receta[] recetas = new Receta[5];

        RecetaPlatoPrincipal plato1 = new RecetaPlatoPrincipal();
        plato1.setTiempoPreparacion(30);
        plato1.setTiempoCoccion(40);

        RecetaPostre postre1 = new RecetaPostre();
        postre1.setTiempoPreparacion(20);
        postre1.setTiempoCoccion(25);

        RecetaPlatoPrincipal plato2 = new RecetaPlatoPrincipal();
        plato2.setTiempoPreparacion(15);
        plato2.setTiempoCoccion(35);

        recetas[0] = plato1;
        recetas[1] = postre1;
        recetas[2] = plato2;
        recetas[3] = null; 
        recetas[4] = null; 

        System.out.println("\n Arreglo");
 
       
        for (int i = 0; i < recetas.length; i++) {
            if (recetas[i] != null) {
                System.out.println(
                    "Posición " + i + " -" +
                    recetas[i].getClass().getSimpleName() +
                    " | Tiempo total: " + recetas[i].calcularTiempo() + " min"
                );
            } else {
                System.out.println("Posición " + i + " vacía");
            }
        }
        
        System.out.println("\n POLIMORFISMO ");
        mostrarTiempo(recetaPostre);  
        Receta demo = crearRecetaDemo(); 
        mostrarTiempo(demo);             
    }
}

