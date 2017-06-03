package recipeserver.models;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Kamil on 02.06.2017.
 */
@Repository
@Transactional
public class IngredientDao {
    @PersistenceContext
    private EntityManager entityManager;

    public Ingredient getIngredientsInRecipe(int ingredientID){
        return (Ingredient) entityManager.createQuery("from Ingredient where ingredientID = :ingredientID").setParameter("ingredientID", ingredientID).getSingleResult();
    }

}
