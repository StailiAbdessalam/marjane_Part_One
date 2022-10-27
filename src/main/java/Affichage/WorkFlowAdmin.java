package Affichage;
import Dao.AdminCenterDao;
import Dao.AdminGeneralDao;
import Models.Centreadmin;
import helpers.Menus;
import helpers.Sout;

public class WorkFlowAdmin {
    public static int FlowAdmin() {
        while (true){
            AdminGeneralDao adminGeneralDao = new AdminGeneralDao();
            AdminCenterDao adminCenterDao = new AdminCenterDao();
            Object[] login = (Object[]) Menus.LoginMenu("Admin General");
            Boolean valideConnection = adminGeneralDao.validateAdminLogin(login);
            if(valideConnection){
                Sout.sout("green","Connection By success");
                int choixAdmin = Menus.GeneralAdminMenu();
                switch (choixAdmin){
                    case 1:
                        Centreadmin admin = Menus.createAdminCenter();
                        adminCenterDao.addadminCenter(admin);
                        Sout.sout("green","your admin added by success");
                        continue;
                    case 2:

                    case 3:
                    case 4:
                        return 0;
                    default:
                        Sout.sout("red","choix invalid");
                }
                break;
            }else {
                Sout.sout("red","Ton information est incorrect");
            }
        }
        return 1;
    }
}
