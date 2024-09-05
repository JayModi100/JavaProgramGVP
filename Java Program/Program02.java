public class Program02 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                int x = args[i].compareTo(args[j]);
                if (x < 0) {
                    
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }

            }
            for (int j = 0; j < args.length; j++)
            {

                System.out.println(args[j]);
            }
        }
    }
}
