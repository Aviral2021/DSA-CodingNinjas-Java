import java.util.Scanner;

public class  Q01_Fibonacci {


    static int factorial(int n){
        if(n == 0) return 1;
        int smallOutput = factorial(n - 1);
        return n * smallOutput;
    }


    public static void main(String[] args){

        // Create Scanner object from input
        Scanner sc = new Scanner(System.in);

        // Initialize variable
        int n;
        n = sc.nextInt();

        int output = factorial(n);

        System.out.println(output);
    }
}