package Dao;

import Models.Centreadmin;

import java.util.List;



public class AdminCenterDao extends AbstractHibernateDao<Centreadmin> {
    public AdminCenterDao() {
        tableName = "centreadmin";
        setClazz(Centreadmin.class);
    }

    public boolean validateadminGeneralLogin(Object[] login){
        String email = (String) login[0];
        String password = (String) login[1];
        return jpaService.runInTransaction(entityManager -> {
            return entityManager.createQuery("select s from Centreadmin s WHERE s.caemail = :email and s.capassword = :password", Centreadmin.class)
                    .setParameter("email", email)
                    .setParameter("password", password)
                    .getResultList().size() > 0;
        });
    }
    // find all superAdmins
    public List getAlladminGenerals() {
        return findAll();
    }

    // find one superAdmin by id
    public Centreadmin getadminGeneralById(long id) {
        return findOne(id);
    }
    // find one superAdmin by email
    public Centreadmin getadminGeneralByEmail(String email) {
        return jpaService.runInTransaction(entityManager -> {
            return entityManager.createQuery("select s from Centreadmin s WHERE s.caemail = :email", Centreadmin.class)
                    .setParameter("email", email)
                    .getSingleResult();
        });
    }
    public void addadminCenter(Centreadmin centreadmin){
        create(centreadmin);
    }
    // delete superAdmin
    public void deleteadminGeneral(Centreadmin centerAdmin) {
        delete(centerAdmin);
    }
    // delete superAdmin by id
    public void deleteadminGeneralById(long id) {
        deleteById(id);
    }

}
