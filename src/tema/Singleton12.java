package tema;

public class Singleton12 {

    private static Singleton12 singleton12;

    private static Singleton12 getInstance(){
        if (singleton12 == null){
            singleton12 = new Singleton12();
        }
        return singleton12;
    }
    public static void main(String[] args) {

        System.out.println(Singleton12.getInstance());
    }}

