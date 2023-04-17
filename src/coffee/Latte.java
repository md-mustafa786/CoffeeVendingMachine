package coffee;

import ItemsInterface.RemoveItems;
import analytics.Display;
import items.Items;

public class Latte implements ICoffee{

    @Override
    public void buyCoffee() {
        if(Items.getWATER()<35 || Items.getBEANS()<7.5 || Items.getMILK()<20){
            System.out.println("Insufficient items to make Latte");
        }else{
            System.out.println("your Latte is ready");
            RemoveItems removeMilk = (a)->Items.setMILK(Items.getMILK()-a);
            removeMilk.remove(20);
            RemoveItems removeBeans = (a)->Items.setMILK(Items.getMILK()-a);
            removeBeans.remove(7.5f);
            RemoveItems removeWater = (a)->Items.setMILK(Items.getMILK()-a);
            removeWater.remove(35);
            System.out.println("Your Bill is: $7");
            Display.lattAmount+=7;
        }
    }
}
