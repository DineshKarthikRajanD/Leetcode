class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length, max = weights[0], sum = 0;

        // find max weight & total sum
        for(int i=0;i<n;i++){
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }

        int left = max, right = sum, ans = sum;

        // binary search instead of linear max++
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(canShip(weights, days, mid)){ 
                ans = mid;
                right = mid - 1;   // try smaller capacity
            } else {
                left = mid + 1;    // need bigger capacity
            }
        }

        return ans;
    }

    // Your EXACT inner logic (unchanged)
    public boolean canShip(int[] weights, int days, int max){
        int temp = days;
        int fsum = 0;
        int j = 0;
        int n = weights.length;

        while(j < n){
            if(fsum + weights[j] <= max){
                fsum += weights[j];
                j++;
            }
            else{
                temp--;
                fsum = 0;
                if(temp == 0) return false;
            }
        }
        return true;
    }
}
