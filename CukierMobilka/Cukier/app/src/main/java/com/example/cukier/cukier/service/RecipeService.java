package com.example.cukier.cukier.service;

import com.example.cukier.cukier.model.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Kamil on 13.05.2017.
 */

public interface RecipeService {

    @GET("recipes")
    Call<List<Recipe>> getRecipes();
}
