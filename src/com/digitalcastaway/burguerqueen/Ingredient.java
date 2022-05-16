package com.digitalcastaway.burguerqueen;

import com.digitalcastaway.utils.IngredientGenerator;

public class Ingredient {
    String name;
    float price;

    public Ingredient(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public static Ingredient createIngredient() {
        return new Ingredient(IngredientGenerator.getRandomPrice(), IngredientGenerator.getRandomIngredient());
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
