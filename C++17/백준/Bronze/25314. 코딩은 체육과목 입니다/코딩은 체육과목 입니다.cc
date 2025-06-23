#include<iostream>
using namespace std;

int main() {
	int N, M;
	cin >> N;
	M = N / 4;
	if (N % 4 != 0) {
		M++;
	}
	for (int i = 1; i <= M; i++) {
		cout << "long" << " ";
	}
	cout << "int";
}