class Solution {
    public int solution(int n) {
        String a = Integer.toBinaryString(n);
        int aCount = count(a);
        for(int i=n+1;;i++){
            String b = Integer.toBinaryString(i);
            int bCount = count(b);
            if(aCount == bCount) return i;
        }
 
    }
    public int count(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') count++;
        }
        return count;
    }
}