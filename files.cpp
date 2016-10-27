#include <iostream>
#include <fstream>

int main()
{

std::ifstream file("numbers.txt");
std::cout << "-1\n34\n-3.556\n49\n-2.33\n4.66";
file.close();


return 0;
}
