package tema;

public class Singleton6 {

    private static Singleton6 singleton6;

    private static Singleton6 getInstance(){
        if (singleton6 == null){
            singleton6 = new Singleton6();
        }
        return singleton6;
    }
    public static void main(String[] args) {

        System.out.println(Singleton6.getInstance());
    }}

