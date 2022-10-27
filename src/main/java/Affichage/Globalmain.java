package Affichage;

import java.util.Scanner;
public class Globalmain {
    public static void main(String[] args) {
      while (true){
          System.out.println("choixi votre role");
          System.out.println("1_Admin\n2_Center Admin\n3_manager\n4_quit");
          Scanner scan = new Scanner(System.in);
          int choixRole = scan.nextInt();
          switch (choixRole) {
              case 1:
                  Login loginAdmin = new Login("admingeneral");
                  loginAdmin.singin();
                  break;
              case 2:
                  Login centreadmin = new Login("centreadmin");
                  centreadmin.singin();
                  break;
              case 3:
                  Login manager = new Login("manager");
                  manager.singin();
                  break;
              case 4:
                  System.exit(0);
              default:
                  System.out.println("votre choix invalid");
                  continue;
          }
      }
    }
}
