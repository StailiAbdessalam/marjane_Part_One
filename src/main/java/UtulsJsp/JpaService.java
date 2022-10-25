package UtulsJsp;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class JpaService {
    private static JpaService instance;
        private EntityManagerFactory entityManagerFactory;
    private JpaService(){
        entityManagerFactory = Persistence.createEntityManagerFactory("marjanTest");
    }
    public static synchronized JpaService getInstance(){
        return instance == null ? instance= new JpaService() : instance;
    }
    public void shutdown(){
        if(entityManagerFactory!=null){
            entityManagerFactory.close();
        }
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
