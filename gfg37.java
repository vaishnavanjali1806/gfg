class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
    
        // Code Here
        Arrays.sort(arr);
    int n = arr.length;
    int min = arr[0];
    int max = arr[n-1];
    return new Pair<>(min,max);
     
    }
}

