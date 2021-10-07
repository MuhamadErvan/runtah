#include <iostream>
using namespace std;

int main() {
    int x = 10;
        if((x < 100) & (x > 90)){
        cout << "A";
    } else
        if((x < 100) & (x > 80)){
        cout << "B";
    } else
        if((x < 100) & (x > 70)){
        cout << "C";
    } else
        if((x < 100) & (x > 60)){
        cout << "D";
    } else
        cout << "Failed!";
    return 0;
}