public class MainClass {

    public static void main(String[] args) {
        countdown(5);
    }

    static void countdown(int n){
        for(; n > 0; n--){
            System.out.println("Start in " + n);
        }
    }
}
