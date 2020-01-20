package tema;

public class Singleton3 {

    private static Singleton3 singleton3;

    private static Singleton3 getInstance(){
        if (singleton3 == null){
            singleton3 = new Singleton3();
        }
        return singleton3;
    }

    public static void main(String[] args) {

        System.out.println(Singleton3.getInstance());
    }
}

