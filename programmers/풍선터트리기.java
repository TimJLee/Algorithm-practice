import java.util.*;
class Solution {
    //int rightMin;
    public int solution(int[] a) {
        int leftMin = a[0];
        int ans=2;
        //setRightMin(a,1);
        // 오른쪽 그룹 최솟값 저장하는 리스트
        List<Integer> li = new ArrayList<>();
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i=1;i<a.length;i++){
            li.add(a[i]);
            map.put(a[i],false);
        }
        Collections.sort(li);
        /*
        for(int i=1;i<a.length;i++){
            if(temp > a[i]) temp = a[i];
        }
        rightMin = temp;
        */
        int index=0;
        for(int i=1;i<a.length-1;i++){
            int co = 0;
            //왼쪽 판단
            if(a[i] > leftMin) co++;
            else leftMin = a[i];
            //오른쪽 판단
            while(map.get(li.get(index))){
                //if(map.get(li.get(index)))
                index++;
                //else break;
            }
            if(a[i] > li.get(index)) {
                //li.remove(li.indexOf(a[i])); // 이게 약간 마음에 걸림.. 효율성
                co++;
                map.put(a[i],true);
            }
            else if(a[i] == li.get(index)){
                //setRightMin(a,i+1);
                //li.remove(0);
                index++;
            }
            if(co <= 1) ans++;
        }
        return ans;
    }
    /*
    public void setRightMin(int[] a, int start){
        int min=0;
        for(int i=start;i<a.length;i++){
            if(min > a[i]) min = a[i];
        }
        rightMin = min;
    }
    */
}