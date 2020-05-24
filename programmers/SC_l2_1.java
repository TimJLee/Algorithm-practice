import java.util.*;
/*
 * 캐시
지도개발팀에서 근무하는 제이지는 지도에서 도시 이름을 검색하면 해당 도시와 관련된 맛집 게시물들을 데이터베이스에서 읽어 보여주는 서비스를 개발하고 있다.
이 프로그램의 테스팅 업무를 담당하고 있는 어피치는 서비스를 오픈하기 전 각 로직에 대한 성능 측정을 수행하였는데, 제이지가 작성한 부분 중 데이터베이스에서 게시물을 가져오는 부분의 실행시간이 너무 오래 걸린다는 것을 알게 되었다.
어피치는 제이지에게 해당 로직을 개선하라고 닦달하기 시작하였고, 제이지는 DB 캐시를 적용하여 성능 개선을 시도하고 있지만 캐시 크기를 얼마로 해야 효율적인지 몰라 난감한 상황이다.

어피치에게 시달리는 제이지를 도와, DB 캐시를 적용할 때 캐시 크기에 따른 실행시간 측정 프로그램을 작성하시오.

입력 형식
캐시 크기(cacheSize)와 도시이름 배열(cities)을 입력받는다.
cacheSize는 정수이며, 범위는 0 ≦ cacheSize ≦ 30 이다.
cities는 도시 이름으로 이뤄진 문자열 배열로, 최대 도시 수는 100,000개이다.
각 도시 이름은 공백, 숫자, 특수문자 등이 없는 영문자로 구성되며, 대소문자 구분을 하지 않는다. 도시 이름은 최대 20자로 이루어져 있다.
출력 형식
입력된 도시이름 배열을 순서대로 처리할 때, 총 실행시간을 출력한다.
조건
캐시 교체 알고리즘은 LRU(Least Recently Used)를 사용한다.
cache hit일 경우 실행시간은 1이다.
cache miss일 경우 실행시간은 5이다.
입출력 예제
캐시크기(cacheSize)	도시이름(cities)	실행시간
3	[Jeju, Pangyo, Seoul, NewYork, LA, Jeju, Pangyo, Seoul, NewYork, LA]	50
3	[Jeju, Pangyo, Seoul, Jeju, Pangyo, Seoul, Jeju, Pangyo, Seoul]	21
2	[Jeju, Pangyo, Seoul, NewYork, LA, SanFrancisco, Seoul, Rome, Paris, Jeju, NewYork, Rome]	60
5	[Jeju, Pangyo, Seoul, NewYork, LA, SanFrancisco, Seoul, Rome, Paris, Jeju, NewYork, Rome]	52
2	[Jeju, Pangyo, NewYork, newyork]	16
0	[Jeju, Pangyo, Seoul, NewYork, LA]	25
["Jeju", "Jeju", "Pan", "Jeju", "Lee", "Jeju"] 18 <= 이건 내가 추가한 테스트케이스. 카카오 특징은 
예외사항 예시가 있는데 이걸 찾아야만 통과함. 테스트케이스 하나만 틀려도 실패로 간주됨. (2017기준)
 * 
 */
public class SC_l2_1 {
	public static void main(String[] args) {
		int cacheSize = 3; 
		String cities[] = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		SC_l2_1 s = new SC_l2_1();
		System.out.println(s.solution(cacheSize, cities));
	}
	public int solution(int cacheSize, String[] cities) {
		 public int solution(int cacheSize, String[] cities) {
				if (cacheSize == 0)
					return 5 * cities.length;
				int answer = 0;
				//int i = 0;
				List<String> cache = new ArrayList<>();
		        /*
				for (i = 0; i < cities.length; i++) {
					if(cache.contains(cities[i].toUpperCase())) continue;
					cache.add(cities[i].toUpperCase());
					answer += 5;
					if(cache.size() == cacheSize) break;
				}
		    */
				for (int j=0; j < cities.length; j++) {
					//for (int k = 0; k < cacheSize; k++) {
						if (cache.contains(cities[j].toUpperCase())) {
		                    cache.remove(cities[j].toUpperCase());
		                    cache.add(cities[j].toUpperCase());
							answer += 1;
							//break;
						}else{
						//if (k == cacheSize - 1) {
							answer += 5;
							//cache.set(0, cities[j]);
							if(cache.size() == cacheSize) cache.remove(0);
							cache.add(cities[j].toUpperCase());
						
					    }
					
				}

				return answer;

			}
	}
}
