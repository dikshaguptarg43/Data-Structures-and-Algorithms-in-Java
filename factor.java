class Solution {
    public int commonFactors(int a, int b) {
        int i,c = 0;
        int min = Math.min(a,b);
        for(i=1;i<=min;i++){
      if(a%i ==0 && b%i ==0){
          c++;
         
      }
        }
        
        return c;
    }
}
