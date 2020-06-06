import java.io.*;
import java.util.*;

class Main {
	//String input;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Map<String,Integer> map = new HashMap<>();
		Map<String,Integer> map2 = new HashMap<>();
		for(int i=0;i<num*(num-1);i++){
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input); 
			String team1 = st.nextToken(); 
			int team1_win = Integer.parseInt(st.nextToken()); 
			String team2 = st.nextToken(); 
			int team2_win = Integer.parseInt(st.nextToken()); 
			if(team1_win == 2) map.put(team1, map.getOrDefault(team1, 0) + 1);
			if(team2_win == 2) map.put(team2, map.getOrDefault(team2, 0) + 1);
			map2.put(team1, map2.getOrDefault(team1, 0) + team1_win-team2_win);
			map2.put(team2, map2.getOrDefault(team2, 0) + team2_win-team1_win);
		}
		/*
		 for(String key : map.keySet()){
					  System.out.println(key+" "+map.get(key)+" "+map2.get(key));

				}
		*/
		List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        
    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int comparision1 = (o1.getValue() - o2.getValue()) * -1;
							  if(comparision1 == 0){
							    int comparision2 = (map2.get(o1.getKey()) - map2.get(o2.getKey())) * -1;
									return comparision2 == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision2;
								}
                return comparision1 == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision1;
            }
        });
	
        // 순서유지를 위해 LinkedHashMap을 사용
        Map<String, Integer> sortedMap = new LinkedHashMap<>(); 
        for(Iterator<Map.Entry<String, Integer>> iter = list.iterator(); iter.hasNext();){
            Map.Entry<String, Integer> entry = iter.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        for(String key : sortedMap.keySet()){
					  System.out.println(key+" "+map.get(key)+" "+map2.get(key));

				}
		//System.out.println("Hello Goorm! Your input is " + input);
	}
}

/*
 * 
 * 
 * 3
a 2 b 0
a 2 c 1
b 2 a 1
b 0 c 2
c 0 a 2
c 1 b 2

a 3 4
b 2 -2
c 1 -2

4
drx 2 t1 1
drx 1 gen 2
t1 1 gen 2
t1 2 drx 1
kt 1 drx 2
t1 0 kt 2
drx 2 kt 1
gen 1 t1 2
gen 2 kt 0
gen 1 drx 2
kt 0 t1 2
kt 2 gen 0

drx 4 2
gen 3 0
t1 3 0
kt 2 -2

 */