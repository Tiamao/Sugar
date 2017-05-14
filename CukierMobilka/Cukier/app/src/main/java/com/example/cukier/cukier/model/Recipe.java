package com.example.cukier.cukier.model;

import java.io.Serializable;

/**
 * Created by Kamil on 13.05.2017.
 */

public class Recipe implements Serializable{

    private int recipeID;
    private String name;
    private String preparation;
    private String imagePath;
    private int piecesCount;
    private int preparationTime;
    private int difficultyLevelID;

    public Recipe() {
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getPiecesCount() {
        return piecesCount;
    }

    public void setPiecesCount(int piecesCount) {
        this.piecesCount = piecesCount;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public int getDifficultyLevelID() {
        return difficultyLevelID;
    }

    public void setDifficultyLevelID(int difficultyLevelID) {
        this.difficultyLevelID = difficultyLevelID;
    }
}
