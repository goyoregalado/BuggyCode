package com.digitalcastaway.utils;

public class IngredientGenerator {

    private final static float MAX_PRICE = 2.0f;
    private final static String []INGREDIENT_NAMES = {
            "Tomate",
            "Lechuga",
            "Cebolla",
            "Jamón",
            "Bacon",
            "Queso Cheddar",
            "Queso de cabra",
            "Cebolla caramelizada",
            "Piña",
            "Huevo"
    };

    public static String getRandomIngredient() {
        return INGREDIENT_NAMES[(int) (Math.random() * INGREDIENT_NAMES.length)];
    }

    public static float getRandomPrice() {
        float randomValue = (float) ((Math.random() * MAX_PRICE) + 0.25)
        return 0.0f;
    }
}
