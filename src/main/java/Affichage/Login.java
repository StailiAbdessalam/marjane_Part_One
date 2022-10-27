package Affichage;

import Controllers.LoginController;

import java.util.Scanner;

public class Login {
    private String User;
    public Login(String User) {
        this.User= User;
    }
    public void  singin(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre your email :");
        String email = scan.nextLine();
        System.out.println("Entre your password");
        String password = scan.nextLine();
        LoginController login = new LoginController(password,email,this.User);
    }
}
