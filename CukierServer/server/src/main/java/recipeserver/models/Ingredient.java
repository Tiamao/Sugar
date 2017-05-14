package recipeserver.models;

import javax.persistence.*;

/**
 * Created by Kamil on 14.05.2017.
 */
@Entity
@Table(name ="ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
