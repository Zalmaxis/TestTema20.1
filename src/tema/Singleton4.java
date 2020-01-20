package tema;

public class Singleton4 {

    private static Singleton4 singleton4;

    private static Singleton4 getInstance(){
        if (singleton4 == null){
            singleton4 = new Singleton4();
        }
        return singleton4;
    }

    public static void main(String[] args) {

        System.out.println(Singleton4.getInstance());
    }
}

