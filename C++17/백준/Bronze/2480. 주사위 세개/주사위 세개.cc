#include<iostream>
using namespace std;

int main() {
	int A, B, C;
	cin >> A >> B >> C;
	if (A == B && B == C && A == C)
		cout << 10000 + A * 1000;
	else if (A == B || A == C)
		cout << 1000 + A * 100;
	else if (B == C)
		cout << 1000 + B * 100;
	else {
		int i = A;
		if (i < B)
			i = B;
		if (i < C)
			i = C;
		cout << i * 100;
	}
}