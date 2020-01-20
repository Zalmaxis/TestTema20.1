package tema;

public class Singleton5 {

    private static Singleton5 singleton5;

    private static Singleton5 getInstance(){
        if (singleton5 == null){
            singleton5 = new Singleton5();
        }
        return singleton5;
    }

    public static void main(String[] args) {

        System.out.println(Singleton5.getInstance());
    }
}

