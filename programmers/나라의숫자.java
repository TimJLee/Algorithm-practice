// https://programmers.co.kr/learn/courses/30/lessons/12899
class Solution {
    public String solution(int n) {
        String a = "";
        while (n != 0) {
            if(n%3 ==0){
                a = '4' + a;
                n = n/3 - 1;
            }
            else{
			    a = n%3 + a;
			    n = n / 3;
            }
		}
        return a;
    }
}

// 다른풀이
class Solution {
	  public String solution(int n) {
	      String[] num = {"4","1","2"};
	      String answer = "";

	      while(n > 0){
	          answer = num[n % 3] + answer;
	          n = (n - 1) / 3; //wow...
	      }
	      return answer;
	  }
	}
