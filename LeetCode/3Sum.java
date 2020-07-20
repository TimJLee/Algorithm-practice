import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOut = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                if(nums[i]+nums[j]+nums[k] == 0){
                    List<Integer> listIn = new ArrayList<>();
                    listIn.add(nums[i]);
                    listIn.add(nums[j]);
                    listIn.add(nums[k]);
                    listOut.add(listIn);
                    
                    j++; k--; // 중복이 되는게 있어도, 되는게 없어도 결국 둘 다 이동해줘야 한다. 
                    
                    while(j<k && nums[j] == nums[j-1]) j++; // 중복되는 값을 다 피한다
                    while(j<k && nums[k] == nums[k+1]) k--; // ""
                }else if(nums[i]+nums[j]+nums[k] > 0){
                    k--; // 세 수를 합했을 때 0보다 크게 나오면, 더해주는 값을 작게 만들어준다
                }else{
                    j++;
                }
            }
        }
        return listOut;
    }
}

// 개선 전 - 해시셋 풀이
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> listIn = new ArrayList<>();
                        listIn.add(nums[i]);
                        listIn.add(nums[j]);
                        listIn.add(nums[k]);
                        Collections.sort(listIn);
                        hs.add(listIn);
                    }
                }
            }
        }
        List<List<Integer>> listOut = new ArrayList<>(hs);
        return listOut;
    }
}