package tema;

public class Singleton2 {

    private static Singleton2 singleton2;

    private static Singleton2 getInstance(){
        if (singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    public static void main(String[] args) {

        System.out.println(Singleton2.getInstance());
    }
}

