import java.util.Scanner;

public class SumOfAllelementsOfArray {
    public static int sumElement(int []arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumElement(arr,n));
    }
}
