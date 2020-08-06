class Solution {
    int count;
    public int solution(int n) {
        for(int i=2;i<=n;i++){
            if(isPrime(i)) count++;
        }
        return count;
    }

    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}