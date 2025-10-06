class Solution {
    public boolean isPerfectSquare(int num) {
        int res = (int) Math.sqrt(num);
        return (res*res) == num;
    }
}