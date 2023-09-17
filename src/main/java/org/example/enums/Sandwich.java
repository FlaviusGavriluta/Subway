package org.example.enums;

import java.util.List;

public enum Sandwich {
    SALAMI_SANDWICH(List.of(Ingredient.BREAD,Ingredient.SALAMI)),
    SALAD_SANDWICH(List.of(Ingredient.BREAD,Ingredient.SALAD)),
    OLIVE_SANDWICH(List.of(Ingredient.BREAD,Ingredient.OLIVES));

    private final List<Ingredient> ingredients;

    Sandwich(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
