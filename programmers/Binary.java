
 
import java.util.*;
public class Binary {
	public static void main(String[] args) {
		Binary t1 =new Binary();
		for(int i=1;i<=10;i++)
			System.out.println(t1.solution(i));
		System.out.println(t1.solution(1000000000));

	}
    public long solution(long n) {
    	/*
        long T[]=new long[(int) (n+1)];
        T[1]=1;
        T[2]=3;
        T[3]=4; 
        T[4]=9;
        for(int i=5;i<T.length;i++){
            for (int k = 3; i <= n/2; i++) {
                if (Math.pow(2, k) == i) {
                    T[i] = (long) Math.pow(3,k);
                    break;
                }
            }
            for(int j=0;j<i-1;j++){
                T[i+j]=T[i-1]+T[j];
            }
        }
       
        return T[(int) n];
        */
    	List<Integer> bin = new ArrayList<>();
    	
    	while(true) {
    		bin.add((int)n%2);
    		if(n==0) break;
    		n = n/2;
    	}
    	
    	long sum=0;
    	for(int i=0;i<bin.size();i++)
    		sum += Math.pow(3, i)*bin.get(i);
    	
    	return sum;
    }
}

/*
9번째 숫자 -> 1001(2)번째 숫자 -> 1001(3) = 28(10)
비트마스크. 진수변환
*/