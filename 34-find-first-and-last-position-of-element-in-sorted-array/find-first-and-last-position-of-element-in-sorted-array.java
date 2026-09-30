class Solution {
    public int[] searchRange(int arr[], int tar) {
        int first = findFirst(arr,tar);
        int last = findLast(arr,tar);
        int[] nums = new int[2];
        nums[0] = first;
        nums[1] = last;
        return nums;
    }
    
    public static int findFirst(int[] arr, int tar){
        int lo=0, hi=arr.length-1,idx_1=-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<tar) lo = mid+1;
            else if(arr[mid]>tar) hi = mid-1;
            else{
                idx_1 = mid;
                hi = mid-1;
            }
        }
        return idx_1;
    }
    public static int findLast(int[] arr, int tar){
        int lo=0,hi=arr.length-1,idx_2=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]<tar) lo = mid+1;
            else if(arr[mid]>tar) hi = mid-1;
            else{
                idx_2 = mid;
                lo = mid+1;
            }
        }
        return idx_2;
    }     
}