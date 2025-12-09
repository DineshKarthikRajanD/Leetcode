class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int n = num1.length(), m = num2.length();
        int res[] = new int [n + m];

        for(int i=n-1;i>=0;i--){
            int n1 = num1.charAt(i) - '0';
            for(int j=m-1;j>=0;j--){
                int n2 = num2.charAt(j) - '0';
                int mul = n1 * n2;
                int posLow = i + j + 1;
                int posHigh = i + j;
                int sum = mul + res[posLow];
                res[posLow] = sum % 10;
                res[posHigh] += sum / 10;
            }
        }
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < res.length && res[i] == 0) i++;
        for (; i < res.length; i++) {
            str.append(res[i]);
        }
        return str.length() == 0 ? "0" : str.toString();
    }
}