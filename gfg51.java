class Solution {
    public int romanToDecimal(String s) {
       
         HashMap<Character,Integer>map=new HashMap<>();
        StringBuilder builder=new StringBuilder(s);
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char pre=' ';
        int num=0;
        for (char i:builder.reverse().toString().toCharArray()){
            if(pre==' '){
                pre=i;
                num+=map.get(i);
            }else {
                if (map.get(pre)>map.get(i)) num-=map.get(i);
                else num+=map.get(i);
                pre=i;
            }
        }
        return num;
    }
}
