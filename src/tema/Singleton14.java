package tema;

public class Singleton14 {

    private static Singleton14 singleton14;

    private static Singleton14 getInstance(){
        if (singleton14 == null){
            singleton14 = new Singleton14();
        }
        return singleton14;
    }
    public static void main(String[] args) {

        System.out.println(Singleton14.getInstance());
    }}

