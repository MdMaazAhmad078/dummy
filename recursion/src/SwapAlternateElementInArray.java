import java.util.Scanner;

public class SwapAlternateElementInArray {
    public static void swap(int []arr,int n){
        int start = 0;
        int end = start + 1;
        while(end<n){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start+=2;
            end+=2;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[100];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        swap(arr,n);
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
    }
}
