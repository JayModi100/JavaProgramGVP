
// Write a program to read five integer numbers from command line and sort them and display minimum, maximum values out of it.
import java.util.Arrays;

public class Program01 {

    public static int FindMaximum(int arr[]) {
        if (arr.length > 0) {

            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            return 0;
        }
    }
    public static int FindMinimum(int arr[]){
        if(arr.length > 0){
            int min = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(min > arr[i]){
                    min = arr[i];
                }
            }
            return min;
        }else{
            return 0;
        }
    }

    public static void display(int arr[]) {
        System.out.print("Array : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int[] arr = new int[args.length];
        System.out.println("Length : " + arr.length);
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        display(arr);

        // Sort the array
        System.err.println("Sorted Array : ");
        Arrays.sort(arr);
        display(arr);

        // Find the Maximum number
        int maxValue = FindMaximum(arr);
        // System.out.println("Maximum Value : "+arr[arr.length-1]);
        System.out.println("Maximum Value is " + maxValue);

        // Find the Minimum Number
        int minValue = FindMinimum(arr);
        // System.out.println("Minimum Value is " + arr[0]);
        System.out.println("Minimum Value is " + minValue);

    }
}
