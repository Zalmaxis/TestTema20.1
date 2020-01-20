package tema;

public class Singleton17 {

    private static Singleton17 singleton17;

    private static Singleton17 getInstance(){
        if (singleton17 == null){
            singleton17 = new Singleton17();
        }
        return singleton17;
    }
    public static void main(String[] args) {

        System.out.println(Singleton17.getInstance());
    }}

