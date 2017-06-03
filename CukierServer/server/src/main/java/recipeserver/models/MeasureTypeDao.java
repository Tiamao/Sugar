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
public class MeasureTypeDao {

    @PersistenceContext
    private EntityManager entityManager;

    public MeasureType getMeasureType(int id) {
        return (MeasureType) entityManager.createQuery("from MeasureType where measureTypeID = :id").setParameter("id", id).getSingleResult();
    }
}
