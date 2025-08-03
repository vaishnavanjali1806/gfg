import java.util.*;

class Solution {
    public String findLargest(int[] arr) {
        int n = arr.length;
        String[] element = new String[n];

        for (int i = 0; i < n; i++) {
            element[i] = Integer.toString(arr[i]);
        }

        Arrays.sort(element, new Comparator<String>() {
            public int compare(String a, String b) {
                String first = a + b;
                String second = b + a;
                return second.compareTo(first); // descending order
            }
        });

        if (element[0].equals("0")) {
            return "0"; // all zeros case
        }

        StringBuilder res = new StringBuilder();
        for (String val : element) {
            res.append(val);
        }

        return res.toString();
    }
}
