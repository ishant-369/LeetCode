class Solution {
    public int findFirstPos(int[] nums, int target) {
        int left = 0,
            right = nums.length - 1;
        int firstIdx = -1;
        while (left <= right){
            int mid = left + (right -left)/2;

            if (nums[mid] == target) {
                firstIdx = mid;
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstIdx;
    }

    public int findLastPos(int[] nums, int target) {
        int left = 0,
            right = nums.length - 1;
        int lastIdx = -1;
        while (left <= right){
            int mid = left + (right -left)/2;

            if (nums[mid] == target) {
                lastIdx = mid;
                left = mid + 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastIdx;
    }
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return new int[] {-1,-1};
        }
        int first = findFirstPos(nums, target);

        if (first == -1){
            return new int[] {-1,-1};
        }
        int last = findLastPos(nums, target);

        return new int[] {first , last};
    }
}