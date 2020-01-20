package tema;

public class Singleton1 {

    private static Singleton1 singleton1;

    private static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    public static void main(String[] args) {

        System.out.println(Singleton1.getInstance());
    }


}
