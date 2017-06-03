package com.example.cukier.cukier.service;

import com.example.cukier.cukier.model.DifficultyLevel;
import com.example.cukier.cukier.model.Ingredient;

import java.io.IOException;

import retrofit2.Call;

/**
 * Created by Kamil on 02.06.2017.
 */

public class IngredientServiceManager {

    private IngredientService ingredientService = RetroConnect.getInstance().getRetrofit().create(IngredientService.class);

    private static IngredientServiceManager instance;

    public static IngredientServiceManager getInstance() {
        if (null == instance) {
            synchronized (IngredientServiceManager.class) {
                if (null == instance) {
                    instance = new IngredientServiceManager();
                }
            }
        }
        return instance;
    }

    private IngredientServiceManager() {
    }

    public Ingredient getIngredientByID(int id){
        Call<Ingredient> call = ingredientService.getIngredientByID(id);
        Ingredient ingredient = null;

        try {
            ingredient = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ingredient;
    }
}
