import java.util.Scanner;
public class fibonacc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n =  10; // sc.nextInt(); // Example input, can be changed to user input
        
        int a = 0, b = 1;
        //System.out.print("Fibonacci sequence: " + a + " " + b);
        
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}