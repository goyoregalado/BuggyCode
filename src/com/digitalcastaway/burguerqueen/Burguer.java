package com.digitalcastaway.burguerqueen;

import com.digitalcastaway.utils.AsciiArtUtils;
import com.digitalcastaway.utils.GenericStack;

public class Burguer implements BurguerInterface {
    private static final int MAX_INGREDIENTS = 4;

    String name;
    GenericStack<Ingredient> ingredients;

    public Burguer(String name) {
        this.name = name;
        ingredients = new GenericStack<Ingredient>();
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        System.out.println("Añadiendo : " + ingredient + " a una hamburguesa " + name);
        ingredients.push(ingredient);
    }

    @Override
    public void showIngredients() {
        System.out.println(AsciiArtUtils.getUpperBread());
        System.out.println(ingredients);
        System.out.println(AsciiArtUtils.getLowerBread());
    }

    @Override
    public void deleteLastIngredient(int index) {
        Ingredient ingredient = ingredients.pop();
        System.out.println("Eliminando : " + ingredient + " a una hamburguesa " + name);
    }

    public static Burguer createHamburguer() {
        Burguer myBurguer = new Burguer("McNífica");

        int numIngredients = (int )(Math.random() * MAX_INGREDIENTS) + 1;
        for (int i = 0; i < numIngredients; i++) {
            myBurguer.addIngredient(Ingredient.createIngredient());

        }
        return myBurguer;
    }
}
