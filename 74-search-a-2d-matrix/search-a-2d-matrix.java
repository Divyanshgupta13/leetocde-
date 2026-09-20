class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        int row = arr.length , col = arr[0].length;
        int lo =0, hi = row*col-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int midRow = mid/col , midCol = mid%col;
            if(arr[midRow][midCol] == tar) return true;
            else if(arr[midRow][midCol] > tar) hi = mid-1;
            else lo = mid+1;
        }
        return false;
    }
}