package com.example.cukier.cukier.service;

import com.example.cukier.cukier.model.DifficultyLevel;
import com.example.cukier.cukier.model.Ingredient;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Kamil on 02.06.2017.
 */

public interface IngredientService {

    @GET("ingredients/{id}")
    Call<Ingredient> getIngredientByID(@Path("id") int id);
}
