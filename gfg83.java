class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        
        if(n == 1){
            ans.add(arr[0]);
            return ans;
        }
        int maxi = arr[n-1];
        ans.add(maxi);
        for(int i = n-2; i >= 0; i--){
            if(arr[i] >= maxi){
                maxi = arr[i];
                ans.add(maxi);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
