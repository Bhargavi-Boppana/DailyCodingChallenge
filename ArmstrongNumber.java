class Solution {
    static String armstrongNumber(int n){
        
        int original = n;
        int ans = 0;
        while(n>0)
        {
            int digit = n%10;
            ans += digit*digit*digit;
            n = n/10;
        }
        
        
        if (ans==original)
            return "Yes";
        else
            return "No";
            
    }
}
