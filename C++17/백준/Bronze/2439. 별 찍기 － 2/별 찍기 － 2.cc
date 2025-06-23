#include <iostream>
using namespace std;
 
int main()
{
	int T;
	cin >> T;
	for (int j = 1; j <= T; j++) {
		for (int y = 1; y <= T - j; y++) {
			cout << " ";
		}
		for (int i = 1; i <= j; i++) {
			cout << "*";
		}
		cout << endl;
	}
}