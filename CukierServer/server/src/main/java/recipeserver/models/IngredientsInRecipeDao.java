package recipeserver.models;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Kamil on 14.05.2017.
 */
@Repository
@Transactional
public class IngredientsInRecipeDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<IngredientsInRecipe> getIngredientsInRecipeByRecipeID(int id) {
        return entityManager.createQuery("from IngredientsInRecipe where recipeID = :id").setParameter("id", id).getResultList();
    }
}
