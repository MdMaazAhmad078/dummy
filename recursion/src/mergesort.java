public class mergesort {
    public static void main(String[] args)
    {
        int []arr={4,6,4,44,88,4};
        int left=0;
        int right= arr.length-1;
        mergesort(arr,left,right);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void mergesort(int[] arr, int left, int right)
    {
      if(left<right)
      {
          int mid=(left+right)/2;
          mergesort(arr,left,mid);
          mergesort(arr,mid+1,right);
          merge(arr,left,mid,right);
      }
    }
    public static void merge(int[] arr, int left,int mid ,int right)
    {
        int []brr= new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=right) {
            if (arr[i] < arr[j]) {
                brr[k] = arr[i];
                i++;
                k++;
            } else {
                brr[k] = arr[j];
                j++;
                k++;
            }
        }

            while(i<=mid)
            {
                brr[k]=arr[i];
                i++;
                k++;
            }
            while(j<=right)
            {
                brr[k]=arr[j];
                k++;
                j++;
            }

        for(int p=left, h=0; h<brr.length; p++ ,h++)
        {

            arr[p]=brr[h];

        }

    }






}
