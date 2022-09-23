import java.util.Scanner;

public class FindDuplicateElementInJava {
    public static int findduplicate(int [] arr, int n){
        int ans = 0;
        for(int i =0; i<n;i++){
            ans = ans ^ arr[i];
        }
        for (int i = 1; i<n;i++){
            ans= ans^i;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            int []arr =new int[n];
            for(int j =0;j<n;j++){
                arr[j]= sc.nextInt();
            }
            System.out.println(findduplicate(arr,n));
        }


    }
}
