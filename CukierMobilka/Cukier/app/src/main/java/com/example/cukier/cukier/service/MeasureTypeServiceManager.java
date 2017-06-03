package com.example.cukier.cukier.service;

import com.example.cukier.cukier.model.MeasureType;

import java.io.IOException;

import retrofit2.Call;

/**
 * Created by Kamil on 02.06.2017.
 */

public class MeasureTypeServiceManager {

    private MeasureTypeService ingredientService = RetroConnect.getInstance().getRetrofit().create(MeasureTypeService.class);

    private static MeasureTypeServiceManager instance;

    public static MeasureTypeServiceManager getInstance() {
        if (null == instance) {
            synchronized (MeasureTypeServiceManager.class) {
                if (null == instance) {
                    instance = new MeasureTypeServiceManager();
                }
            }
        }
        return instance;
    }

    private MeasureTypeServiceManager() {
    }

    public MeasureType getMeasureType(int id){
        Call<MeasureType> call = ingredientService.getMeasureType(id);
        MeasureType measureType = null;

        try {
            measureType = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return measureType;
    }
}
