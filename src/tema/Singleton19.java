package tema;

public class Singleton19 {

    private static Singleton19 singleton19;

    private static Singleton19 getInstance(){
        if (singleton19 == null){
            singleton19 = new Singleton19();
        }
        return singleton19;
    }
    public static void main(String[] args) {

        System.out.println(Singleton19.getInstance());
    }}

