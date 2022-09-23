import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   public static void reverseArray(int[] A){
        reverse(A, 0, A.length -1);
    }
    public static void reverse(int[] A, int i, int j){
        if(i<j){//Swap
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
            reverse(A, ++i, --j);//Recursive
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();
        int [] A = new int[N];


        for( int i=0; i<N ;i++){
            A[i]=sc.nextInt();
        }

        reverseArray(A);
        for (int element: A) {
            System.out.println(element);
        }
//        System.out.println(Arrays.toString(A));
    }
}