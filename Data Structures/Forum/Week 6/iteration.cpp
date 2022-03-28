#include <iostream>
using namespace std;
int main() {
    int factorial, x = 1;
    cout << "Enter a number: ";
    cin >> factorial;
    if (factorial >= 1){
        for(int i = 1; i <= factorial; i++){
            x = x * i;
        }
    }
    else{
        x = 1;
    }

    cout << "Factorial of " << factorial << " is " << x;

}
