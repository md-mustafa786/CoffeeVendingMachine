package analytics;

import java.util.Scanner;

public class LoginInfo {
    static Scanner sc = new Scanner(System.in);
    public static void loginPage(){


            System.out.println("\nPress 1 -> Total earning history  \nPress 2 -> CheckItems  \nPress 3 -> Exit");
            int i = sc.nextInt();
            Display d = new Display();
            if (i == 1) {
                d.calculation();
                d.totalAmount();
                System.out.println("\nPress 1 -> Main menu  \nPress 2 -> Exit");
                int j = sc.nextInt();
                if(j==1){
                   loginPage();
                }else if(j==2){
                    System.exit(0);
                }
            } else if (i == 2) {
                d.checkedItems();
                System.out.println("\nPress 1 -> Main menu  \nPress 2 -> Exit\n");
                int k = sc.nextInt();
                if(k==1){
                    loginPage();
                }else if(k==2){
                    System.exit(0);
                }
            } else if (i == 3) {
                System.exit(0);
            } else {
                System.out.println("Please enter correct input\n");
                loginPage();
            }
    }
}
