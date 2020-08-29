class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0]*arr[1]/gcd(arr[0],arr[1]);
        //int lcm=1;
        for(int i=2;i<arr.length;i++){
            lcm = lcm*arr[i]/gcd(lcm,arr[i]);
        }
        /*
        for(int i : arr)
            lcm *= i;
        lcm = lcm / temp;
        */
        return lcm;
    }
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}