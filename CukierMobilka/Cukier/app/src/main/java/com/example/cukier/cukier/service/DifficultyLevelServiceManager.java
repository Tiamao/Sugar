package com.example.cukier.cukier.service;

import com.example.cukier.cukier.model.DifficultyLevel;

import java.io.IOException;

import retrofit2.Call;

/**
 * Created by Kamil on 14.05.2017.
 */

public class DifficultyLevelServiceManager {

    private DifficultyLevelService difficultyLevelService = RetroConnect.getInstance().getRetrofit().create(DifficultyLevelService.class);

    private static DifficultyLevelServiceManager instance;

    public static DifficultyLevelServiceManager getInstance() {
        if (null == instance) {
            synchronized (DifficultyLevelServiceManager.class) {
                if (null == instance) {
                    instance = new DifficultyLevelServiceManager();
                }
            }
        }
        return instance;
    }

    private DifficultyLevelServiceManager() {
    }

    public DifficultyLevel getLevelById(int id){
        Call<DifficultyLevel> call = difficultyLevelService.getLevelById(id);
        DifficultyLevel difficultyLevel = null;

        try {
            difficultyLevel = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return difficultyLevel;
    }
}
