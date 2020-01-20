package tema;

public class Singleton13 {

    private static Singleton13 singleton13;

    private static Singleton13 getInstance(){
        if (singleton13 == null){
            singleton13 = new Singleton13();
        }
        return singleton13;
    }
    public static void main(String[] args) {

        System.out.println(Singleton13.getInstance());
    }}

