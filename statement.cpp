#include <string>
#include <iostream>

using namespace std;
int main() {
    string input;

    while( true )
    {
        cout << "1 + 1 berapa?" << endl;
        cin >> input;
        if( input == "2" )
        {
            cout << "Bener" << endl;
			break;
        }
        else
        {
            cout << "Salah blokk" << endl;
        }
    }

    return 0;
}
