//Collections.sort -> mergesort 로써 stable sort
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        List<String> list = new ArrayList<>();
        list = Arrays.asList(strings);

        Collections.sort(list, (o1,o2)-> o1.charAt(n)-o2.charAt(n));
        
        int size=0;
        for(String i : list){
            strings[size++]=i;
        }
        return strings;
    }
}
// Arrays.sort 는 quick sort 이므로 non stable, but 제출했더니 통과는 됨
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, (o1,o2)-> o1.charAt(n)-o2.charAt(n));
        return strings;
    }
}