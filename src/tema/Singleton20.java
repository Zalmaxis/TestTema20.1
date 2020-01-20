package tema;

public class Singleton20 {

    private static Singleton20 singleton20;

    private static Singleton20 getInstance(){
        if (singleton20 == null){
            singleton20 = new Singleton20();
        }
        return singleton20;
    }
    public static void main(String[] args) {

        System.out.println(Singleton20.getInstance());
    }}

