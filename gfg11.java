  Deque<Integer> maxi = new LinkedList<>();
        Deque<Integer> mini = new LinkedList<>();
        int ans = 0, i = 0, j = 0, ii = 0, jj = 0;
        
        while (j < arr.length) {
            while (!mini.isEmpty() && arr[mini.peekLast()] > arr[j]) mini.pollLast();
            while (!maxi.isEmpty() && arr[maxi.peekLast()] < arr[j]) maxi.pollLast();
            
            mini.addLast(j);
            maxi.addLast(j);
            
            while (arr[maxi.peekFirst()] - arr[mini.peekFirst()] > x && i < j) {
                if (i == mini.peekFirst()) mini.pollFirst();
                if (i == maxi.peekFirst()) maxi.pollFirst();
                i++;
            }
            
            if (j - i + 1 > ans) {
                ans = j - i + 1;
                ii = i;
                jj = j;
            }
            j++;
        }
        
        ArrayList<Integer> ans1 = new ArrayList<>();
        for (int k = ii; k <= jj; k++) {
            ans1.add(arr[k]);
        }
        
        return ans1;
