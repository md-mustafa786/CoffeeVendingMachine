package coffee;


import ItemsInterface.RemoveItems;
import analytics.Display;
import items.Items;

public class Cappuccino implements ICoffee{

    @Override
    public void buyCoffee() {
        if(Items.getWATER()<20 || Items.getBEANS()<10 || Items.getMILK()<15){
            System.out.println("Insufficient items to make Cappuccino");
        }else{
            System.out.println("\nyour Cappuccino is ready");
            RemoveItems removeMilk = (a)->Items.setMILK(Items.getMILK()-a);
            removeMilk.remove(15);
            RemoveItems removeBeans = (a)->Items.setBEANS(Items.getBEANS()-a);
            removeBeans.remove(10);
            RemoveItems removeWater = (a)->Items.setWATER(Items.getWATER()-a);
            removeWater.remove(20);
            System.out.println("Please pay your Bill amount: $6");
            Display.capAmount+=6;
        }
    }
}
