#include <iostream>
using namespace std;
int x, out, inc, loop;

int main(){
	cout << "Enter a starting number: ";
	cin >> x;
    cout << "Enter an increment: ";
    cin >> inc;
    cout << "How many times do you want to increment it?: ";
    cin >> loop;

    int out = x;
	for(int i = 1; i <= loop; i++){
		out += inc;
	}
	cout << "Starting value is " << x << endl;
    cout << "End value is " << out;
}
