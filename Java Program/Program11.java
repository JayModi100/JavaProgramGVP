
class NegativeValueException extends Exception {
    NegativeValueException(String s) {
        super(s);
    }
}

public class Program11 {

    public static void main(String[] args) {
        int number[] = new int[args.length];
        // int number[] = {10,20,30,40,50,-10,20};
        try {

            for (int i = 0; i < number.length; i++) {
                number[i] = Integer.parseInt(args[i]);
                if (number[i] < 0) {
                    throw new NegativeValueException(number[i] + " is negative");
                }
            }
        } catch (Exception e) {
           System.out.println("Error : "+ e.getMessage());
        }
    }
}