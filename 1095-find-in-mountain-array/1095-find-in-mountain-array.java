/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();

        int peak = peakElement(mountainArr, 0, len-1); 

        int index = binarySearch(mountainArr, target, 0, peak, true);

        if(index != -1) return index;

        return binarySearch(mountainArr, target, peak+1, len-1, false);
    }
    public int peakElement(MountainArray mountainArr, int left, int right){
        while(left < right){
            int mid = left + (right - left) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)) right = mid;

            else left = mid + 1;
        }
        return left;
    }
    public int binarySearch(MountainArray mountainArr, int target, int left, int right, boolean isAsending){
        while(left <= right){
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid);

            if(target == midVal) return mid;

            if(isAsending){
                if(midVal < target) left = mid + 1;
                else right = mid - 1;
            }
            else{
                if(midVal < target) right = mid - 1;
                else left = mid + 1;
            }
        }
        return -1;
    }
}