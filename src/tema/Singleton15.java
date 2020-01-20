package tema;

public class Singleton15 {

    private static Singleton15 singleton15;

    private static Singleton15 getInstance(){
        if (singleton15 == null){
            singleton15 = new Singleton15();
        }
        return singleton15;
    }
    public static void main(String[] args) {

        System.out.println(Singleton15.getInstance());
    }}

