public class DisplayArguments {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Pls enter arguments");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "]: " + args[i]);
            }
        }
    }
}
