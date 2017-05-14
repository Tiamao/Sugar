package com.example.cukier.cukier.comparators;

import com.example.cukier.cukier.model.Recipe;

import java.util.Comparator;

/**
 * Created by Kamil on 14.05.2017.
 */

public class RecipeLevelComparator implements Comparator<Recipe> {

    @Override
    public int compare(Recipe o1, Recipe o2) {
        int startComparison = compare(o1.getDifficultyLevelID(), o2.getDifficultyLevelID());
        return startComparison;
    }

    private int compare(int level1, int level2) {
        return level1 < level2 ? -1 : level1 > level2 ? 1 : 0;
    }
}
