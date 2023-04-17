package coffeMachine;

import analytics.Display;
import analytics.LoginInfo;
import coffee.Cappuccino;
import coffee.Espresso;
import coffee.Latte;

import java.util.Scanner;

public class InputFunction {
    Scanner sc = new Scanner(System.in);
   public void input(){

       System.out.println("\nPress 1 -> Cappuccino \nPress 2 -> Espresso \nPress 3 -> Latte \nPress 4 -> Admin");
       int n = sc.nextInt();
       if(n==1){
           Cappuccino cappuccino = new Cappuccino();
           cappuccino.buyCoffee();
           System.out.println("\nPress 1 ->  Main Menu,  Press 2 -> Exit");
           int k = sc.nextInt();
           if(k==1){
               input();
           }else if(k==2){
               System.exit(0);
           }
       }else if(n==2){
           Espresso espresso = new Espresso();
           espresso.buyCoffee();
           System.out.println("\nPress 1 ->  Main Menu,  Press 2 -> Exit");
           int k = sc.nextInt();
           if(k==1){
               input();
           }else if(k==2){
                   System.exit(0);
               }
       }else if(n==3){
           Latte latte = new Latte();
           latte.buyCoffee();
           System.out.println("\nPress 1 ->  Main Menu,  Press 2 -> Exit");
           int k = sc.nextInt();
           if(k==1){
               input();
           }else if(k==2){

               System.exit(0);
           }else{
               System.out.println("You have entered wrong input");
               System.exit(0);
           }
       }else if(n==4){
           System.out.println("Please enter your Pin");
           int p = sc.nextInt();
           if(p==1234) {
               System.out.println("\nsuccessfully enter admin page\n");
               LoginInfo.loginPage();

           }else{
               System.out.println("you have enter wrong Pin");
               System.exit(0);
           }
       }
       else{
           System.out.println("You have enter wrong input");
           System.exit(0);
       }
   }


}
