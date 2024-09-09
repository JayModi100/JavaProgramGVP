
class NegativeValueException extends Exception {
    NegativeValueException(String s) {
        super(s);
    }
}

public class Program11 {

    public static void main(String[] args) {
        int number[] = new int[args.length];
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