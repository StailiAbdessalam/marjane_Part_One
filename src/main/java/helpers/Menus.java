package helpers;

import Models.Center;
import Models.Centreadmin;
import Utuls.Password;

public class Menus {
    // login menu as SuperAdmin or Admin or manager
    public static int MenuGlobal() {
        printScan.println("------------------- Login Menu -------------------");
        printScan.println("1. Login as Admin General");
        printScan.println("2. Login as Admin Center");
        printScan.println("3. Login as Manager");
        printScan.println("4. Exit");
        printScan.println("-------------------------------------------------");
        printScan.print("Enter your choice: ");
        return printScan.scan().nextInt();
    }
    //menu of login
    public static Object LoginMenu(String role) {
        printScan.println("------------------- "+role+" Login Menu -------------------");
        printScan.println("Enter your email: ");
        String email = printScan.scan().nextLine();
        printScan.println("Enter your password: ");
        String password = printScan.scan().nextLine();
        return new Object[]{email, password};
    }
    public static int GeneralAdminMenu() {
        printScan.println("------------------- General Admin Menu -------------------");
        printScan.println("1. Create Admin Center");
        printScan.println("2. Delete Admin centrer");
        printScan.println("3. Statistics");
        printScan.println("4. Exit");
        printScan.println("-------------------------------------------------");
        printScan.print("Enter your choice: ");
        return printScan.scan().nextInt();
    }

    public static int CentralAdminMenu() {
        printScan.println("------------------- Admin Menu -------------------");
        printScan.println("1. Create Manager");
        printScan.println("2. Promotions");
        printScan.println("3. Statistics");
        printScan.println("4. Exit");
        printScan.println("-------------------------------------------------");
        printScan.print("Enter your choice: ");
        return printScan.scan().nextInt();
    }

    public static int managerMainMenu() {
        printScan.println("------------------- Manager Menu -------------------");
        printScan.println("1. Promotions");
        printScan.println("2. Statistics");
        printScan.println("3. Exit");
        printScan.println("-------------------------------------------------");
        printScan.print("Enter your choice: ");
        return printScan.scan().nextInt();
    }

    public static Centreadmin createAdminCenter() {
        printScan.println("------------------- Create Admin Center -------------------");
        printScan.println("Enter Admin full name: ");
        String fullName = printScan.scan().nextLine();
        printScan.println("Enter Admin email: ");
        String email = printScan.scan().nextLine();
        printScan.println("Enter Admin password: ");
        String password = printScan.scan().nextLine();
        printScan.println("Enter id center : ");
        int idcenter = printScan.scan().nextInt();

        String hashedPassword = Password.hashPassword(password);
        return new Centreadmin(idcenter,fullName,email,hashedPassword);
    }
    public static Boolean deleteadmincenter(){
        printScan.println("------------------- Create Admin Center -------------------");
        printScan.println("are you sure you want delete these adminCenter");
        printScan.println("1. Yes");
        printScan.println("2. No");
        int choix = printScan.scan().nextInt();
        switch (choix){
            case 1:
                return true;
            case 2:
                return false;
            default:
                Sout.sout("red","choix invalid");


        }
    }
//
//    public static MarketmanagerEntity createManager() {
//        printScan.println("------------------- Create Manager -------------------");
//        printScan.println("Enter Manager first name: ");
//        String firstName = printScan.scan().nextLine();
//        printScan.println("Enter Manager last name: ");
//        String lastName = printScan.scan().nextLine();
//        printScan.println("Enter Manager email: ");
//        String email = printScan.scan().nextLine();
//        printScan.println("Enter Manager password: ");
//        String password = printScan.scan().nextLine();
//        String hashedPassword =Password.hashPassword(password);
//        return new MarketmanagerEntity(firstName, lastName, email, password);
//    }
}
