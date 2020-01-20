package tema;

public class Singleton7 {

    private static Singleton7 singleton7;

    private static Singleton7 getInstance(){
        if (singleton7 == null){
            singleton7 = new Singleton7();
        }
        return singleton7;
    }
    public static void main(String[] args) {

        System.out.println(Singleton7.getInstance());
    }}

