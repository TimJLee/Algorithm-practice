#include <iostream> 
#include <vector> 
#include <algorithm> 
#include <functional> 
#include <queue>
using namespace std; 
int main() { 
ios_base::sync_with_stdio(false);
cin.tie(NULL);
int n, x;
priority_queue<int, vector<int>, greater<int>> pq; 
cin >> n; 
for (int i = 0; i < n*n; i++) { 
	cin >> x; 
	if (pq.size() < n) pq.push(x); 
	else { 
		if (pq.top() < x) { 
			pq.pop(); 
			pq.push(x); 
		} 
	} 
} 
cout << pq.top() << '\n'; 
return 0; 
}
