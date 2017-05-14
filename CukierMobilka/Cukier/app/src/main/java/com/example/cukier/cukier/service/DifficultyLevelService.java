package com.example.cukier.cukier.service;

import com.example.cukier.cukier.model.DifficultyLevel;
import com.example.cukier.cukier.model.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Kamil on 14.05.2017.
 */

public interface DifficultyLevelService {

    @GET("levels/{id}")
    Call<DifficultyLevel> getLevelById(@Path("id") int id);
}
