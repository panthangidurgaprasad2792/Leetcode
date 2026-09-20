class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int i=1;
       for(char c:s.toCharArray())
       {
        if(c!='\0')
       {
         sum+=(('z'-c)+1)*i;
         i++;
        }
       }
       return sum;
        
    }
}