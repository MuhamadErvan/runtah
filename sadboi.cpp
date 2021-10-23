#include <string>
#include <iostream>

using namespace std;
int main() {
    string input;

    while( true )
    {
        cout << "Does she love you? 'yes/no'" << endl;
        cin >> input;
        if( input == "yes" ) {
            cout << "Yay!" << endl;
          break;
        } else if ( input == "no" ) {
            cout << ":)" << endl;
          break;
        } else {
        cout << "Oops, try again." << endl;
        }
    }
     return 0;
}
