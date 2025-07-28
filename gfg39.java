

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
       
         int ans=Integer.MAX_VALUE;
          Collections.sort(arr);
          int n=arr.size();
          
          for(int i=0 ; i<n-m+1 ;i++){
               
               int minelement=arr.get(i);
               int maxelement=arr.get(i+m-1);
               ans=Math.min(ans,maxelement-minelement);
               
          }
          
          return ans;
    }
}

 
