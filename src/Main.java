import com.digitalcastaway.burguerqueen.Burguer;
import com.digitalcastaway.burguerqueen.Ingredient;
import com.digitalcastaway.utils.AsciiArtUtils;

import java.util.Scanner;

/*
* El siguiente código debería funcionar.
* Como expertos cazadores de bugs, tenemos que encontrar cada uno
* de los errores y resolverlos.
*
* Comienza a buscar de manera sistemática e intenta resolver un bug
* cada vez.
* */

public class Main {

    public static void main(String[] args) {

        boolean salir = true;
        Burguer theBurguer = null;

        Scanner sc = new Scanner(System.in);
        String userInput = "";

        while (!salir) {
            System.out.println("Burguer Queen sección de i + d");
            System.out.println("1- Generar nueva hamburguesa");
            System.out.println("2- Mostrar hamburguesa");
            System.out.println("3- Añadir ingrediente");
            System.out.println("4- Eliminar último ingrediente");
            System.out.println("Q- Salir");

            userInput = sc.nextLine();

            switch (userInput) {
                case "1":
                    System.out.println("Creando nueva hamburguesa");
                    theBurguer = Burguer.createHamburguer();
                    System.out.println("La hamburguesa está lista");
                    break;

                case "2":
                    if (theBurguer == null) {
                        System.out.println("Debe crear una hamburguesa primero");
                    } else {
                        theBurguer.showIngredients();
                    }
                    break;

                case "3":
                    if (theBurguer == null) {
                        System.out.println("Debe crear una hamburguesa primero");
                    } else {
                        System.out.println("Creando nuevo ingrendiente");
                        Ingredient newIngredient = Ingredient.createIngredient();
                        System.out.println("Añadiendo " + newIngredient + "a la hamburguesa");
                        theBurguer.addIngredient(newIngredient);
                    }

                case "4":
                    if (theBurguer == null) {
                        System.out.println("Debe crear una hamburguesa primero");
                    }
                    else {
                        System.out.println("La receta aún no era perfecta");
                        System.out.println("Retirando último ingrediente");
                        theBurguer.deleteLastIngredient();
                    }
                    break;

                case "Q":
                    System.out.println("Saliendo de la aplicación...");
                    salir = true;
                    break;

                default:
                    System.out.println("Seleccione una opción válida");
                    System.out.println("¿No serás un espía de MacMickeys no?");
            }


        }
    }
}
