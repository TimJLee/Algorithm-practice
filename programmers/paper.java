import java.lang.Math;
class Solution {
    int len;
    public int[] solution(int n) {
        int[] T =new int[(int)Math.pow(2,n)-1];
        //T[0]=0;
        //T[1]=0;
        //T[2]=1;
        for(int i=1;i<=n;i++){
            len = (int)Math.pow(2,i) -1;
            T[(len/2)]=0;
            for(int j=0;j<(len/2);j++){
                T[len-j-1] = 1-T[j];
            }
        }
       
        return T;
    } 
}