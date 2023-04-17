package coffee;

import ItemsInterface.RemoveItems;
import analytics.Display;
import items.Items;

public class Espresso implements ICoffee{

    @Override
    public void buyCoffee() {

        if(Items.getWATER()<25 || Items.getBEANS()<16 ){
            System.out.println("Insufficient items to make Espresso");
        }else{
            System.out.println("Your Espresso is ready");
            RemoveItems removeBeans = (a)->Items.setBEANS(Items.getBEANS()-a);
            removeBeans.remove(16);
            RemoveItems removeWater = (a)->Items.setWATER(Items.getWATER()-a);
            removeWater.remove(25);
            System.out.println("Your Bill is: $4");
            Display.exprAmount+=4;
        }

    }
}
