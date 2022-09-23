public class RecursionFunction {
    static int n=3;
    public static int f( int n){
        if(n==0){
            return 0;
        }
        else{
            return(n + f(n-1));
        }
    }
    public static void main (String[] args){



        System.out.println(f(n));
    }
}
