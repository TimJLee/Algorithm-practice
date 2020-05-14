import java.util.*;
public class InterestingDigits {
	public static void main(String[] args) {
		InterestingDigits it = new InterestingDigits();
		
		/*
		int ans10[] = it.digits(10);
		int ans3[] = it.digits(3);
		int ans9[] = it.digits(9);
		int ans26[] = it.digits(26);
		int ans30[] = it.digits(30);
		*/
		int ans10[] = it.digitsMath(10);
		int ans3[] = it.digitsMath(3);
		int ans9[] = it.digitsMath(9);
		int ans26[] = it.digitsMath(26);
		int ans30[] = it.digitsMath(30);

		for(int a : ans30) System.out.print(a+" ");
	}
	
	public int[] digitsMath(int base) {
		Vector<Integer> v = new Vector<Integer>();
		
		for(int i=2;i<base;i++) {
			if(((base-1) % i) == 0 ) v.add(i); // 약수라면 추가한다
		}
		
		int ans[] = new int[v.size()];
		for(int i=0;i<v.size();i++) ans[i]=v.get(i); 
		
		return ans;
	}
	public int[] digits(int base) {
		ArrayList <Integer> v = new ArrayList<Integer>();
		int mul=0,a=0,b=0,c=0,sum=0;
		boolean ok;
		for(int i=2;i<base;i++) {
			ok=true;
			for(int j=2;i*j<base*base*base;j++) {
				mul=i*j;
				a = mul%base;
				b = (mul/base)%base;
				c = ((mul/base)/base)%base;
				sum=a+b+c;
				if(sum%i != 0) {
					ok = false;
					break;
				}
			}
			if(ok) v.add(i);
		}
		
		int ans[] = new int[v.size()];
		for(int i=0;i<v.size();i++) ans[i]=v.get(i);
		
		return ans;
	}
}
