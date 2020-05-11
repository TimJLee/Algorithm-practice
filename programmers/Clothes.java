import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        int ans = 1;
        for(int i=0;i<clothes.length; i++){ // 행길이
            /*
            if(map.containsKey(clothes[i][1]))
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            else
                map.put(clothes[i][1],1);
                */
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        Iterator<String> it = map.keySet().iterator();

        while(it.hasNext())
        {
            String key = it.next();
            ans = ans * (1+map.get(key));
            //System.out.println(ans);
        }
        //haspmap 초기화하기
        //map.clear();
        ans -= 1;
        return ans;
    }
}
