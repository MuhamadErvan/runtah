#include <iostream>
 
using namespace std;
 
int main() {
	int i,j,n;
	n = 5;
	for (i=1;i<=n;i++) {
		for (j=i;j<=n;j++) {
			cout << j;
		}
		cout << endl;
	}

	for (i=1; i<=n; i++) {
		for (j=1; j<=i; j++) {
			cout << j;
		}
		cout << endl;
	}
 
    return 0;
}
