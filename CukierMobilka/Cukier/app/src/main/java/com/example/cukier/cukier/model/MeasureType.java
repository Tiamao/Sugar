package com.example.cukier.cukier.model;

/**
 * Created by Kamil on 02.06.2017.
 */

public class MeasureType {

    private int measureTypeID;
    private String measureName;

    public MeasureType() {
    }

    public int getMeasureTypeID() {
        return measureTypeID;
    }

    public void setMeasureTypeID(int measureTypeID) {
        this.measureTypeID = measureTypeID;
    }

    public String getMeasureName() {
        return measureName;
    }

    public void setMeasureName(String measureName) {
        this.measureName = measureName;
    }
}
