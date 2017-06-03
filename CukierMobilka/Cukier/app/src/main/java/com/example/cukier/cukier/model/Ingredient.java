package com.example.cukier.cukier.model;

/**
 * Created by Kamil on 02.06.2017.
 */

public class Ingredient {

    private int ingredientID;
    private String name;

    public Ingredient() {
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
