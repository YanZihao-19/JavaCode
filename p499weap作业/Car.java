package p499weap作业;

public class Car extends Weapon implements Moveable{
    public Car() {
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("车运输物资！");
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
