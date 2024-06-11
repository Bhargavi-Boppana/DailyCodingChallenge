class Solution{
    static int evenlyDivides(int N){
        int count = 0;
        int original = N;
        while(N>0)
        {
            int rem = N%10;
            if(rem > 0 && original%rem == 0)
                count++;  
            N = N/10;    
        }
        return count;
    }
}
