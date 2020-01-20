package tema;

public class Singleton10 {

    private static Singleton10 singleton10;

    private static Singleton10 getInstance(){
        if (singleton10 == null){
            singleton10 = new Singleton10();
        }
        return singleton10;
    }
    public static void main(String[] args) {

        System.out.println(Singleton10.getInstance());
    }}

