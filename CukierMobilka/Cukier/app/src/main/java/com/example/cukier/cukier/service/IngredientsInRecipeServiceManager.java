package com.example.cukier.cukier.service;

import com.example.cukier.cukier.model.Ingredient;
import com.example.cukier.cukier.model.IngredientsInRecipe;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Created by Kamil on 02.06.2017.
 */

public class IngredientsInRecipeServiceManager {

    private IngredientsInRecipeService ingredientService = RetroConnect.getInstance().getRetrofit().create(IngredientsInRecipeService.class);

    private static IngredientsInRecipeServiceManager instance;

    public static IngredientsInRecipeServiceManager getInstance() {
        if (null == instance) {
            synchronized (IngredientsInRecipeServiceManager.class) {
                if (null == instance) {
                    instance = new IngredientsInRecipeServiceManager();
                }
            }
        }
        return instance;
    }

    private IngredientsInRecipeServiceManager() {
    }

    public List<IngredientsInRecipe> getIngredientsInRecipe(int id){
        Call<List<IngredientsInRecipe>> call = ingredientService.getIngredientsInRecipe(id);
        List<IngredientsInRecipe> ingredient = null;

        try {
            ingredient = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ingredient;
    }
}
