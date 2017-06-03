package recipeserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import recipeserver.models.Ingredient;
import recipeserver.models.IngredientDao;

/**
 * Created by Kamil on 02.06.2017.
 */
@Controller
public class IngredientController {

    @Autowired
    private IngredientDao ingredientDao;

    @RequestMapping(value = "/ingredients/{id}")
    @ResponseBody
    public Ingredient getIngredientByID(@PathVariable int id) {
        return ingredientDao.getIngredientsInRecipe(id);
    }
}
