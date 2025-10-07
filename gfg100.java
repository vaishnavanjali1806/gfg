  ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) return ans;
        
        Map<Integer, Pair> map = new TreeMap<>();
        helper(root, 0, 0, map);
        
        for(int key: map.keySet()) {
            ans.add(map.get(key).val);
        }
        
        return ans;
    }
    
    static void helper(Node root, int horizontal, 
        int level, Map<Integer, Pair> map) {
        if(root == null) return;
        
        if(map.containsKey(horizontal)) {
            Pair pair = map.get(horizontal);
            if(level >= pair.lvl) {
                map.put(horizontal, new Pair(root.data, level));
            }
        } else {
            map.put(horizontal, new Pair(root.data, level));
        }
        
        helper(root.left, horizontal-1, level+1, map);
        helper(root.right, horizontal+1, level+1, map);
    }
    
    static class Pair {
        int val;
        int lvl;
        
        public Pair(int val, int lvl) {
            this.val = val;
            this.lvl = lvl;
        }
