package p499weap作业;

public class Plane extends Weapon implements Moveable,Shootable{
    public Plane() {
    }

    public Plane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("飞机移动！");
    }

    @Override
    public void shoot() {
        System.out.println("飞机射击！");
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
