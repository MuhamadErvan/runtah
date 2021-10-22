#include <iostream>
using namespace std;
int main() {
    int x = 5;
for (int i = 0; i < x; i++){
    for (int j = x; j > i; j--) {
        cout << j;
        }
        cout << "\n";
    }
}
