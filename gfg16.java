   int max=0;
        int start=0;
        int end=0;
        int n=s.length();
       for(int i=0;i<s.length();i++)
       {
           //for odd
           int prev=i-1;
           int next=i+1;
           while(prev>=0&&next<n)
           {
                if(s.charAt(prev)!=s.charAt(next))
               {
                   break;
               }
               else{
                   int size=(next-prev)+1;
                   if(size>max)
                   {
                       start=prev;
                       end=next;
                       max=size;
                   }
               }
               
               prev--;
           next++;
           }
           //for even
           prev=i;
           next=i+1;
           while(prev>=0&&next<n)
           {
               if(s.charAt(prev)!=s.charAt(next))
               {
                   break;
               }
               else{
                   int size=(next-prev)+1;
                   if(size>max)
                   {
                       start=prev;
                       end=next;
                       max=size;
                   }
               }
               
               prev--;
           next++;
           }
       }
       return s.substring(start,end+1);
