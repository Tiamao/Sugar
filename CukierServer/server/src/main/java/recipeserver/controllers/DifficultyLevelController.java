package recipeserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import recipeserver.models.DifficultyLevel;
import recipeserver.models.DifficultyLevelDao;

/**
 * Created by Kamil on 14.05.2017.
 */
@Controller
public class DifficultyLevelController {

    @Autowired
    DifficultyLevelDao difficultyLevelDao;

    @RequestMapping(value = "/levels/{id}")
    @ResponseBody
    public DifficultyLevel getPasswordByPesel(@PathVariable int id) {
        return difficultyLevelDao.getLevelById(id);
    }
}
