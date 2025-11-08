class Solution {
    public boolean isSameAfterReversals(int num) {
        StringBuilder str = new StringBuilder(String.valueOf(num));
        str.reverse();
        int m = Integer.parseInt(str.toString());
        StringBuilder nstr = new StringBuilder(String.valueOf(m));
        nstr.reverse();
        int um = Integer.parseInt(nstr.toString());
        if(um == num) return true;
        return false;
    }
}