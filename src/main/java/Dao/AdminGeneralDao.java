package Dao;


import Models.Admingeneral;

import java.util.List;

import static Utuls.password.checkPassword;
import static helpers.Sout.sout;
public class AdminGeneralDao extends AbstractHibernateDao<Admingeneral> {
    public AdminGeneralDao() {
        tableName = "admingeneral";
        setClazz(Admingeneral.class);
    }
    // find all admins
    public List getAllAdmins() {
        return findAll();
    }

    // find one admin by id
    public Admingeneral getAdminById(long id) {
        return findOne(id);
    }

    // find one admin by email
    public Admingeneral getAdminByEmail(String email) {
        return jpaService.runInTransaction(entityManager -> {
            return entityManager.createQuery("select a from Admingeneral a WHERE a.agemail = :email", Admingeneral.class)
                    .setParameter("email", email)
                    .getSingleResult();
        });
    }

    // find one admin by email and password
    public boolean validateAdminLogin(Object[] login){
        String email = (String) login[0];
        String password = (String) login[1];
        Admingeneral admin = getAdminByEmail(email);
        if (admin != null){
            sout("green","email valid");
        }else {
            sout("red","wrong email");
        }
        assert admin != null;
        if (checkPassword(password, admin.getAgpassword())){
            sout("green","connected with success");
            return true;
        }else {
            sout("red","wrong password");
            return false;
        }
    }
    // create admin
    public void createAdmin(Admingeneral admin) {
        create(admin);
    }

    // update admin
    public Admingeneral updateAdmin(Admingeneral admin) {
        return update(admin);
    }

    // delete admin
    public void deleteAdmin(Admingeneral admin) {
        delete(admin);
    }

    // delete admin by id
    public void deleteAdminById(long id) {
        deleteById(id);
    }
}


