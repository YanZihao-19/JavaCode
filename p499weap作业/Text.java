package p499weap作业;

public class Text  {
    public static void main(String[] args) {
        Army a=new Army(3);
        Tank t=new Tank("坦克");
        Car c=new Car("运输车");
        Gun g=new Gun("火枪");
        Plane p=new Plane("战斗机");
        try {
            a.addWeapon(t);
            a.addWeapon(c);
            a.addWeapon(g);
            a.addWeapon(p);
        } catch (WeaponFullException e) {
            e.printStackTrace();
        }

        a.attackAll(a.getWeapon());
        a.moveAll(a.getWeapon());

    }
}
