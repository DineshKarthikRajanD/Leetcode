class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length, max = weights[0], sum = 0;

        for(int i=0;i<n;i++){
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }

        int left = max, right = sum, ans = sum;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(canShip(weights, days, mid)){ 
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

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
