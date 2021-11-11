public class water extends Dragon {
    public String DragonType="Water";

    public void setDragonType () {
        System.out.println("DragonType "+ DragonType);
        System.out.println("ParentDragonType "+ super.DragonType);

    }
}
