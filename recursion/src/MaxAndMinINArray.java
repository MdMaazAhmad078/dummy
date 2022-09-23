import java.util.Scanner;

public class MaxAndMinINArray {
    public static int maxValue(int []arr,int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int minValue(int []arr,int n){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = sc.nextInt();
        int []arr = new int[100];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum value in array is:");
        System.out.println(maxValue(arr,n));
        System.out.println("Minimum value in array is:");
        System.out.println(minValue(arr,n));
    }
}
