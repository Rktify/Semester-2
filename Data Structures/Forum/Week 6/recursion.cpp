#include <iostream>
using namespace std;

int factorial(int n) {
    if (n > 1) {
        return n * factorial(n - 1);
    } else {
        return 1;
    }
}

int main() {
    int in, out;

    cout << "Enter a number: ";
    cin >> in;

    out = factorial(in);
    cout << "The factorial is " << out;
}

