class Solution {
    public int kBitFlips(int[] arr, int k) {
        int ops = 0;
        int flip = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
           
            if (i >= k && arr[i - k] > 1) {
                flip ^= 1;
                arr[i - k] -= 2;
            }

            if ((arr[i] ^ flip) == 0) {
                if (i + k > n) return -1; 
                ops++;
                flip ^= 1;
                arr[i] += 2; 
            }
        }

        return ops;
    }
}
