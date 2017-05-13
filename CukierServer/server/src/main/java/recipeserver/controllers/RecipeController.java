package recipeserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import recipeserver.models.Recipe;
import recipeserver.models.RecipeDao;

import java.util.List;

/**
 * Created by Kamil on 13.05.2017.
 */
@Controller
public class RecipeController {

    @Autowired
    private RecipeDao recipeDao;

    @RequestMapping(value = "/recipes", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Recipe> getAllRecipes() {
        return recipeDao.getAllRecipes();
    }
}
