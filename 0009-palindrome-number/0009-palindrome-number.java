class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int n = x;
        int sum = 0;
        while(n != 0){
            int l = n%10;
            sum = sum*10 + l;
            n = n/10;
        }

        if(sum == x){
            return true;
        }else{
            return false;
        }
    }
}