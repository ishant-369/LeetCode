class Solution {
    public int mySqrt(int x) {
       if (x == 0) {
        return 0;
       } 

       int left = 1,
            right = x;
        int result = 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // x -> INT_MAX
            long sqrd = (long) mid * mid;

            if (sqrd == x){
                return mid;
            } else  if (sqrd < x){
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}