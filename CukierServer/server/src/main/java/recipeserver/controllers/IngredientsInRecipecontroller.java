package recipeserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import recipeserver.models.IngredientsInRecipe;
import recipeserver.models.IngredientsInRecipeDao;

import java.util.List;

/**
 * Created by Kamil on 14.05.2017.
 */
@Controller
public class IngredientsInRecipecontroller {

    @Autowired
    IngredientsInRecipeDao ingredientsInRecipeDao;

    @RequestMapping(value = "/ingredientsInRecipe/{id}")
    @ResponseBody
    public List<IngredientsInRecipe> getIngredientsInRecipeById(@PathVariable int id) {
        return ingredientsInRecipeDao.getIngredientsInRecipeByRecipeID(id);
    }
}
