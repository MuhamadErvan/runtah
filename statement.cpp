#include <string>
#include <iostream>

int main() {
    std::string input;

    while( true )
    {
        std::cout << "1 + 1 berapa?" << std::endl;
        std::cin >> input;
        if( input == "2" )
        {
            std::cout << "Bener";
			break;
        }
        else
        {
            std::cout << "Salah blokk" << std::endl;
        }
    }

    return 0;
}
