import java.util.Scanner;

public class findNthFaboncciNumberByRecursio {
    public static int f(int n){
        if(n <= 1){
            return n;
        }
        int last= f(n-1);
        int Slast =f(n-2);
        return last + Slast;
    }
    public static void main (String[] args){
        System.out.println("Enter the Nth postion");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(f(n));

    }
}
