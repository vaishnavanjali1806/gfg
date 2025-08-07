class Solution {
    public int minDifference(String[] arr) {
        // code here
         int n = arr.length;

        ArrayList<Integer> al = new ArrayList<>();               

        for(String time : arr){

            int hours = Integer.parseInt(time.substring(0,2));                           

            int min = Integer.parseInt(time.substring(3,5));

            int sec = Integer.parseInt(time.substring(6,8));

            

          int total = hours*3600 + min*60 + sec;

            al.add(total);

        }

        

        Collections.sort(al);

        

        int res = Math.min(al.get(n-1)-al.get(0),86400-(al.get(n-1)-al.get(0)));

        

        for(int i=1; i<n; i++){

            res = Math.min(res,al.get(i)-al.get(i-1));

        }

        

        return res;

        
    }
}
