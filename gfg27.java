 int n=str.length();
        int minSize=Integer.MAX_VALUE;
        
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        int requiredSize=set.size();
        
        Map<Character,Integer>  map=new HashMap<>();
        int i=0;
        
        for(int j=0;j<n;j++){
            char chr=str.charAt(j);
            map.put(chr,map.getOrDefault(chr,0)+1);
            
            while(map.size()==requiredSize){
                minSize=Math.min(minSize,j-i+1);
                
                char ch=str.charAt(i);
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0)
                    map.remove(ch);
                    
                i++;
            }
            
        }
        
        return minSize;
