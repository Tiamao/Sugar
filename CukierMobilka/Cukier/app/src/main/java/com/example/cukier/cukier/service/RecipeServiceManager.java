package com.example.cukier.cukier.service;

import com.example.cukier.cukier.model.Recipe;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Created by Kamil on 13.05.2017.
 */

public class RecipeServiceManager {

    private RecipeService recipeService = RetroConnect.getInstance().getRetrofit().create(RecipeService.class);

    private static RecipeServiceManager instance;

    public static RecipeServiceManager getInstance() {
        if (null == instance) {
            synchronized (RecipeServiceManager.class) {
                if (null == instance) {
                    instance = new RecipeServiceManager();
                }
            }
        }
        return instance;
    }

    private RecipeServiceManager() {
    }

    public List<Recipe> getRecipes() {
        Call<List<Recipe>> call = recipeService.getRecipes();
        List<Recipe> recipes = null;

        try {
            recipes = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return recipes;
    }
}
