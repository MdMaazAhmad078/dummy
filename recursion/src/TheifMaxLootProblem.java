import java.util.Scanner;

public class TheifMaxLootProblem {
    public static int maxLoot(int [] arr,int N){
       int maxLoot=0;

        if(N == 0){
            return 0;
        }
        if(N == 1){
            return arr[0];
        }
        if(N == 2){
            return Math.max(arr[0],arr[1]);
        }
       if(N>2) {
           int start=0;
           for (int i = 0; i < N; i += 2) {
               start += arr[i];
           }


           int end = 0;
           for (int i = 1; i < N; i += 2) {
               end += arr[i];
           }

          maxLoot=  Math.max(start,end);
       }
      return maxLoot;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Enter Number of Houses:");
        N= sc.nextInt();
        int money;
        System.out.println("Enter money in house:");
        money=sc.nextInt();
        int [] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = money;
        }
        System.out.println("The Maximum Loot amount:");
        System.out.println(maxLoot(arr,N));

    }
}
