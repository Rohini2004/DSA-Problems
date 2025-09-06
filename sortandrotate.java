public class sortandrotate{
    public static void main(String args[]){
        //int arr[]={1,3,5,7,9,11,14,15,20,22,25};
        //int arr[]={9,11,14,15,20,22,25,1,3,5,7};
        int arr[]={14,15,20,22,3,5,7,9,11};
        System.out.println(findMin(arr));

    }
    public static int findMin(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;//discarding left part
            }
            else{
                right=mid;//discarding right part
            }
        }
        return arr[left];
    }
}