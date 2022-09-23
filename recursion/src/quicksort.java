public class quicksort {
    public static void main(String[] args)
    {
        int []arr={4,2,7,5,9,3,7};
        int low=0;
        int high= arr.length-1;
        quicksort(arr,low,high);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
     public static void quicksort(int[] arr, int low, int high)
    {
        if(low<high) {
            int loc = partition(arr, low, high);
            quicksort(arr, low, loc-1);
            quicksort(arr, loc + 1, high);
        }
    }
    public  static int partition(int[] arr,int low, int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;
        int le=arr.length-1;
        while(i<j)
        {
            while(arr[i]<=pivot&& i<le-1)
            {
                i++;
            }
            while(arr[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }


}
