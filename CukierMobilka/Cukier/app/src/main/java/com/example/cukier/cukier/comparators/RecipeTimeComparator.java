package com.example.cukier.cukier.comparators;

import com.example.cukier.cukier.model.Recipe;

import java.util.Comparator;

/**
 * Created by Kamil on 14.05.2017.
 */

public class RecipeTimeComparator implements Comparator<Recipe> {
    @Override
    public int compare(Recipe o1, Recipe o2) {
        int startComparison = compare(o1.getPreparationTime(), o2.getPreparationTime());
        return startComparison;
    }

    private int compare(int preparationTime, int preparationTime1) {
        return preparationTime < preparationTime1 ? -1 : preparationTime > preparationTime1 ? 1 : 0;
    }
}
