package p499weap作业;

public class Tank extends Weapon implements Shootable,Moveable{

    public Tank() {
    }

    public Tank(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("坦克移动！");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮！");
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
