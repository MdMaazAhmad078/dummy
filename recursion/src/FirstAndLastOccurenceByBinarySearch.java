import java.util.Scanner;
public class FirstAndLastOccurenceByBinarySearch {
    public static int leftOccurance(int [] arr, int n, int key){
        int left = -1;
        int start = 0;
        int end = n-1;
        int mid =start + ((end - start)/2);
        while(start <= end){
            if(arr[mid] == key){
                left = mid;
                end = mid-1;
            }
            else if (key > arr[mid]) {
                start = mid + 1;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            mid =start + ((end - start)/2);
        }
        return left+1;
    }
    public static int RightOccurance(int [] arr, int n, int key){
        int right = -1;
        int start = 0;
        int end = n-1;
        int mid =start + ((end - start)/2);
        while(start <= end){
            if(arr[mid] == key){
                right = mid;
                start = mid+1;
            }
            else if (key > arr[mid]) {
                start = mid + 1;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            mid =start + ((end - start)/2);
        }
        return right+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[100];
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(leftOccurance( arr, n,  key)+","+RightOccurance( arr, n,  key));

    }
}
