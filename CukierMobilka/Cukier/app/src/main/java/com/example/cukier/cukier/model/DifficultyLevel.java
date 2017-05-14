package com.example.cukier.cukier.model;

/**
 * Created by Kamil on 14.05.2017.
 */

public class DifficultyLevel {

    private int difficultyLevelID;
    private String level;

    public DifficultyLevel() {
    }

    public int getDifficultyLevelID() {
        return difficultyLevelID;
    }

    public void setDifficultyLevelID(int difficultyLevelID) {
        this.difficultyLevelID = difficultyLevelID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
