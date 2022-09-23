import java.util.ArrayList;

public class PrintSubsquenceWhoseSumIsKUsingRecursion {
    public static void f(int ind, ArrayList<Integer> ds, int s, int sum,int arr[],int n){
        if(ind == n ){
            if(s == sum){
                System.out.println(ds);
            }
        }
        else{
            ds.add(arr[ind]);
            s += arr[ind];
            f(ind+1,ds,s,sum,arr,n);
            ds.remove(ds.size()-1);
            s -= arr[ind];
            f(ind+1,ds,s,sum,arr,n);

        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,1,3,4,1,5,6,3,6,3};
        int n=11;
        int sum=6;
        ArrayList<Integer> ds= new ArrayList<>();
        f(0,ds,0,sum,arr,n);
    }
}
