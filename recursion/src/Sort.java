
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Sort {


       public static int kthSmallest(int arr[], int l, int r, int k) {

            Arrays.sort(arr);
            return arr[k - 1];
        }

        public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int K = sc.nextInt();
           int N= sc.nextInt();
           int [] arr = new int[N];
           for(int i=0;i<N;i++){
               arr[i]=sc.nextInt();
           }
            System.out.println(kthSmallest(arr,0,N-1,K));
        }
}



