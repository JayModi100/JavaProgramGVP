import java.util.Scanner;
class Program01{
	public static void main(String args[]){
		int []arr = new int[5];
		for(int i=0;i<args.length;i++){
			arr[i] = Integer.parseInt(args[i]);
			System.out.println(arr[i]);
		}
	}
}