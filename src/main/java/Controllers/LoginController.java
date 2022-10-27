package Controllers;

import Utuls.JpaService;
import jakarta.persistence.EntityManager;

public class LoginController {
    private String tableName;
    private String Email;
    private String password;

    public LoginController(String tableName, String email, String password) {
        this.tableName = tableName;
        this.Email = email;
        this.password = password;
    }

    public void validateCompte(){
        JpaService jpaService = new JpaService();
        EntityManager entityManager = jpaService.getEntityManager();






    }
}
