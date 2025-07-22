package local.repositories;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import local.connections.EntityManagerProvider;

public class AbstractDAO<E> implements DAO<E> {

    EntityManager entityManager;
    Class<E> entityClass;

    public AbstractDAO() {
        entityManager = EntityManagerProvider.getEntityManager();
    }

    public AbstractDAO(Class<E> entityClass) {
        entityManager = EntityManagerProvider.getEntityManager();
        this entityClass = entityClass;
    }

    @Override
    public List<E> findAll() {
        String finalSQL = "FROM " + entityClass.getCanonicalName();
        // Query q = entityManager.createQuery(finalSQL, entityClass);
        return entityManager
            .createQuery(finalSQL, entityManager)

    }

    @Override
    public <ID> Optional<E> findById(ID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public E save(E entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void update(E entity) {
        entityManager.merge(entity)
    }

    @Override
    public void delete(E entity) {
        entityManager.remove(entity);
    }

}
