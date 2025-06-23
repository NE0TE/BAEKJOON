#include<iostream>
using namespace std;

int main() {
	int A, B, C;
	cin >> A >> B;
	cin >> C;
	B = B + C;
	for (int i = 0; i = B / 60; i++) {
		if (B >= 60) {
			A++;
			B = B - 60;
		}
	}
	if (A >= 24) {
		A = A - 24;
	}
	cout << A << " " << B;
}