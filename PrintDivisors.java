class Solution {
    public static void print_divisors(int n) {
        // code here
        Set<Integer> result = new HashSet<>();
        result.add(n);
       
        
        for(int i = 1; i<= Math.sqrt(n); i++)
        {
            if(n%i == 0)
            {
                result.add(i);
                if(i>1 && n%(n/i) == 0)
                {
                    result.add(n/i);
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>(result); 
        Collections.sort(list); 
  
        
        for(int k: list)
        {
            System.out.print(k + " ");
        }
    }
}
