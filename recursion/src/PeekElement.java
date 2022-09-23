public class PeekElement {
    public int peakElement(int[] arr,int n)
    {

        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid =(low+high)/2;

            if(
                    (mid==0 || arr[mid]>=arr[mid-1])&&
                            (mid == n-1 || arr[mid]>=arr[mid+1])
            ){
                return mid;
            }
            else if(arr[mid]<=arr[mid+1]){
                mid=low+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }
}