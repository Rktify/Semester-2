#include <iostream>
using namespace std;

int main(){
    int size;
    cout << "Enter the amount of contacts you want to add: " << endl;
    cin >> size;

    string names;
    struct infor{
        char name[30];
        int phNum;
        string birthday;
        int age;
    };
    infor contact[size];
    int t = 1;
    while(t == 1){
        int choice;
        cout << " " << endl;
        cout << "===CONTACT BOOK===" << endl;
        cout << "1. Add Contact"<< endl;
        cout << "2. Delete a Contact"<< endl;
        cout << "3. Search a Contact"<< endl;
        cout << "4. Exit"<< endl;

        cout << "What is your choice? : " << endl;
        cin >> choice;

        if(choice == 1){
            int index = 1;
            while (index < size){
                cout << " " << endl;
                cout << "Name : " << endl;
                cin >> contact[index].name;
                cout << "Phone number : " << endl;
                cin >> contact[index].phNum;
                cout << "Birth year : " << endl;
                cin >> contact[index].birthday;
                cout << "Age : " << endl;
                cin >> contact[index].age;
                index++;
            }
        }
        else if(choice == 2){

            cout << "===DELETING CONTACT===" << endl;
            cout << "Enter name : " << endl;
            cin >> names;
            for(int i = 0;i < size; i++){
                if(names == contact[i].name){
                    contact[i] = contact[i+1];
                }
            }
        }
        else if(choice == 3){
            cout << "===SEARCHING CONTACT===" << endl;
            cout << "Enter name : " << endl;
            cin >> names;
            for(int i = 0;i < size; i++){
                if(names == contact[i].name){
                    cout << " " << endl;
                    cout << "Name : " << contact[i].name << endl;
                    cout << "Number : " << contact[i].phNum << endl;
                    cout << "Birth year : " << contact[i].birthday << endl;
                    cout << "Age : " << contact[i].age << endl;
                    cout << " " << endl;
                }
            }
        }
        else if(choice == 4){
            t = 0;
        }

        else{
            cout << "Please re-enter the correct option";
        }
    }
}
