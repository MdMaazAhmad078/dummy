import java.util.ArrayList;

public class CountTheSubSequenceWithSumKUsingrecursion {
    public static int f(int ind, int s, int sum, int arr[], int n){
        if(ind == n ){
            if(s == sum){
              return 1;
            }
            return 0;
        }

            s += arr[ind];
          int l =  f(ind+1,s,sum,arr,n);
            s -= arr[ind];
          int r =  f(ind+1,s,sum,arr,n);

        return  l+ r;
    }
    public static void main(String[] args){
        int arr[] = {1,2,1};
        int n=3;
        int sum=2;
        System.out.println(f(0,0,sum,arr,n));
    }
}
