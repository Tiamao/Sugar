package com.example.cukier.cukier.service;

import com.example.cukier.cukier.model.Ingredient;
import com.example.cukier.cukier.model.IngredientsInRecipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Kamil on 02.06.2017.
 */

public interface IngredientsInRecipeService {

    @GET("ingredientsInRecipe/{id}")
    Call<List<IngredientsInRecipe>> getIngredientsInRecipe(@Path("id") int id);
}
