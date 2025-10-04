class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0, avg = 0;
        int n = salary.length;

        for(int i=1;i<n-1;i++){
            sum += salary[i];
        }

        avg = sum / (n - 2);

        return avg;
    }
}