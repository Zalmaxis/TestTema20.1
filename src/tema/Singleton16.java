package tema;

public class Singleton16 {

    private static Singleton16 singleton16;

    private static Singleton16 getInstance(){
        if (singleton16 == null){
            singleton16 = new Singleton16();
        }
        return singleton16;
    }
    public static void main(String[] args) {

        System.out.println(Singleton16.getInstance());
    }}

