package items;

public class AddItems {
    public void add(float addMilk, float addBeans, float addWater){
       Items.setMILK(Items.getMILK()+addMilk);
       Items.setWATER(Items.getWATER()+addWater);
       Items.setBEANS(Items.getBEANS()+addBeans);
    }

}
