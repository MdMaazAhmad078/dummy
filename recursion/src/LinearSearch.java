import java.util.Scanner;

public class LinearSearch {
    public static boolean search(int [] arr,int n,int key){
        boolean found=false;
        for(int i=0;i<n;i++){
            if(key == arr[i]){
                found=true;
            }

        }
        return found;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(search(arr,n,key));
    }
}
