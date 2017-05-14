package recipeserver.models;

import javax.persistence.*;

/**
 * Created by Kamil on 14.05.2017.
 */
@Entity
@Table(name ="measureType")
public class MeasureType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
