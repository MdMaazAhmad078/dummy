import java.util.ArrayList;

public class FindAllSubSequenceOfArrayByRecursion {
    public static void printf(int ind , ArrayList<Integer> ds, int arr[], int n) {
        if (ind >= n) {

            if (ds.size() >= 0) {
                System.out.println(ds);
            }

        }else{
            printf(ind + 1, ds, arr, n);
            ds.add(arr[ind]);
            printf(ind + 1, ds, arr, n);
            ds.remove(ds.size()-1);


    }}
    public static void main(String[] args){
        int arr[] ={3,2,1};
        int n=3;
        ArrayList<Integer> ds =new ArrayList<>();
        printf(0,ds,arr,n);
    }

}
