import java.util.*;

class BestAlbumn { 
	static int[] answer = new int[10000];
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		BestAlbumn so = new BestAlbumn();
		so.solution(genres, plays);
		for(int i=0;i<answer.length;i++)
			System.out.print(answer[i]+" ");
	}
	public int[] solution(String[] genres, int[] plays) {
		BestAlbumn so = new BestAlbumn();
		Map<String, Integer> map = new HashMap<String, Integer>();
		//Map<Integer, Integer> inner = new HashMap<Integer, Integer>();
		//int[] answer = new int[10000];
		//ArrayList<Integer> numbers = new ArrayList<>();
		int sorted[][] = new int[100][100];
		int row = 0, col = 0;
		int co = 0;
		for (int i = 0; i < genres.length; i++) {
			map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
		}
		Iterator it = sortByValue(map).iterator();
		while (it.hasNext()) {
			col = 0;
			String genre = (String) it.next();
			for (int i = 0; i < genres.length; i++) {
				if (genres[i].equals(genre)) {
					sorted[row][col] = i;
					col++;
				}
			}
			row++;
		}
		
		System.out.println(sorted[i][j]);
		for (int i = 0; i < sorted.length; i++) {
			Map<Integer, Integer> inner = new HashMap<Integer, Integer>();
			for (int j = 0; j < sorted[i].length; j++) {
				inner.put(sorted[i][j], plays[sorted[i][j]]);
			}
			it = sortByValue(inner).iterator();
			int count = 0;
			while (it.hasNext()) {
				if (count == 2)
					break;
				int temp = ((Integer) it.next()).intValue(); // 이거 의심
				answer[co] = temp;
				//numbers.add(temp);
				count++;
				co++;
			}
			inner.clear();
		}

		return answer;
	}

	public static List sortByValue(final Map map) {

		List<String> list = new ArrayList();

		list.addAll(map.keySet());

		Collections.sort(list, new Comparator() {

			public int compare(Object o1, Object o2) {

				Object v1 = map.get(o1);

				Object v2 = map.get(o2);

				return ((Comparable) v2).compareTo(v1);

			}

		});

		Collections.reverse(list); // 주석시 오름차순

		return list;

	}

}