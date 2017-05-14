package recipeserver.models;

import javax.persistence.*;

/**
 * Created by Kamil on 14.05.2017.
 */
@Entity
@Table(name ="difficultylevel")
public class DifficultyLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
