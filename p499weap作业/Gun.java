package p499weap作业;

public class Gun extends Weapon implements Shootable {
    public Gun() {
    }

    public Gun(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println("枪射击！");
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
