package analytics;

import ItemsInterface.CheckItems;
import items.Items;

public class Display {
    public static int totalAmount;
   public static int capAmount;
   public static int exprAmount;
   public static int lattAmount;

    public void calculation(){
        System.out.println(" Total cups of Cappuccino sold: "+capAmount/6+"cups" +"  |  total sold amount Cappuccino: $"+capAmount);
        System.out.println(" Total cups of Espresso sold:   "+exprAmount/4+"cups"+"  |  total sold amount Espresso: $"+exprAmount);
        System.out.println(" Total cups of Latte sold:      "+lattAmount/7+"cups"+"  |  total sold amount Latte: $"+lattAmount);

    }

    public void totalAmount(){
        totalAmount=capAmount+exprAmount+lattAmount;
        System.out.println(" \nTotal Earnings: $"+totalAmount);
    }

    public void checkedItems(){
        CheckItems checkBeans = ()-> System.out.println("Available Beans : "+ Items.getBEANS()+" grams");
        checkBeans.cheked();
        CheckItems checkWater = ()-> System.out.println("Available Water : "+ Items.getWATER()+" grams");
        checkWater.cheked();
        CheckItems checkMilk  = ()-> System.out.println("Available Milk  : "+ Items.getMILK()+" grams");
        checkMilk.cheked();
    }

}
