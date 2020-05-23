
using System;
import java.lang.Math;
public class test {
    public long solution(long n) {
        long T[]=new long[(int) (n+1)];
        T[1]=1;
        T[2]=3;
        T[3]=4;
        T[4]=9;
        for(int i=5;i<T.length;i++){
            for (int k = 3; i <= n/2; i++) {
                if (Math.pow(2, k) == i) {
                    T[i] = Math.pow(3,k);
                    break;
                }
            }
            for(int j=0;j<i-1;j++){
                T[i+j]=T[i-1]+T[j];
            }
        }
       
        return T[n];
    }
}