package p499weap作业;

public class Army {
    private Weapon[] Weapon;

    public p499weap作业.Weapon[] getWeapon() {
        return Weapon;
    }

    public void setWeapon(p499weap作业.Weapon[] weapon) {
        Weapon = weapon;
    }

    public Army(int num) {
        Weapon = new Weapon[num];
    }

    public Army() {
    }

    public void addWeapon(Weapon w) throws WeaponFullException {
        for (int i = 0; i < Weapon.length; i++) {
            if (null == Weapon[i]) {
                Weapon[i] = w;
                System.out.println(w+"装备成功！");
                return;
            }
        }
        throw new WeaponFullException(w+"装备失败，武器已存满！");
    }

    public void attackAll(Weapon[] w) {
        for (int i = 0; i < w.length; i++) {
            if (Weapon[i] instanceof Shootable) {
                Shootable s = (Shootable) Weapon[i];
                s.shoot();
            }
        }
    }

    public void moveAll(Weapon[] w) {
        for (int i = 0; i < w.length; i++)
            if (Weapon[i] instanceof Moveable) {
                Moveable m = (Moveable) Weapon[i];
                m.move();
            }
    }



}