package tema;

public class Singleton18 {

    private static Singleton18 singleton18;

    private static Singleton18 getInstance(){
        if (singleton18 == null){
            singleton18 = new Singleton18();
        }
        return singleton18;
    }
    public static void main(String[] args) {

        System.out.println(Singleton18.getInstance());
    }}

