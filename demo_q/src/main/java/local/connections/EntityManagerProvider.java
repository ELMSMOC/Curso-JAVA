package local.connections;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerProvider {

    private final static String PERSISTENCE_UNIT = "demos-q";
    private static EntityManagerProvider entityManagerProvider;

    static {
        Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
    }

    public static EntityManager getEntityManager(){
        return EntityManagerFactory.createEntityManagerFactory();
    }
}
