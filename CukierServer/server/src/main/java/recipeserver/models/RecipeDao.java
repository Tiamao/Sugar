package recipeserver.models;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Kamil on 13.05.2017.
 */

@Repository
@Transactional
public class RecipeDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Recipe> getAllRecipes() {
        return entityManager.createQuery("from Recipe").getResultList();
    }
}
