package tema;

public class Singleton8 {

    private static Singleton8 singleton8;

    private static Singleton8 getInstance(){
        if (singleton8 == null){
            singleton8 = new Singleton8();
        }
        return singleton8;
    }
    public static void main(String[] args) {

        System.out.println(Singleton8.getInstance());
    }}

