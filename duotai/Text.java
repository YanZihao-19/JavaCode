package duotai;

public class Text {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.sport();
        Cat c2 = (Cat) c;        //向下转型！！可以减少创建对象的数量？？？
        c2.eat();
        c.sport();
    /* Cat c=new Cat();
        c.sport();
        Cat c2= c;
        c2.eat();
        c.sport();*/                    //为什么不这样用呢？

    }
}
