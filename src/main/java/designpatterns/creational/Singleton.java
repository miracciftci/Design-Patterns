package designpatterns.creational;

/*
Singleton, bir sınıfın yalnızca bir örneği olmasını sağlarken
bu örneğe global bir erişim noktası sağlayan bir tasarım modelidir.
*/

public class Singleton {
    private static Singleton INSTANCE;
    private String info = "Initial value";

    private Singleton() { }

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getInfo());

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setInfo("Changed value");

        System.out.println(singleton2.getInfo());
        System.out.println(singleton1.getInfo());

        /*
        Output:
            Initial value
            Changed value
            Changed value
         */
    }
}
