package tema;

public class Singleton9 {

    private static Singleton9 singleton9;

    private static Singleton9 getInstance(){
        if (singleton9 == null){
            singleton9 = new Singleton9();
        }
        return singleton9;
    }
    public static void main(String[] args) {

        System.out.println(Singleton9.getInstance());
    }}

