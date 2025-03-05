class Solution {
    public int longestStringChain(String words[]) {
        // code here
         Arrays.sort(words, (a, b) -> a.length() - b.length());
        
        Map<String, Integer> dp = new HashMap<>(); 
        int maxLength = 1;
        
        for (String word : words) {
            int best = 1;
            for (int i = 0; i < word.length(); i++) {
                String predecessor = word.substring(0, i) + word.substring(i + 1); 
                best = Math.max(best, dp.getOrDefault(predecessor, 0) + 1);
            }
            dp.put(word, best);
            maxLength = Math.max(maxLength, best);
        }
        
        return maxLength;
    }
}
