public class FactorialUsingParameterRecursion {
    public static void fact(int i,int mul){
        if(i<1){
            System.out.println(mul);
        }
        else{
            fact(i-1,mul*i);
        }
    }
    public static void main(String[] args){
        int n=4;
        fact(n,1);
    }
}
