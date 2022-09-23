import java.util.Scanner;

public class BinarySearch {
    public static int binarysearch( int [] arr, int n, int key){
        int start = 0;
        int end = n-1;
        int mid = start + ((end - start)/2);

        while (start <= end){
            if (arr[mid] == key){
                  return mid;
            }
            else if (key > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
             mid = start + ((end - start)/2);
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[100];
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(binarysearch(arr, n, key));

    }
}
