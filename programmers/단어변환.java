//dfs 로 풀어서 성공했지만(이상하게 테케1이 틀리는데 통과가 뜸), 효율성은 bfs 가 더 좋음. 왜냐하면, 너비우선탐색 도중에서 먼저 결과값이 발견되면 그 즉시 끝내므로 dfs 와 달리 bfs 의 경우 min값과 count 값의 비교연산이 필요가 없어지기 때문. 또한 넘겨주는 매개변수의 개수도 줄어듦. 
class Solution {
    boolean flag;
    int min = Integer.MAX_VALUE;
    public int solution(String begin, String target, String[] words) {
        int count=0;
        boolean visited[] = new boolean[words.length];

        for(int i=0;i<words.length;i++){ 
            if(words[i].equals(target)){
                flag=true;
                break;
            }
        }
        if(!flag) return 0;

        dfs(begin,count,target,words,visited);

        return min;
    }

    void dfs(String s, int count, String target, String[] words, boolean visited[]){
        boolean visited1[] = new boolean[words.length];
        for(int i=0;i<words.length;i++){
            visited1[i]=visited[i];
        }
        if(target.equals(s)){
            if(count < min) min=count;
            return;
        }
        for(int i=0;i<words.length;i++){
            if(isOk(s,words[i]) && !visited1[i]){
                visited1[i]=true;
                count++;
                dfs(words[i],count,target,words,visited1);
            }
        }
    }

    boolean isOk(String a, String b){
        int same=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == b.charAt(i)) same++;
        }
        if(same == a.length()-1) return true;
        return false;
    }
}

//bfs 풀이 _ node 클래스 이용하는게 이해가 안감
import java.util.LinkedList;
import java.util.Queue;

class Solution {

    static class Node {
        String next;
        int edge;

        public Node(String next, int edge) {
            this.next = next;
            this.edge = edge;
        }
    }

    public int solution(String begin, String target, String[] words) {
        int n = words.length, ans = 0;

        // for (int i=0; i<n; i++)
        //  if (words[i] != target && i == n-1) return 0;

        Queue<Node> q = new LinkedList<>();


        boolean[] visit = new boolean[n];
        q.add(new Node(begin, 0));

        while(!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.next.equals(target)) {
                ans = cur.edge;
                break;
            }

            for (int i=0; i<n; i++) {
                if (!visit[i] && isNext(cur.next, words[i])) {
                    visit[i] = true;
                    q.add(new Node(words[i], cur.edge + 1));
                }
            }
        }

        return ans;
    }

    static boolean isNext(String cur, String n) {
        int cnt = 0;
        for (int i=0; i<n.length(); i++) {
            if (cur.charAt(i) != n.charAt(i)) {
                if (++ cnt > 1) return false;
            }
        }

        return true;
    }    
}
