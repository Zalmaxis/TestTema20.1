package tema;

public class Singleton11 {

    private static Singleton11 singleton11;

    private static Singleton11 getInstance(){
        if (singleton11 == null){
            singleton11 = new Singleton11();
        }
        return singleton11;
    }
    public static void main(String[] args) {

        System.out.println(Singleton11.getInstance());
    }}

