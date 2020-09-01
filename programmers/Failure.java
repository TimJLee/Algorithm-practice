import java.util.*;

class Pair {
	int index;
	double failure;

	Pair(int index, double failure) {
		this.index = index;
		this.failure = failure;
	}

	public double getFailure() {
		return failure;
	}

	public int getIndex() {
		return index;
	}
}

class Failure {

	public int[] solution(int N, int[] stages) {
		Map<Integer, Integer> hs = new HashMap<>();
		int[] answer = new int[N]; // 내림차순 한거 넣는 곳
		List<Pair> li = new ArrayList<>(); // 실패율

		for (int i = 0; i < stages.length; i++) {
			hs.put(stages[i], hs.getOrDefault(stages[i], 0)+1);
		}
		for (int i = 0; i < N; i++) {
			li.add(new Pair(i + 1, getFailure(i + 1, hs)));
		}
        //for(Pair a : li)
         //   System.out.println(a.getFailure());
		Collections.sort(li, (o1, o2) -> Double.compare(o2.getFailure(), o1.getFailure()));

		int size = 0;
		for (Pair i : li)
			answer[size++] = i.getIndex();
        //for(int a : answer)
        //    System.out.print(a+" ");
		return answer;
	}

	public double getFailure(int num, Map<Integer,Integer> hs) {
		int b = 0; // a/b
		int a = hs.getOrDefault(num,0); // 분자값
        //System.out.println(a);
        if(a==0) return 0;
        for(int i : hs.keySet()){
            if ((int) i >= num)
				b += (int)(hs.get(i));
        }
        /*
		Iterator it = hs.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			if ((int) pair.getKey() >= num)
				b += (int)(pair.getValue());
		}
        */
        //System.out.println(b);
        if(b==0) return 0;
		return a / (double)b;

	}

}