public class Bell {
    static boolean number;
    public static void sound() {
        if (!number) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        number = !number;
    }
}
