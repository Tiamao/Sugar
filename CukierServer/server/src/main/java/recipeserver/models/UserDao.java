package recipeserver.models;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Kamil on 02.04.2017.
 */
@Repository
@Transactional
public class UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAll() {
        return entityManager.createQuery("from User").getResultList();
    }

    public User getByPesel(String pesel) {
        return (User) entityManager.createQuery(
                "from User where pesel = :pesel")
                .setParameter("pesel", pesel)
                .getSingleResult();
    }
}
