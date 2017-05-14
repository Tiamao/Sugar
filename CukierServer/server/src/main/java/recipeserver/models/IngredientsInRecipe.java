package recipeserver.models;

import javax.persistence.*;

/**
 * Created by Kamil on 14.05.2017.
 */
@Entity
@Table(name = "ingredientsInRecipe")
public class IngredientsInRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ingredientsInRecipeID;
    private int recipeID;
    private int ingredientId;
    private int amount;
    private int measureTypeID;

    public IngredientsInRecipe() {
    }

    public int getIngredientsInRecipeID() {
        return ingredientsInRecipeID;
    }

    public void setIngredientsInRecipeID(int ingredientsInRecipeID) {
        this.ingredientsInRecipeID = ingredientsInRecipeID;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMeasureTypeID() {
        return measureTypeID;
    }

    public void setMeasureTypeID(int measureTypeID) {
        this.measureTypeID = measureTypeID;
    }
}
