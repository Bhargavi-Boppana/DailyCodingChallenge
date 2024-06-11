class Solution
{ 
    String reverseEqn(String S)
    {
        char[] charArray = S.toCharArray();
         StringBuilder sb = new StringBuilder();
         Stack<Character> st = new Stack<Character>();
         int i = S.length() -1;
      
         while(i>=0)
         {
           if(charArray[i] == '+' || charArray[i] == '-' || charArray[i] == '*' || charArray[i] == '/')
           {   
               while(!st.isEmpty())
               {
                   sb.append(st.pop());
               }
               sb.append(charArray[i]);
           }
           else
           {
               st.push(charArray[i]);
           }
           i--;
          
         }
         while(!st.isEmpty())
         {
             sb.append(st.pop());
         }
  
        return sb.toString();
    }
