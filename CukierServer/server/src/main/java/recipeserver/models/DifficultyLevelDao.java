package recipeserver.models;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Kamil on 14.05.2017.
 */
@Repository
@Transactional
public class DifficultyLevelDao {

    @PersistenceContext
    private EntityManager entityManager;

    public DifficultyLevel getLevelById(int id){
        return (DifficultyLevel) entityManager.createQuery("from DifficultyLevel where difficultyLevelID = :id").setParameter("id", id).getSingleResult();
    }
}
